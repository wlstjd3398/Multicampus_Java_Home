<%@ page contentType="application/json; charset=UTF-8"%>
<%--항상 응답이 json으로 보내어질때 contentType="application/json;으로 수정 --%>

<jsp:useBean id="jsonsPersons" class="ajaxExample.JsonPersons" />

<%
	out.println(jsonsPersons.getPersons());
	out.flush(); // 임의로 출력버퍼에게 보내고 버퍼를 비움
%>