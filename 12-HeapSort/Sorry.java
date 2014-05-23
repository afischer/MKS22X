import java.io.*;
import java.util.*;

public class Sorry {

    public static void test1(Random r, int size) {
	try {
	    //create a runningMedian
	    RunningMedian rm = new RunningMedian();
	    //repeat size times:
	    int x = size;
	    while (x>0){
		//create a random value, and add it to your running median.
		int toAdd = r.nextInt();
		rm.add(toAdd);
		//print what you added and the median after each add.
		System.out.println("added: " + toAdd + ", median is: " + rm.median());
		x--;
	    }
	    
	} catch (IllegalStateException ex) {System.out.println("Exception caught.");}
    }


    public static void test2(Random r,int size) {
	try {
	    //create a runningMedian
	    RunningMedian rm = new RunningMedian();
	    //repeat size times:
	    int x = size;
	    while (x>0){
		//create a random value, and add it to your running median.
		int toAdd = r.nextInt();
		rm.add(toAdd);
		//print what you added and the median after each add.
		System.out.println("added: " + toAdd + ", median is: " + rm.median());
		x--;
		//there is a 20% chance that the median is removed. (print that you are doing this)
		if (r.nextFloat()<.2){
		    System.out.println("removed median " + rm.remove() + ". new median is " + rm.median());
		}
	    }
	} catch (IllegalStateException ex){System.out.println("Exception caught.");}
    }


    public static void main(String[] args){
	if (args.length < 2){
	    System.out.println("ERROR: Requires size and seed params.");
	    System.exit(0);
	}
	int size = Integer.parseInt(args[0]);

	for (int i = 1; i<args.length; i++){
	    Random R = new Random(Integer.parseInt(args[i])); 
	    test1(R,size);
	    test2(R,size);
	}
    }

}
