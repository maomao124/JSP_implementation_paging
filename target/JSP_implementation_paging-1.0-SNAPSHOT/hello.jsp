<%@ page import="mao.jsp_implementation_paging.StudentImp" %>
<%@ page import="mao.jsp_implementation_paging.Page" %>
<%@ page import="mao.jsp_implementation_paging.Student" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：JSP_implementation_paging
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/1/11
  Time(创建时间)： 13:15
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    StudentImp studentImp = new StudentImp();
    String pageNo = request.getParameter("page") != null ? request.getParameter("page") : "1";
    int currPageNo = Integer.parseInt(pageNo);
    Page p = new Page();
    p.setCurrPageNo(currPageNo);
    p.setPageSize(3);
    p.setTotalCount(studentImp.getTotalCount());
    List<Student> studentList = studentImp.getPageStudentList(p.getCurrPageNo(), p.getPageSize());
    p.setStudentList(studentList);
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter printWriter;
    printWriter=response.getWriter();
    printWriter.print("<h1>当前页面: " + currPageNo + "</h1>");
    printWriter.print("<table border='1' cellpadding='4' width='40%'>");
    printWriter.print("<tr><th>no</th><th>name</th><th>sex</th><th>age</th></tr>");
    for (Student student : studentList)
    {
        printWriter.print("<tr><td>" + student.getNo() + "</td><td>" + student.getName() + "</td><td>" + student.getSex() + "</td><td>"
                + student.getAge() + "</td></tr>");
    }
    printWriter.print("</table>");
    for (int i = 1; i <= p.getTotalPageCount(); i++)
    {
%>
<a href="hello.jsp?page=<%=  i%>"><%=  i%>
</a>
<%
    }
%>

</body>
</html>
