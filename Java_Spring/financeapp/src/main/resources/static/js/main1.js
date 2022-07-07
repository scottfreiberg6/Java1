renderSources=()=>{
	fetch("http://locahost:8080/api/income/user")
	.then(res=>res.json())
	.then(expenses=>{
		let tbody=document.getElementById("userincome");
		
		for(let expense of expenses)
		{
			let tr=document.createElement("tr");
			
			let date=document.createElement("td");
			data.innerText=expense.date;
			tr.appendChild(date);
			let name=document.createElement("td");
			data.innerText=expense.name;
			tr.appendChild(name);
			let amount=document.createElement("td");
			data.innerText=expense.amount;
			tr.appendChild(amount);
			let source=document.createElement("td");
			data.innerText=expense.source;
			tr.appendChild(source);

			
			tbody.appendChild(tr);
		}
	})
	.catch(e=>console.log(e))
}

window.onload=function(){
    fetch("http://localhost:8080/api/income")
        .then(res=>res.json())
            .then(res=>{
    
    var data1 = {
        labels: [],
        datasets: [
          {
            label: "Income",
            data: [],
            backgroundColor: [
                                "rgba(255, 99, 132, 0.6)",
                                "rgba(54, 162, 235, 0.6)",
                                "rgba(255, 206, 86, 0.6)",
                                "rgba(75, 192, 192, 0.6)",
                                "rgba(153, 102, 255, 0.6)",
                                "rgba(255, 159, 64, 0.6)",
                                "rgba(255, 99, 132, 0.6)",
                                "rgba(54, 162, 235, 0.6)",
                                "rgba(255, 206, 86, 0.6)",
                                "rgba(75, 192, 192, 0.6)",
                                "rgba(153, 102, 255, 0.6)",
                            ],
            borderColor: [
              "#CDA776",
              "#989898",
              "#CB252B",
              "#E39371",
              "#1D7A46"
            ],
            borderWidth: [1, 1, 1, 1, 1]
          }
        ]
      };
      
    var options = {
      responsive: true,
      title: {
        display: true,
        position: "top",
        text: "Income",
        fontSize: 18,
        fontColor: "#111"
      },
      legend: {
        display: true,
        position: "bottom",
        labels: {
          fontColor: "#333",
          fontSize: 16
        }
      }
    };
    for (let i = 0; i < res.length; i++) {
                          data1.labels.push(res[i].source)
                          data1.datasets[0].data.push(res[i].amount)
                          
                    }
                    
        var ctx = document.getElementById("canvas").getContext("2d")            
      var chart1 = new Chart(ctx, {
    type: "pie",
    data: data1,
    options: options
  });
}
)
	renderSources();
}  