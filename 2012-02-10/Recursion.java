
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
	    return 0;
	}
	if (n == 1 ){
	    return 1;
	}
	return fib(n-1) + fib(n-2);
    }

    public static int fibItr(int n) {
	if (n == 0){
	    return 0;
	}
	if (n == 1 ){
	    return 1;
	}
	return fibHelper(0,1,n-2);
    }
        
    public static int fibHelper(int a, int b, int n){
	if(n==0){
	    return a+b;
	}
	else{
	    return fibHelper(b, a+b, n-1);
	}
    }

    public static void main (String[] args){
	System.out.println(fact(5));
	System.out.println(fact(12));

	System.out.println(fib(1));
	System.out.println(fib(3));
	System.out.println(fib(4));
	System.out.println(fib(25));

	System.out.println(fibItr(1));
	System.out.println(fibItr(3));
	System.out.println(fibItr(4));
	System.out.println(fibItr(25));

    }
}