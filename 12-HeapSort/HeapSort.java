import java.util.*;
import java.io.*;

public class HeapSort {

    public int heapSize;

    public void swap(int[] arr, int x, int y){
	int tmp = a[x];
	arr[x] = arr[y];
	arr[y] = tmp;
    }

    public void pushUp(int[] arr, int index){
	int parentIndex = (index-1)/2;
	while(arr[index] > arr[parentIndex]){
	    swap(arr, index, parentIndex);
	    index = parentIndex;
	}
    }

    public void pushDown(int[] arr, int index){
	/*	child1;
	int childIndex = (index*2)+1;
	
	while(arr[index] < arr[childIndex]){
	    swap(arr, index, childIndex)
	
	*/

	int[] tmp = heap[k];
	int child1;
	int child2;

	for(; 2*k <= size; k = child)
	    {
		child = 2*k;
		
		if(child != size &&
		   heap[child].compareTo(heap[child + 1]) > 0) child++;
		
		if(tmp.compareTo(heap[child]) > 0)  heap[k] = heap[child];
		else
		    break;
	    }
	heap[k] = tmp;
    }

    }

}
