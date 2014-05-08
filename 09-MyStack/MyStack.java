import java.io.*;
import java.util.*;

public class MyStack<E> {

    ///////   METHODS   ///////

    //Node element of Stack
    public class Node<E> {
	private E data;
	private Node<E> next;

	public Node (){}

	public Node(E data) {
	    this.data = data;
	    next = null;
	}

	public void setData(E s) {
	    data = s;
	}
	
	public E getData() {
	    return data;
	}
	
	public void setNext(Node<E> n) {
	    next = n;
	}
	
	public Node<E> getNext() {
	    return next;
	}
	
	public String toString() {
	    return data.toString();
	}
    }
    
    ///////  VARIABLES   ///////

    private Node<E> top;
    
    /////// CONSTRUCTORS ///////
    
    public MyStack(){
	top = null;
    }
    

    ///////   METHODS    ///////
    
    //Tests if this stack is empty.
    public boolean empty(){
	return top==null;
    }
    
    //Looks at the object at the top of this stack without removing it from the stack.
    public E peek(){
	if (!empty()){
	    return top.getData();
	}
	else {
	    throw new EmptyStackException();
	}
    }
    
    //Removes the object at the top of this stack and returns that object as the value of this function.
    public E pop(){
	E temp = peek(); //will throw exception if needed.
	top = top.getNext();
	return temp;
    }

    //Pushes an item onto the top of this stack.
    public E push(E item){
	Node<E> tmp = new Node<E>(item);
	tmp.setNext(top);
	top = tmp;
	return item;
    }
    
    //Returns the 1-based position where an object is on this stack.
    public int search(E o){
	int pos = 1;
	Node<E> current = top;
	while(current!=null){
	    if (current.getData().equals(o))
		return pos;
	    pos++;
	    current = current.getNext();
	}
	return -1;
    }

    
}

