

/*

1. Node
-          Node(String s)
-Node getNext()
-String getData()
-void setData(String data)
-void setNext(Node next)
-String toString()   //Just return the data

*/


public class Node<T> {
    public T data;
    public Node next;

    public Node(T s){
	this.data=s;
	next = null;
    }

    //Getters
    public Node getNext(){
	return next;
    }

    public T getData(){
	return data;
    }

    //Setters
    public void setNext(Node next){
	this.next=next;
    }

    public void setData(T data){
	this.data=data;
    }


    //ToString
    public String toString(){
	return "Data: "+data;
    }

}
