package mao.jsp_implementation_paging;

import java.util.List;

/**
 * Project name(项目名称)：JSP_implementation_paging
 * Package(包名): mao.jsp_implementation_paging
 * Class(类名): Page
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/11
 * Time(创建时间)： 13:20
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Page
{
    // 总页数
    private int totalPageCount = 0;
    // 页面大小，即每页显示记录数
    private int pageSize = 3;
    // 记录总数
    private int totalCount;
    // 当前页码
    private int currPageNo = 1;
    // 每页网站集合
    private List<Student> studentList;

    public Page()
    {

    }

    public int getTotalPageCount()
    {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount)
    {
        if (totalPageCount >= 0)
        {
            this.totalPageCount = totalPageCount;
        }
        else
        {
            this.totalPageCount = 0;
        }
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        if (pageSize >= 0)
        {
            this.pageSize = pageSize;
        }
        else
        {
            this.pageSize = 0;
        }
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(int totalCount)
    {
        if (totalCount > 0)
        {
            this.totalCount = totalCount;
            // 计算总页数
            totalPageCount = this.totalCount % pageSize == 0 ? (this.totalCount / pageSize)
                    : (this.totalCount / pageSize + 1);
        }
    }

    public int getCurrPageNo()
    {
        return currPageNo;
    }

    public void setCurrPageNo(int currPageNo)
    {
        if (currPageNo >= 0)
        {
            this.currPageNo = currPageNo;
        }
        else
        {
            this.currPageNo = 0;
        }
    }

    public List<Student> getStudentList()
    {
        return studentList;
    }

    public void setStudentList(List<Student> studentList)
    {
        this.studentList = studentList;
    }
}
