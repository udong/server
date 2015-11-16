<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>강의 갱신</title>
</head>
<body>
<h1>강의 갱신</h1>
<h1>${s1}</h1>
 <spring:eval var="serverType" expression="@config['key']">
    <c:if test="${ serverType == 'value' }">
        로컬임
    </c:if>
    </spring:eval>
<spring:eval expression="@config['key']"> </spring:eval>
<spring:message code="msg.test1"> </spring:message>

<iframe src="http://weather.naver.com/rgn/townWetr.nhn" width="520px" style="height:800px;" scrolling="yes" frameborder="0"></iframe>

<input type="submit" value="갱신" />

</form>
</body>
</html>