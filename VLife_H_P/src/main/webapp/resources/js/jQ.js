function summonTitleArea() {

	var sm2 = false;
	$("#siteMain2").mouseenter(function() {
		if (!sm2) {
			$("#siteMain2").css("right", "40px");
		} else {
			$("#siteMain2").css("right", "-245px");
		}
		sm2 = !sm2;
	});
	
	/*
	 * var sm = false; $("#siteMain").mouseenter(function() { if (!sm) {
	 * $("#siteMain").css("font-size","65pt"); } else {
	 * $("#siteMain").css("font-size","55pt"); } sm = !sm; });
	 */

	$("#siteMain").mouseenter(function() {
		$("#siteMain").css("font-size", "62pt");
	});
	$("#siteMain").mouseleave(function() {
		$("#siteMain").css("font-size", "55pt");
	});

	
	
	
	$("#joinPageArea input").mouseenter(function() {
		$(this).css("background-color", "#BDBDBD");
	});
	$("#joinPageArea input").mouseleave(function() {
		$(this).css("background-color", "white");
	});

}

function connectSearchAddressEvent() {
	$("#joinm_addr1, #joinm_addr2").click(function() {
		new daum.Postcode({
			oncomplete : function(data) {
				$("#joinm_addr1").val(data.zonecode);
				$("#joinm_addr2").val(data.roadAddress);
			}
		}).open();
	});
}

// 아이디 쓴게 DB에 중복 되는가????

// keydown: a가 적히기 전
// keyup : a가 적힌 후
function connectIdCheckEvent() {
	$("#joinm_id").keyup(function() {
		var m_id = $(this).val();
		$.getJSON("member.search.go?m_id="+m_id, function(memberJSON) {
			//alert(JSON.stringify(memberJSON));
			//alert(memberJSON.member[0] == null);
			if(memberJSON.vmember[0] == null){
				$("#joinm_id").css("color","black");
			} else {
				$("#joinm_id").css("color","red");
			}
		});
	});
}

//join시에 아이디 유효성
function searchMember(){
		var m_id = $("#joinm_id").val();
		$.getJSON("member.search.go?m_id="+m_id, function(memberJSON) {
			//alert(JSON.stringify(memberJSON));
			//alert(memberJSON.member[0] == null);
			if (memberJSON.vmember[0] == null){
				$("#joinm_id").css("color","black");
			} else {
				$("#joinm_id").css("color","red");
			}
		});
}

function snsWriter(){
	$("#snsjQuerybutton").click(function() {
		alert("ss");
	});
	/*$("#siteMain").click(function() {
		$("#siteMain").css("font-size", "55pt");
	});*/
	
}



$(function() {
	searchMember();
	connectSearchAddressEvent();
	summonTitleArea();
	connectIdCheckEvent();
	loginGoPzone();
	snsWriter();
});
