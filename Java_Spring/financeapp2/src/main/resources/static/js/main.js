window.onload=function(){
    fetch("http://localhost:8080/api/expense/user")
        .then(res=>res.json())
            .then(res=>{
    
    var data1 = {
        labels: [],
        datasets: [
          {
            label: "Expense",
            data: [],
            backgroundColor: ["#0074D9", "#FF4136", "#2ECC40", "#FF851B", "#7FDBFF", "#B10DC9", "#FFDC00", "#001f3f", "#39CCCC", "#01FF70", "#85144b", "#F012BE", "#3D9970", "#111111", "#AAAAAA"],
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