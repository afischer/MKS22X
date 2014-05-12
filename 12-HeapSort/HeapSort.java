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
	child1;

	int parentIndex = (index*2)+1;
	while(arr[index] < arr[parentIndex]){
	    swap(arr,
	}
    }