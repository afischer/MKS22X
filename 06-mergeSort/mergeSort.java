import java.io.*;
import java.util.*;

//Andrew Fischer                                    Mr. K
//MKS21 Pd. 6                                       2/27/14


public class mergeSort {


    public static int[] merge(int[]a, int[]b){      //Returns sorted combined values of a&b
	ans = new int[a.length + b.length -1];
	int index = 0;

	for(int i=0; i<a.length;){
	    for (int j=0; j<b.length;){
		if (a[i] > b[j]){
		    ans[index] = a[i];
		    i++;
		    index++;
		}
		if (a[i] < b[j]){
		    ans[index] = b[j];
		    j++;
		    index++;
		}
	    }
	}
    }


    public static void main(String[] args){
	system.out.println(Arrays.tostring(merge({soemthign},{asdfsda})));

    }

}