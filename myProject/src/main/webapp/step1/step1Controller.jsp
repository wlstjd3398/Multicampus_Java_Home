<%@ page contentType="text/html; charset=UTF-8" import="java.util.*, model.*"%>

<jsp:useBean id="memberDAO" class="model.MemberDAO" scope="session" />
<jsp:useBean id="memberDO" class="model.MemberDO" scope="page" />
<jsp:setProperty name="memberDO" property="*" />

<%
	String viewPath = "/WEB-INF/views/step1/";
	String command = request.getParameter("command");
	
	if(command == null || command.equals("list")){
		if(request.getMethod().equals("POST")){
			try{
				memberDAO.insertMember(memberDO);
			}catch(Exception e){
				request.setAttribute("msg", e.getMessage());
			}
			
			
		}
		request.setAttribute("memberList", memberDAO.getAllMembers());
		
		pageContext.forward(viewPath + "memberList.jsp");
	}
%>
