window.onload = function() {
	fetch("http://localhost:8080/api/barexpense")
	.then(res=>res.json())
		.then(res=>{
	  	   		
  				
          	  

			var barChartData = {
			  labels: [],
			  datasets: [
			    {
			      label: "Expenses",
			      backgroundColor: "pink",
			      borderColor: "red",
			      borderWidth: 1,
			      data: [],
			    },
			    {
			      label: "Income",
			      backgroundColor: "lightblue",
			      borderColor: "blue",
			      borderWidth: 1,
			      data: [],
			    },
			  
			  ]
			};
			var chartOptions = {
			  responsive: true,
			  legend: {
			    position: "top"
			  },
			  title: {
			    display: true,
			    text: "Income/Expense Bar Chart"
			  },
			  scales: {
			    yAxes: [{
			      ticks: {
			        beginAtZero: true
			      }
			    }]
			  }
			}	
				for (let i = 0; i < res.length; i++) {
                  	barChartData.labels.push(res[i].month)
                  	barChartData.datasets[0].data.push(res[i].total)
                  	barChartData.datasets[1].data.push(res[i].income)
                }
	  var ctx = document.getElementById("canvas").getContext("2d");
		  window.myBar = new Chart(ctx, {
		    type: "bar",
		    data: barChartData,
		    options: chartOptions
  		});	
	})

};
