
public class Recursion {
    
    public static long fact(int n){
	long ans=1;
	
	if (n == 0){
	    return 1;
	}
	else {
	    return (n * fact(n-1));
	}
    }

    public static int fib(int n){
	if (n == 0){
	    return n;
	}
	if (n == 1 ){
	    return 1;
	}
	else {
	    return fib(n-1) + fib(n-2);
	}
	    
    }

    public static int fibIter(int n) {
	int twoago = 0;
	int prev = 1;
	for(int i=0; i<n; i++) {
	    int temp = twoago;
	    twoago = prev;
	    prev = temp + prev;
	}
	return prev;
    }
        

    public static void main (String[] args){
	System.out.println(fact(5));
	System.out.println(fact(12));

	System.out.println(fib(1));
	System.out.println(fib(5));
	System.out.println(fib(12));
	System.out.println(fib(25));

	System.out.println(fibIter(1));
	System.out.println(fibIter(5));
	System.out.println(fibIter(12));
	System.out.println(fibIter(25));

    }
}