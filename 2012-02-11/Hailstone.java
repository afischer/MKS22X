
// The Hailstone sequence:

// if n=1, print n
// if n=even, hail(n/2)
// if n=odd, hail(3n+1)

public class Hailstone{

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
	int nums = 0;
	if (n==1){
	    return n;
	    nums++;
	}
	if (n%2 == 0){
	    return hail(n/2);
	    nums++;
	}
	return hail((3*n)+1);
	nums++;
	
	return nums;
    }


    // longestHail(n): what N from 1 to n has the longest sequence?

    public static void main(String[] args){

	//System.out.println(hail(2));
	//System.out.println(hail(5));
	//System.out.println(hail(10));
	//System.out.println(hail(12));

    }

}