function ioginCheck(){
	var m_id = document.loginForm.m_id;
	var m_pw = document.loginForm.m_pw;
	
	if (noWords(m_id)) {
		alert("아이디를 입력해주세요.");
		m_id.value="";
		m_id.focus();
		return false;
	} else if (noWords(m_pw)) {
		alert("비밀번호를 입력해주세요.");
		m_pw.value="";
		m_pw.focus();
		return false;
	}
	return true;
}

function joinCheckff(){
	var m_id = document.joinForm.m_id;
	var m_pw = document.joinForm.m_pw;
	var m_pwck = document.joinForm.m_pwck;
	var m_name = document.joinForm.m_name;
	var m_addr = document.joinForm.m_addr;
	var m_photo = document.joinForm.m_photo;
	
	if (noWords(m_id)||includeK(m_id)||$("#joinm_id").css("color") =="rgb(255, 0, 0)") {
		alert("아이디는 영문+숫자 조합으로만 가능합니다.");
		m_id.value="";
		m_id.focus();
		return false;
	} else if (noWords(m_pw)||includeK(m_pw)) {
		alert("비밀번호는 영문+숫자 조합으로만 가능합니다.");
		m_pw.value="";
		return false;
	} else if (notMatch(m_pw, m_pwck)) {
		alert("비밀번호를 입력해주세요.");
		m_pwck.value="";
		m_pwck.focus();
		return false;
	} else if (noWords(m_name)) {
		alert("이름은 한글,영문 으로 입력가능합니다.");
		m_name.value="";
		m_name.focus();
		return false;
	} else if (noWords(m_addr)||writeNaN(m_addr)) {
		alert("주소와 우편번호를 입력해주세요.");
		m_addr.value="";
		m_addr.focus();
		return false;
	} else if (noWords(m_addr)||noWords(m_addr2)||noWords(m_addr3)){
		alert("주소와 우편번호를 입력해주세요.");
		m_addr.value="";
		m_addr2.value="";
		m_addr3.value="";
		m_addr.focus();
		
	} 	else if (noWords(m_photo)
			|| (uploadNotEquals(m_photo, "png")
					&& uploadNotEquals(m_photo, "gif")
					&& uploadNotEquals(m_photo, "jpg") && uploadNotEquals(
					m_photo, "bmp"))) {
		alert("photo?");
		m_photo.value = "";
		m_photo.focus();
		return false;
	}
	return true;

}



