<%@ page contentType="text/html; charset=UTF-8" import="java.util.*, chap07.*" %>

<jsp:useBean id="member" class="chap07.Member" scope="application" />

<%
	ArrayList<Member> members = new ArrayList<Member>();

	for(int i=0; i<8; i++){
		members.add(new Member("김민재" + i, "mjkim" + i + "@gmail.com"));
	}
	
	members.add(new Member("이강인", null));
	members.add(new Member("정우영", null));
	
	application.setAttribute("members", members);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>initMember.jsp</title>
</head>
<body>

	<h2>Member 빈 등록 완료</h2>
	<hr />
	
	<h4>member name: ${member.name }</h4>
	<h4>members[3] name: ${members[3].name }</h4>
	
	
</body>
</html>