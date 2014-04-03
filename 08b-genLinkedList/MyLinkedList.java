import java.io.*;
import java.util.*;

public class MyLinkedList<T>{

    private Node<T> head;
    private int length;
    
    public MyLinkedList(){
	head = new Node<T>(null);
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

    //create public void add with just an T s to add at the end 
    //create a tail to make this easier.

    public void add (T s, int position){
	if (position > length){
	    throw new IndexOutOfBoundsException("given position outside of range");
	}
	Node<T> n= head;
	Node<T> tmp = new Node<T>(s);
	for (int j = 0; j < position; j++)
	    n = n.getNext();
	tmp.setNext(n.getNext());
	n.setNext(tmp);
	length ++;
    }

    public int length(){
	/*int count = 0;
	Node tmp = head;
	while (tmp != null){
	    count++;
	    tmp = tmp.getNext();
	}
	return count;
	*/
	return length;
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
    
    
        
        public static void main(String[] args) {
	MyLinkedList<Integer> l = new MyLinkedList<Integer>();
    

	//random array
	int len = (int)(Math.random()*98) + 15;
	int[] a = new int[len];
	for (int i=0; i<len; i++) {
	    a[i] = (int)(Math.random()*10001) - 5000;
	}
    
	System.out.println("ARRAY:");
	System.out.println(Arrays.toString(a)+"\n");


	//finding length
	System.out.println("length is " + l.length);

	System.out.println("Adding ints to index 0");
	int fourth = len/4;
	for (int i=0; i<fourth; i++){
	    l.add(new Integer(a[i]),0);
	}
	System.out.println(l+"\n");

	System.out.println("Adding ints to index length");
	for (int i=fourth; i<2*fourth; i++){
	    l.add(new Integer(a[i]),l.length());
	}
	System.out.println(l+"\n");

	System.out.println("Adding ints between 0 and length");
	for (int i=2*fourth; i<3*fourth; i++){
	    l.add(new Integer(a[i]),(int)(Math.random()*(l.length-1))+1);
	}
	System.out.println(l+"\n");

	/*
	    //hopefully this generates an exception
	      System.out.println("Adding ints before the list");
	        for (int i=3*fourth; i<len; i++){
		  l.add(new Integer(a[i]),-1);
		    }
		      System.out.println(l+"\n");
	*/
	/*
	    //this too
	      System.out.println("Adding ints after the list");
	        for (int i=3*fourth; i<len; i++){
		  l.add(new Integer(a[i]),l.length+1);
		    }
		      System.out.println(l+"\n");
	*/

	System.out.println("Removing first node");
	l.remove(0);
	System.out.println(l+"\n");

	System.out.println("Removing last node");
	l.remove(l.length-1);
	System.out.println(l+"\n");

	System.out.println("Removing node in between");
	l.remove((int)(Math.random()*(l.length-1))+1);
	System.out.println(l+"\n");

	/*
	    //exceptions are fun
	      System.out.println("Removing node before index 0");
	        l.remove(-1);
	*/
	/*
	    System.out.println("Removing node after list ends");
	      l.remove(l.length);
	*/

	System.out.println("Getting first node");
	System.out.println(l.get(0)+"\n");

	System.out.println("Getting last node");
	System.out.println(l.get(l.length-1)+"\n");

	System.out.println("Getting node in between");
	System.out.println(l.get((int)(Math.random()*(l.length-1))+1)+"\n");

	/*
	    //hey this part is commented out guess what that means
	      System.out.println("Getting node before index 0");
	        System.out.println(l.get(-1)+"\n");
	*/
	/*
	    System.out.println("Getting node after list ends");
	      System.out.println(l.get(l.length)+"\n");
	*/

	System.out.println("Setting first node to 0");
	l.set(0,new Integer(0));

	System.out.println("Setting last node to 0");
	l.set(l.length-1,0);

	System.out.println("Setting node in between to 1010101");
	l.set((int)(Math.random()*(l.length-1))+1,new Integer(1010101));

	/*
	    System.out.println("Setting node before index 0 to 0");
	      l.set(-1,0);
	*/
	/*
	    System.out.println("Setting node after list ends to 0");
	      l.set(l.length,0);
	*/

	System.out.println("\n"+l);
    }
    
}
