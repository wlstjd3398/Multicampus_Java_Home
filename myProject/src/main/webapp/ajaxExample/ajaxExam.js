let xhr = new XMLHttpRequest();

function ajaxHandler(){
	// 서버의 응답이 성공적이라는 것을 보장할수없다, 그래서 올바른 응답이라는 것을 확인할필요가 있다
	if(xhr.readyState === 4 && xhr.status === 200){
		let personsObj = JSON.parse(xhr.responseText); // 서버의 응답은 xhr.responseText
		
		let persons = '';
		
		for(let i in personsObj){
			persons += '<h4>이름: ' + personsObj[i].name + ', 성별: ' + personsObj[i].gender +
						', 나이: ' + personsObj[i].age + ', 분야: ' + personsObj[i].field + '</h4>';
			
		}
		
		document.querySelector('#persons').innerHTML = persons;
	}
}

function sendHandler(){
	xhr.addEventListener('load', ajaxHandler); // 보내기전에 응답이 왔을때 미리 처리
	
	xhr.open('GET', 'ajaxJson.jsp', true); // ajax 요청 준비하는 메서드 open()
	// get방식으로 persons.json요청, true 비동기방식 사용하겠다
	
	xhr.send(); // ajax 요청을 보내는 메서드 send()
}


function clearHandler(){
	document.querySelector('#persons').innerHTML = '';
}

function init(){
	document.querySelector('#send').addEventListener('click', sendHandler);
	document.querySelector('#clear').addEventListener('click', clearHandler);
}


window.addEventListener('load', init);