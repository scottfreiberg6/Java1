window.onload=function(){
    fetch("http://localhost:8080/api/expense")
        .then(res=>res.json())
            .then(res=>{
    
    var data1 = {
        labels: [],
        datasets: [
          {
            label: "Expense",
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
      showTooltips: true,
      title: {
        display: true,
        position: "top",
        text: "Expense",
        fontSize: 18,
        fontColor: "#111"
      },
      legend: {
        display: true,
        maintainAspectRatio: false,
        position: "center",
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
                    
        var ctx = document.getElementById("canvas").getContext("2d")         
      var chart1 = new Chart(ctx, {
    type: "pie",
    data: data1,
    options: options
  });
}
)

}  