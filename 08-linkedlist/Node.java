

/*

1. Node
-          Node(String s)
-Node getNext()
-String getData()
-void setData(String data)
-void setNext(Node next)
-String toString()   //Just return the data

*/


public class Node {
    public String data;
    public Node next;

    public Node(String s){
	this.data=s;
	next = null;
    }

    public  String getData(){
	return next.toString();
    }

    public void setData(String data){
	this.data=data;
    }

    public void setNext(Node next){
	this.next=next;
    }

    public String toString(){
	return "Data: "+data;
    }

}