let xhr = new XMLHttpRequest();
function parseMembersJson(membersJsonStr) {
	let members = JSON.parse(membersJsonStr);
	let membersTr = '<tr><th>번호</th><th>아이디</th><th>이름</th>'+
						'<th>등록일</th><th>회원정보수정</th></tr>';
	
	for(let i in members) {
		membersTr += '<tr><td>' + ((i * 1) + 1) + '</td><td>' + members[i].id +
					'</td><td>' + members[i].name + '</td><td>' + members[i].regdate +
					'</td><td><button id="' + members[i].id + '">수정</button></td></tr>';
	
	}
	
	return membersTr;
}
function ajaxMemberListHandler() {
	if(xhr.readyState === 4 && xhr.status === 200) {
		let membersTr = parseMembersJson(xhr.responseText);
		document.querySelector('#listTable').innerHTML = membersTr;
	}
}
function ajaxMemberList() {
	xhr.addEventListener('load', ajaxMemberListHandler);
	
	xhr.open('GET', '/myProject/step3/ajaxMemberController.jsp?command=list', true);
	xhr.send();
}
function ajaxMemberInsertHandler() {
	if(xhr.readyState === 4 && xhr.status === 200) {
		let resObj = JSON.parse(xhr.responseText);
		
		if(resObj.result) {
			ajaxMemberList();
		}
		else if(resObj.msg) {
			document.querySelector('#msg').innerHTML = resObj.msg;
		}
	}
}
function ajaxMemberInsert(id, passwd, name){
	xhr.addEventListener('load', ajaxMemberInsertHandler);
	
	let param = 'command=insert&id=' + id + '&passwd=' + passwd + '&name=' + name;
	xhr.open('POST', '/myProject/step3/ajaxMemberController.jsp', true);
	xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	xhr.send(param);
}
function submitInsertHandler(event){
	event.preventDefault();
	
	let id = document.querySelector('#id');
	let passwd = document.querySelector('#passwd');
	let repasswd = document.querySelector('#repasswd');
	let name = document.querySelector('#name');
	let msg = '';
	let inputCheck = true;
	
	if(passwd.value.length < 4 ){
		msg =  '비밀번호는 4글자 이상이어야 합니다.';
		inputCheck = false;
	}
	else if(passwd.value !== repasswd.value) {
		msg = '비밀번호와 비밀번호 확인은 같은 값이어야 합니다.';
		inputCheck = false;
	}
	else if(name.value.length < 2) {
		msg = '이름은 두 글자 이상이어야 합니다.';
		inputCheck = false;
	}
	if(inputCheck) {
		ajaxMemberInsert(id.value, passwd.value, name.value);
	}
	else {
		document.querySelector('#msg').innerHTML = msg;
	}
}
function init() {
	document.querySelector('#insertMember').addEventListener('submit', submitInsertHandler);
	
	
	ajaxMemberList();
}
window.addEventListener('load', init);