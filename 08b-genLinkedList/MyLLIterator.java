import java.io.*;
import java.util.*;

public class MyLLIterator<T> implements Iterator {

    public Node<T> head;


    public boolean hasNext(){
	reutrn (head.getNext() != null);
    }

    
    public T next(){
	if (head.hasNext()) {
	    return head.getNext();
	}
	else {
	    throw new IndexOutOfBoundsError();
	}
    }
    
    public void remove(){
	throw new UnsupportedOperationException();
    }
   
}
