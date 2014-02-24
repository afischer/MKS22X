
// The Hailstone sequence:

// if n=1, print n
// if n=even, hail(n/2)
// if n=odd, hail(3n+1)

public class Hailstone{

    static int nums = 0;

    public static int  hail(int n){
	if (n==1){
	    return n;
	}
	if (n%2 == 0){
	    return hail(n/2);
	}
       	return hail((3*n)+1);
    }

    // hailLen(n_: what is the length of hail(n)
    public static int hailLen(int n){
	int counter = 0;	

	while (n != 1){

	    if (n%2 == 1){
		int y = 3*n+1;
       		n = y;
	    }
	    else {
		int y = n/2;
		n = y;
	    }
	    counter++;
	}

	return counter;
    } 


    // longestHail(n): what N from 1 to n has the longest sequence?
    public static int longestHail(int n){
	
	if (n==1){
	    return n;
	}
	else {
	    if (hailLen(n-1) > hailLen(n)) {
		return longestHail(n-1);
   	    }
	    return longestHail(n-2);
	}
    }


    public static void main(String[] args){

	System.out.println(hailLen(2));
	System.out.println(hailLen(5));
	System.out.println(hailLen(10));
	System.out.println(longestHail(12));

    }

}
