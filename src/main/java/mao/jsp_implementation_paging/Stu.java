package mao.jsp_implementation_paging;

import java.util.List;

/**
 * Project name(项目名称)：JSP_implementation_paging
 * Package(包名): mao.jsp_implementation_paging
 * Interface(接口名): Stu
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 13:34
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface Stu
{
    // 查询总条数
    public int getTotalCount();

    //根据起始下标和每页显示数量查询数据
    public List<Student> getPageStudentList(int pageNo, int pageSize);

}
