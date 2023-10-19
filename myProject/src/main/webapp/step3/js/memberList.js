let xhr = new XMLHttpRequest();

// listTable의 내용을 채워주는데 json문자열을 객체로 변환
function parseMemberJson(membersJsonStr){
	let members = JSON.parse(membersJsonStr);
	let membersTr = '<tr><th>번호</th><th>아이디</th><th>이름</th>'
					+ '<th>등록일</th><th>회원정보수정</th></tr>';
	
	// parseInt(i) + 1 말고 ((i * 1) + 1)도 가능
	for(let i in members){
		membersTr += '<tr><td>' + ((i * 1) + 1) + '</td><td>' + members[i].id
					 + '</td><td>' + members[i].name + '</td><td>' 
					 + members[i].regdate + '</th><th><button id="' 
					 + members[i].id + '">수정</button></td></tr>';
	}
	
	return membersTr;
}

function ajaxMemberListHandler(){
	if(xhr.readyState === 4 && xhr.status === 200){
		let membersTr = parseMemberJson(xhr.responseText);
		document.querySelector('#listTable').innerHTML = membersTr;
	}
	
}

function ajaxMemberList(){
	xhr.onload = ajaxMemberListHandler;
	
	xhr.open('GET', '/myProject/step3/ajaxMemberController.jsp?command=list', true);
	// get방식, 비동기로 해당경로로 요청보냄
	xhr.send();
	// 응답을 보내면 event를 발생시킴 -> load or readystate 두가지 방법이 있었음
}

function ajaxMemberInsertHandler(){
	if(xhr.readyState === 4 && xhr.status === 200){
		let resObj = JSON.parse(xhr.responseText);
		
		// js에서 false를 의미하는 값 5개(0, '', null, undefined, NAN)으로 boolean으로 if확인
		if(resObj.result){
			document.querySelector('#msg').innerHTML = '';
			ajaxMemberList();
			
		}else if(resObj.msg){
			document.querySelector('#msg').innerHTML = resObj.msg;
		}
		
	}

}

function ajaxMemberInsert(id, passwd, name){
	xhr.onload = ajaxMemberInsertHandler;
	
	let param = 'command=insert&id=' + id + '&passwd=' + passwd + '&name=' + name;
	
	xhr.open('POST', '/myProject/step3/ajaxMemberController.jsp', true);
	// post방식으로 요청보낼때 url뒤에 파라미터를 가져가지 않음 (request영역의 body영역으로 command=insert가 이동함)
	
	
	xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
	// memberList.html에서 enctype="application/x-www-form-urlencoded"을 사용하지않고
	// js에서 추가해서 post방식일때 파라미터를 가져오게 한다
	xhr.send(param);
}

function submitInsertHandler(event){
	event.preventDefault(); 
	// 디폴트 이벤트 중지시키기위해서 event를 매개변수로 설정하여 preventDefault로 디폴트 이벤트 중지시킴
	
	let id  = document.querySelector('#id');
	let passwd  = document.querySelector('#passwd');
	let repasswd  = document.querySelector('#repasswd');
	let name  = document.querySelector('#name');
	let msg = '';
	let inputCheck = true;
	
	if(passwd.value.length < 4){
		msg = '비밀번호는 4글자 이상이어야 합니다.';
		inputCheck = false;
		
	}else if(passwd.value !== repasswd.value){
		msg = '비밀번호와 비밀번호 확인은 같은 값이어야 합니다.';
		inputCheck = false;
		
	}else if(name.value.length  < 2){
		msg = '이름은 2글자 이상이어야 합니다.';
		inputCheck = false;
	}
	
	if(inputCheck){
		ajaxMemberInsert(id.value, passwd.value, name.value);
		
	}else{
		document.querySelector('#msg').innerHTML = msg;
		
	}
	
}

function modifyHandler(event){
	localStorage.setItem('userId', event.target.getAttribute('id'));
	location.href = 'memberModify.html';
	
}

function init(){
	document.querySelector('#insertMember').addEventListener('submit', submitInsertHandler);
	document.querySelector('#listTable').addEventListener('click', modifyHandler);
	
	ajaxMemberList();
}
window.addEventListener('load', init);