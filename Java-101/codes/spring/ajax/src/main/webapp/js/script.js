var xhr;

function getEmployeeDetails(empno){
	//alert(empno);
	xhr = new XMLHttpRequest();
	
	xhr.open("GET", "search?eno="+empno, true);
	
	xhr.onreadystatechange=stateChanged;
	
	xhr.send();
}

function stateChanged(){
	var ename = 'NO MATCH';
	var esal = 'NO MATCH';
	
	if(xhr.readyState==4 && xhr.status==200){
		var responseText = xhr.responseText;
		if(responseText.length > 0){
			var empObj = JSON.parse(responseText);
			ename = empObj.emp_name;
			esal = empObj.emp_sal;
		}
		
		document.getElementById("empname").innerHTML=ename;
		document.getElementById("empsal").innerText=esal;
	}
}