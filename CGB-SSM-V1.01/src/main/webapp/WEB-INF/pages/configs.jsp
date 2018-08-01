<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>Config Page</h1>
    <h1><%=new java.util.Date() %></h1>
    <div>
    <button onclick="doQuery()">Query Configs</button>
    </div>
    <br/>
    <div>
      <table border="1" width="100%" cellpadding="1" cellspacing="0">
         <tr>
            <th>id</th>
            <th>name</th>
            <th>value</th>
         </tr>
         <c:forEach items="${configs}" var="item">
          <tr>
            <td>${item.id}</td>
            <td>${item.name}</td>
            <td>${item.value}</td>
          </tr>
         </c:forEach>
      </table>
    </div>
    <script type="text/javascript">
        function doQuery(){
        	location.href='doFindPageConfigs.do?pageCurrent=1';
        }
    </script>
</body>
</html>







