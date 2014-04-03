import java.io.*;
import java.util.*;

public class MyStack<E> {

    //Node element of Stack
    public class Node<E> {
	private E data;
	private Node<E> next;

	public Node (){}

	public Node<E>(E s) {
	    data = s;
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
	    return data;
	}
    }
    // END Node class

    ///---///---///---///---///---///

    //Tests if this stack is empty.
    public boolean empty(){

    }

    //Looks at the object at the top of this stack without removing it from the stack.
    public E peek(){

    }

    //Removes the object at the top of this stack and returns that object as the value of this function.
    public E pop(){

    }

    //Pushes an item onto the top of this stack.
    public E push(E item){

    }

    //Returns the 1-based position where an object is on this stack.
    public int search(Object o){

    }

}
