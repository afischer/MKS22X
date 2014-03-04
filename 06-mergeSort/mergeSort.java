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

    public static void msort(int[] a){
	if(a.length>1){

	    //make two new arrays 1/2 the size of a
	    int[] a1, a2 = new int[a.length/2];

	    //copy array to the two arrays - there is a built in fxn for this
	    for(int i=0; i<a.length/2; i++){
		a1[i] = a[i];
		a2[a.length-i] = a[a.length-i];
	    }

	    //msort the two arrays
	    msort(a1);
	    msort(a2);
	    
	    //ans = merge(two arrays);
	    int[] ans = merge(a1, a2);
	    
	    //copy the ans to a
	    a = ans;

	}
	else {
	    return;
	}
    }
    



    
    public static void main(String[] args){
	int[] a = new int[4];
	int[] b = new int[1];

	a[0]=5;
	a[1]=2;
	a[2]=44;
	a[3]=12;

	msort(a);

    }

}
