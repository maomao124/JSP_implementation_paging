package mao.jsp_implementation_paging;

/**
 * Project name(项目名称)：JSP_implementation_paging
 * Package(包名): mao.jsp_implementation_paging
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 13:16
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student
{
    private int no;             //学号
    private String name;
    private String sex;
    private int age;

    public Student()
    {

    }

    public int getNo()
    {
        return no;
    }

    public void setNo(int no)
    {
        if (no >= 0)
        {
            this.no = no;
        }
        else
        {
            this.no = 0;
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age >= 0 && age <= 100)
        {
            this.age = age;
        }
        else if (age > 100)
        {
            this.age = 100;
        }
        else
        {
            this.age = 0;
        }
    }
}
