package mao.jsp_implementation_paging;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：JSP_implementation_paging
 * Package(包名): mao.jsp_implementation_paging
 * Class(类名): StudentImp
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 13:28
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class StudentImp implements Stu
{
    /**
     * 连接数据库
     */
    public static Connection getConnection()
    {
        Connection connection = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "20010713");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return connection;
    }

    /**
     * 查询总条数
     */
    @Override
    public int getTotalCount()
    {
        int count = 0;
        try
        {
            Connection connection = getConnection();
            String sql = "SELECT COUNT(no) FROM information";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            count = resultSet.getInt(1);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public List<Student> getPageStudentList(int pageNo, int pageSize)
    {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        List<Student> list = new ArrayList<>();
        try
        {
            Connection connection = getConnection();
            String sql = "SELECT * FROM information LIMIT"+" " + (pageNo - 1) * pageSize + "," + pageSize;
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(sql);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
                Student student = new Student();
                student.setNo(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setSex(resultSet.getString(3));
                student.setAge(resultSet.getInt(4));
                list.add(student);
            }
            connection.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return list;
    }
}
