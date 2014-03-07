import java.io.*;
import java.util.*;

//Andrew Fischer                                    Mr. K
//MKS21 Pd. 6                                       2/27/14


public class mergeSort{
   
    public static int[] merge( int[] left, int[] right) {
        int[] ans = new int[left.length+right.length];
	int i1 = 0;   
        int i2 = 0;   
        
        for (int i = 0; i < ans.length; i++) {
            if (i2 >= right.length || (i1 < left.length && 
				       left[i1] <= right[i2])) {
                ans[i] = left[i1];    // take from left
                i1++;
            } else {
                ans[i] = right[i2];   // take from right
                i2++;
            }
        }
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
	    System.out.println(Arrays.toString(ans));
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
