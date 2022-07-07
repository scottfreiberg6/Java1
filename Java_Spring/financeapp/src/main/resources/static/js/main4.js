window.onload=function(){
    fetch("http://localhost:8080/api/expense")
        .then(res=>res.json())
            .then(res=>{
                  console.log(res)
    
    var data1 = {
        labels: [],
        datasets: [
          {
            label: "Expense",
            data: [],
            backgroundColor: [
              "#DEB887",
              "#A9A9A9",
              "#DC143C",
              "#F4A460",
              "#2E8B57"
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
        text: "Pie Chart",
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
                          data1.labels.push(res[i].category)
                          data1.datasets[0].data.push(res[i].amount)
                          
                    }
                    
        var ctx = document.getElementById("canvas")            
      var chart1 = new Chart(ctx, {
    type: "pie",
    data: data1,
    options: options
  });
}
)
}  