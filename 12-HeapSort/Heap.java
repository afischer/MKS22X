import java.io.*;
import java.util.*;

public class Heap {

    //// VARIABLES ////

    private boolean maxHeap;
    private int[] heap;
    private int length;

    //// CONSTRUCTORS ////

    public Heap(boolean max) {
	if (!max) {
	    maxHeap = false;
	} 
	else {
	    maxHeap = true;
	}
	heap = new int[100];
	length = 0;
    }

    //// ACCESSORS ////

    public int getLength() {
	return length;
    }

    public int getRoot() {
	return heap[0];
    }

    //// METHODS /////

    public void insert(int x) {
	heap[length] = x;
	length++;
	if (length >= heap.length-2) { //if we're getting close, grow
	    grow();
	}
	if (length < heap.length/4) {
	    shrink();
	}
	pushUp(length-1);	//readjust if needs to be moved
    }


    public int above(int a, int b) {
	if (a>b) {
	    if (maxHeap) {
		return a;
	    } else {
		return b;
	    }
	} else {
	    if (maxHeap) {
		return b;
	    } else {
		return a;
	    }
	}
    }

    public int pushUp(int x){
	if (x==0) {
	    return x;
	}
	if (above(heap[x], heap[(x-1)/2]) == heap[x]) {
	    swap(x, (x-1)/2);
	    x = (x-1)/2;
	    pushUp(x);
	}
	return x;
    }


    public void pushDown(int i) {
	int a = 2*i+1; 
	int b = 2*i+2;
	if (a<length && b<length){
	    if (above(heap[a],heap[i]) == heap[a] ||
		above(heap[b],heap[i]) == heap[b]) {
		if (above(heap[a],heap[b]) == heap[a]) {
		    swap(a,i);
		    pushDown(a);
		} else {
		    swap (b,i);
		    pushDown(b);
		}
	    }
	}
    }


    public void grow(){ //Expands an array
	int[] tmp = new int[length*2];
	for (int i=0;i<length;i++) {
	    tmp[i] = heap[i];
	}
	heap = tmp;
    }

    public void shrink(){ //Shortens an array
	int[] tmp = new int[heap.length/4];
	for (int i=0;i<length;i++) {
	    tmp[i] = heap[i];
	}
	heap = tmp;
    }


    public  void swap(int x, int y) {
	int tmp = heap[x];
	heap[x] = heap[y];
	heap[y] = tmp;
    }


    public void remove(int i) {
	if (i==length-1) {
	    heap[i] = 0;
	    length --;
	} else {
	    heap[i] = heap[length-1];
	    heap[length-1] = 0;
	    length --;
	    i = pushUp(i);
	    pushDown(i);
	}
    }
 

    public String toString() {
	String s = "[";
	for (int i=0;i<length;i++) {
	    s = s + heap[i] + ", ";
	}
	s = s.substring(0,s.length()-2) + "]";
	return s;
    }


}
