

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
    private String data;
    private Node next;

    public Node(String s){
	this.data=s;
	next=null;
    }

    public static String getData(){
	return next;
    }

    public static void setData(String data){
	this.data=data;
    }

    public static void setNext(Node next){
	this.next=next;
    }

    public static String toString(){
	return "Data: "+data;
    }

}