import java.io.*;
import java.util.*;

//Andrew Fischer                                    Mr. K
//MKS21 Pd. 6                                       2/27/14


public class mergeSort{

    public static int[] merge(int[]a, int[]b){      //Returns sorted combined values of a&b
	
    
	int[] ans = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;
	    
	    while (i<a.length 
		   &&
		   j<b.length)
		{
		    if (a[i] < b[j])       
			ans[k++] = a[i++];   
		    else        
			ans[k++] = b[j++];               
		}
	    while (i < a.length)  
		ans[k++] = a[j++];
	    while (j < b.length)    
		ans[k++] = b[j++];

	    return ans;
	}




    public static void main(String[] args){


    }

}
