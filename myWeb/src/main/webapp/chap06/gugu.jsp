<%@ page contentType="text/html; charset=UTF-8" %>
<%
	String gugu = "<table>";

	for(int num=0; num<=9; num++){
		gugu += "<tr>";
		
		for(int dan=2; dan<=9; dan++){
			if(num == 0){
				gugu += "<th> [ " + dan + "단 ]</th>";
			}else{
				gugu += "<td>" + dan + " * " + num + " = " + (dan * num) + "</td>";
			}
			
		}
		
		gugu += "</tr>";
	}
	
	gugu += "</table>";
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gugu.jsp</title>
	<style>
	table, td, th {
		border: 2px solid gray;
		border-collapse: collapse;
	}
	th, td{
		padding: 5px;
		text-align: center;
	}
	</style>
</head>
<body>

	<h2>수평 구구단</h2>
	<hr />
	
	<h4>이 곳에 수평 구구단 결과를 출력하는 코드를 작성하세요</h4>
	
	<%= gugu %>
	
</body>
</html>