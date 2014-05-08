public class Driver{
    public static void main(String[] args){
	MyTree fred = new MyTree();
	
	fred.insert(2);
	fred.insert(5);
	fred.insert(9);
	fred.insert(-1);
	fred.insert(-3);
	fred.insert(1);
	fred.insert(10);
	
	System.out.println(fred);
    }
}
