import java.io.*;
import java.util.*;

public class MyLinkedList<T>{

    private Node<T> head;
    private int length;
    
    public MyLinkedList(){
	head = new Node<T>(); 
    }
    
    public String toString(){
	String ans = "";
	Node<T> n = head.getNext();
	for (int i = 0; i < length; i ++){
	    ans += n.getData()+";";
	    if (i < length -1)
		n = n.getNext();    
	}
	return ans;
    }

    public void add (T s, int position){
	Node<T> n= head;
	Node<T> tmp = new Node<T>(s);
	for (int j = 0; j < position; j++)
	    n = n.getNext();
	tmp.setNext(n.getNext());
	n.setNext(tmp);
	length ++;
    }

    public int length(){
	int count = 0;
	Node tmp = head;
	while (tmp != null){
	    count++;
	    tmp = tmp.getNext();
	}
	return count;
    }

    private Node<T> getNode(int i){
	Node<T> n = head;
	for (int j = 0; j < i; j++){
	    n = n.getNext();
	}
	return n;
    }

    public T get(int i){
	return getNode(i+1).getData();
    }

    public T remove(int i){
	T ans = getNode(i+1).getData();
	getNode(i).setNext(getNode(i).getNext().getNext());
	length--;
	return ans;
    }

    public T set(int i, T s){
	Node<T> n = getNode(i);
	n.getNext().setData(s);
	return n.getNext().getData();
    }
    
    
    
    public static void main(String[]args){

	MyLinkedList<String> l = new MyLinkedList<String>();
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
