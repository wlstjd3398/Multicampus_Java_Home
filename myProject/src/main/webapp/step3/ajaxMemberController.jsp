<%@page import="model.JsonMember"%>
<%@ page contentType="application/json; charset=UTF-8" %>

<jsp:useBean id="memberDAO" class="model.MemberDAO" />
<jsp:useBean id="jsonMember" class="model.JsonMember" />
<jsp:useBean id="memberDO" class="model.MemberDO" />
<jsp:setProperty name="memberDO" property="*" />

<%
	jsonMember.setMemberDAO(memberDAO);
	String command = request.getParameter("command");
	if(command != null && command.equals("list")){
		out.println(jsonMember.getAllMemberJson());
		out.flush();
		
	}else if(command != null && command.equals("insert")){
		
		try{
			int rowCount = memberDAO.insertMember(memberDO);
			out.println(jsonMember.getResult(rowCount));
			
		}catch(Exception e){
			out.println(jsonMember.getMessage(e.getMessage()));
			
		}
		
		out.flush();
	
	}else if(command != null && command.equals("modify")){
		// id는 memberDO setProperty로 들어옴
		out.println(jsonMember.getMemberJson(memberDO.getId()));
		out.flush();
		
	}else if(command != null && command.equals("changePasswd")){
		int rowCount = memberDAO.changePasswd(memberDO);
		
		out.println(jsonMember.getResult(rowCount));
		out.flush();
		
	}else if(command != null && command.equals("changeGrade")){
		int rowCount = memberDAO.changeGrade(memberDO);
		
		out.println(jsonMember.getResult(rowCount));
		out.flush();
		
	}else if(command != null && command.equals("deleteMember")){
		int rowCount = memberDAO.deleteMember(memberDO.getId());
		
		out.println(jsonMember.getResult(rowCount));
		out.flush();
	}
	
	
%>