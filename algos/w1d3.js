class Node
{
    constructor(value)
    {
        this.next=undefined;
        this.value=value;
    }
};

class List
{
    constructor()
    {
        this.head=undefined;
    }

    Iterate(fn)
    {
        for(let node=this.head;node;node=node.next){fn(node.value);}
    }

    /* Determines whether the given value was found within the list */
    /* ( Returns a bool, true or false ) */
    PushFront(value)
	{
		let temp =this.head
        this.head=new Node(value)
        this.head.next=temp
        
	}
    PushBack(value)
    {
        /* Your Code Here */
        if(!this.head)
        {
            this.head=new Node(value);
            return;
        }
        for(var node=this.head;node.next;node=node.next){}
        node.next=new Node(value);
    }
    Contains(value)
    {
       let node=this.head;
         while(node){
                if(node.value==value) return true;
                node=node.next;
            }
        return false;
    }

    /* Recursively determines whether the given value was found within the list. */
    /* ( Returns a bool, true or false ) */
    ContainsRecursive(node,value)
    {
        if(!node) return false;
        if(node.value==value) return true;
         return this.ContainsRecursive(node.next,value);
    }
    /* Removes and returns the last value in the list. */
    /* Treat me like array.pop() would */
    PopBack()
    {
        /* Your Code Here */
      let node=this.head;
       while(node.next.next){node=node.next;}
         let temp=node.next.value;
            node.next=undefined;
         return temp;
    }
};
/* Create our list */
let list=new List();

/* ( Use your solution from day 1 for this to work! ) */
/* Remember, it just shoves all of these into our list! */
list.PushBackN([123,234,345,456,567,678]);

console.log(list.Contains(456)); /* Expected Output: true */
console.log(list.ContainsRecursive(345)); /* Expected Output: true */
console.log(list.PopBack()); /* Expected Output: 678 */
console.log(list.PopBack()); /* Expected Output: 567 */
console.log(list.Contains(567)); /* Expected Output: false */
/* Iterates our list, so we can see our node values */
/* I'm a freebie, don't change me. */
list.Iterate(value=>console.log(value));
/*
    Expected Output:
    123
    234
    345
    456
    */