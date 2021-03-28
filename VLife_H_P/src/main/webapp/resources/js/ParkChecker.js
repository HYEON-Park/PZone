//New - other - JavaScript Source File
//어떤 사이트던지 유효성 검사 때 쓸 수 있게
//한글 쓸 일 없음,,,
//최종목표는 utf-8임!!!

//부정적-----기준
// 잘못했으면  true / (잘 했을 때 true 상황도 가능함)

//<input>을 넣었을 때 ,아무것도 안썼으면 true 썼으면 false
function noWords(inputBox){
	return (!inputBox.value); 
}				//괄호() 굳이 필요없음 보기상으로 . 
// input html을 집어넣었을 때 비어있으면 true니까 걸림.

// <input>, 글자 수를 넣었을 때
// 그 글자 수보다 적으면 true, 그 글자 이상이면 false
				//유저인풋, 렝스카운트넘 > 함수돌리기
function smallNum(inputWord,lengthN){
	return(inputWord.value.length < lengthN);
}

//<input>넣었을 때
//한글,특수문자가 적혀있으면 true,없으면 false
function includeK(inputWord){
	//여기있는거만 가능하삼 ok만 쓸 수 있게 ID
	var ok ="1234567890@qwertyuioplkjhgfdsazxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM_."; 
	var iv = inputWord.value; //인풋에들어간 값value
	
	for (var i = 0; i < iv.length; i++) {
		//ok변수의 글자 내에서 없는 글자일 시 == true 틀린걸로 받음
		if (ok.indexOf(iv[i]) == -1) { //ok에 iv의 글자가 전부 하나하나 맞췄을 때 해당이 되나
			return true;				//iv[i] => iv의 i(하나,하나..)	
		}
	}
	return false; 
}

//비번이랑 체크 동일한지
//<input>*2 넣었을 때 내용이 다르면 true /같으면 false
function notMatch(input1,input2){
	return(input1.value != input2.value);
}
//1내용과 2내용이 다르면 true 같으면 false	

//<input>에 문자열세트 넣었을 때 없으면 true, 있으면 false
function notContains(input,okSet){
	//박스에 쓴 글
	var iv = input.value;
	for (var i = 0; i < okSet.length; i++) {
		if(iv.indexOf(okSet[i]) != -1){
		//-1이 아니면 == 없으면
			return false;
		}
	}
	return true;
	//없었으면 없는걸로
	
}

//isNaN형으로 만드는 거임....ㅇㅅㅇ...
//<input>넣었을 때 숫자아닌 ㅇ거 있으면 true, 숫자만 있으면 false

function writeNaN(input){		
		return isNaN(input.value);
	}

//특정파일만 사용가능하게
//<input> , 확장자 넣었을 떄
//업로드 확장자 그거 아니면true 그거면 false
//	type	pdf
//	input.value 	aaa.pdf
function uploadNotEquals(input, type){
	type="." + type;
	return (input.value.indexOf(type) != -1);
	
	}

	

