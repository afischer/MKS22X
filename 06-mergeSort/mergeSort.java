import java.io.*;
import java.util.*;

//Andrew Fischer                                    Mr. K
//MKS21 Pd. 6                                       2/27/14


public class mergeSort{
   
    public static int[] merge(int[]a, int[]b){      //Returns sorted combined values of a&b
      
      
	int[] ans = new int[a.length + b.length];
	int i = 0, j = 0, k = 0;
    
      
	while (k != ans.length){
         
	    if (i!=a.length && j!=b.length && a[i] < b[j]){   
		ans[k] = a[i];
		i++;
		k++;
	    }
	    else if (j!=b.length){
		ans[k] = b[j];
		k++;
		j++;         }
	    else {
		if (a[a.length-1]>b[b.length-1]){
		    ans[ans.length-1]=a[a.length-1];
		}
		else {
		    ans[ans.length-1]=b[b.length-1];
		}
		System.out.println(Arrays.toString(ans));
		return ans;
	    }
	}
	//ans[k++] = b[j++];
      
      
	return ans;
    }
   
   
    public static void msort(int[] a){
	if(a.length>1){
	    //exit if size is one
	    if (a.length<2) return;
         
	    //make two new arrays 1/2 the size of a
	    int[] a1 = new int[a.length/2];
	    int[] a2 = new int[a.length - a1.length];
         
	    //copy array to the two arrays - there is a built in fxn for this
	    for(int i=0; i<a.length/2; i++){
		a1[i] = a[i];
		a2[a.length/2-1-i] = a[a.length-1-i];
	    }
         
	    //msort the two arrays
	    msort(a1);
	    msort(a2);
         
	    //ans = merge(two arrays);
	    int[] ans = merge(a1, a2);
	    
	    //copy the ans to a
	    for (int i=0; i<a.length; i++){
		ans[i] = a[i];
	    }
	    
	}
	else {
	    return;
	}
    }
   
   
   
   
   
    public static void main(String[] args){
	int[] a = new int[4];
      
	a[0]=14;
	a[1]=54;
	a[2]=28;
	a[3]=33;
      

      
	msort(a);
      
    }
   
}
