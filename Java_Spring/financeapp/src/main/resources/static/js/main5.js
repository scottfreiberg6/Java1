window.onload=function(){

    renderCategories=()=>{
	fetch("http://locahost:8080/api/expense/user")
	.then(res=>res.json())
	.then(expenses=>{
		let tbody=document.getElementById("userExpenses");
		
		for(let expense of expenses)
		{
			let tr=document.createElement("tr");
			
			let date=document.createElement("td");
			data.innerText=expense.date;
			tr.appendChild(date);
			let name=document.createElement("td");
			name.innerText=expense.name;
			tr.appendChild(name);
			let amount=document.createElement("td");
			amount.innerText=expense.amount;
			tr.appendChild(amount);
			let category=document.createElement("td");
			category.innerText=expense.category;
			tr.appendChild(category);
			let edit=document.createElement("a")
			edit.innerText="Edit"
			edit.href=`/expense/${expense.id}/edit`
			tr.appendChild(edit);
			let del=document.createElement("form")
			del.action=`/expense/delete/${expense.id}`
			tr.appendChild(del);
			let deletebtn=document.createElement("input")
			deletebtn.value="Delete"
			deletebtn.type="submit"
			del.appendChild(deletebtn)
			tbody.appendChild(tr);
		}
	})
	.catch(e=>console.log(e))
}


}