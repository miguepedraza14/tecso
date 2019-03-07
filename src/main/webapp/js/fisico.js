/**
 * 
 */
$(document).ready(function() {
//	$.get("http://localhost:8081/api/PhysicalOwner/findAll", function(data) {
//		console.log(data);
//	});

	$.ajax({
		type : 'GET',
		headers: {  'Access-Control-Allow-Origin': 'http://localhost:8080/api/' },
		crossDomain : true,
		dataType : 'jsonp',
		url : 'http://localhost:8081/api/PhysicalOwner/findAll',
		success : function() { alert("Success"); }
	});
});