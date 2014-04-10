import java.io.*;
import java.util.*;

public class Calculator{
    
    MyStack calc = new MyStack();
    
    public void add(){
	calc.push((double)calc.pop() + (double)calc.pop());
	System.out.println(">>"+calc.peek());
    }

    public void subtract(){
	calc.push((double)calc.pop() - (double)calc.pop());
	System.out.println(calc.peek());
    }

    public void multiply(){
	calc.push((double)calc.pop() * (double)calc.pop());
	System.out.println(calc.peek());
    }

    public void divide(){
	calc.push((double)calc.pop() / (double)calc.pop());
	System.out.println(calc.peek());
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
	System.out.println("Ready to accept calculations:");
	Calculator c = new Calculator();


	while(sc.hasNext()){
	    String input = sc.next();
	    System.out.println("\""+ input + "\"");
	    if (input == "+"){c.add();}
	    if (input == "-"){c.subtract();}
	    if (input == "*"){c.multiply();}
	    if (input == "/"){c.divide();}
	    else {c.calc.push(input);}
	    System.out.println(c.calc.peek());
	    System.out.println(c.calc.peek());
	    System.out.println(c.calc.pop());
	}
    }
}
