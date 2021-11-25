<%--
  Created by IntelliJ IDEA.
  User: tanghao
  Date: 2021/10/23
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息管理系统-登录页面</title>
    <style>
        #cont div {
            text-align: center;
            padding: 15px;
        }
        #cont div:last-child input:first-child{
            margin-right: 30px;
        }
        #cont div:last-child input:last-child{
            margin-left: 30px;
        }
    </style>
</head>
<body>
<divstyle="margin-top: 150px">
    <jsp:include page="top.jsp"/>
    <div id="cont">
      <form action="<%= request.getContextPath()%>/trueLogin" method="post">
          <div>
              <label for="userName">
                   用户名：
              </label>
              <input type="text" name="userName" id="userName"/>
          </div>
          <div>
              <label for="userName">
                  用户名：
                  <input type="password" name="pwd"/>
              </label>
          </div>
          <div>
              <input type="submit" value="登录"/>
              <input type="reset" value="重置"/>

          </div>
      </form>
    </div>
    <jsp:include page="bottom.jsp"/>
</div>
</body>
</html>
