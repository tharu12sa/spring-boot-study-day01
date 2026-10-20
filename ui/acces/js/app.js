function loadCustomerImfromation(){
    fetch("http://localhost:8080/customer")
        .then(res=>res.json())
            .then(data =>{
                console.log(data);
                populateCustomeList(data);
                
            })
}



function populateCustomeList(data){

    let tbodyElement = document.getElementById("tbodyCustomerview");
    let body="";
    data.forEach(element => {
        body=body+`<tr><td>${element.name}</td>
                    <td>${element.contacNumber}</td></tr>`
        
    });

    tbodyElement.innerHTML = body;
}

loadCustomerImfromation();