import java.io.*;
import java.util.*;

public class MyArrayStack<E> {
    private static int startSize = 10;
    public int size;
    public E[] items;

    public MyArrayStack (){
	size = 0;
	items = (E[]) new Object[startSize];
    }

    public boolean empty () {
	return (size == 0);
    }

    public void push (E value){
	if(items.length == size)
            {
		grow(size * 2 + 1);
            }
	items[size++] = value;
    }

    public E pop (){
        if(empty())
	    {
		throw new NoSuchElementException();
	    }
	return(items[--size]);
    }

    public void grow(int y){
        E[] old = items;
        items = (E[]) new Object[y];
        for(int x = 0; x < size; x++)
	    {
		items[x] = old[x];
	    }
    }

    public int search(Object o){
	for (int i = 0; i<size; i++){
	    if (items[i]==o) {
		return i+1;
	    }
	    else {
		return -1;
	    }
	}
	return -1;
    }
    
}
