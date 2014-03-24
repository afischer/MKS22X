import java.io.*;
import java.util.*;

public class MyLinkedList{

    private Node head;
    private int length;
    
    public MyLinkedList(){
	head = new Node("pre-head"); 
	length = 0;
    }
    
    public String toString(){
	String ans = "";
	Node n = head.getNext();
	for (int i = 0; i < length; i ++){
	    ans += n.getData()+";";
	    if (i < length -1)
		n = n.getNext();    
	}
	return ans;
    }

    public void add (String s, int position){
	Node n= head;
	Node tmp = new Node(s);
	for (int j = 0; j < position; j++)
	    n = n.getNext();
	tmp.setNext(n.getNext());
	n.setNext(tmp);
	length ++;
    }

    public int length(){
	return length;
    }

    private Node getNode(int i){
	Node n = head;
	for (int j = 0; j < i; j++){
	    n = n.getNext();
	}
	return n;
    }

    public String get(int i){
	return getNode(i+1).getData();
    }

    public String remove(int i){
	String ans = getNode(i+1).getData();
	getNode(i).setNext(getNode(i).getNext().getNext());
	length--;
	return ans;
    }

    public String set(int i, String s){
	Node n = getNode(i);
	n.getNext().setData(s);
	return n.getNext().getData();
    }
    

    
    public static void wait(int a){
	try {
	    Thread.sleep(a);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
    }
    
    
    public static void main(String[]args){

	MyLinkedList l = new MyLinkedList();
	String a = new String("A");
	String b = new String("B");
	String c = new String("C");
	String d = new String("D");
	String e = new String("E");
	
	l.add(a,0);
	l.add(d,1);
	l.add(c,2);
	System.out.println(l);
	l.set(1, "B");
	System.out.println(l);
	System.out.println(l.get(2));
	System.out.println(l.remove(1));
	System.out.println(l);
    }
    
}
