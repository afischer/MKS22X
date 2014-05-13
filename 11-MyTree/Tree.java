public class Tree {

    //Internal Node Class
    public class Node {
	private int data;
	private int count;
	private Node left;
	private Node right;
    
	public Node (){}

	public Node(int s) {
	    data = s;
	    count = 0;
	    left = null;
	    right = null;
	}
    	public void setData(int s) {
	    data = s;
	}
	public int getData() {
	    return data;
	}    
	public void setLeft(Node n) {
	    left = n;
	}
	public void setRight(Node n) {
	    right = n;
	}
	public Node getLeft() {
	    return left;
	}
	public Node getRight() {
	    return right;
	}
	public void increaseCount(){
	    count++;
	}
	public void decreaseCount(){
	    count--;
	}
	public String toString() {
	    return "" + data;
	}
    }

    private Node root;

    public Tree(){
	root = null;
    }

    public void insert(int value){
	Node temp = root;
	Node newNode = new Node(value);
	boolean go = true;
	
	System.out.println("adding " + value);

	if (temp == null){
	    root = newNode;
	    go=false;
	}
	
	while (go) {
	    if(temp.getData()==value){
		temp.increaseCount();

		//		System.out.println("temp's data is equal");
		return;
	    }
	    else if (temp.getData() > value){
		temp = temp.getRight();
		if (temp==null){
		    temp = newNode;
		    go = false;
		    //	System.out.println("temp's data is less than root");
		}
	    }
	    else {
		temp = temp.getLeft();
		if (temp==null){
		    temp = newNode;
		    go = false;
		    //  System.out.println("temp's data is greater than root");
		}
	    }
	}
    }
    
    /*
    public String toString(Node n){
	System.out.println("Tree:");
	return toStringHelper(n);
	
	/*
	if (n.count==0){ return "";}
	String data = n.getLeft().getData() + " <-- " + n.getData() + " --> " + n.getRight().getData() + "\n";
	data += n.getLeft().getData() + "\n";
	data += n.getRight().getData() + "\n";
	return data;
	*/
    /*  }
    
    public String toString(){
	return toString(root);
    }

    
    public String ans = "";

    public String toStringHelper(Node current){ 


	if (current == null){return "";}

	ans += current.getLeft().getData() + "<--" + current.getData() + "-->" + current.getRight().getData();	    


	if (current.getLeft() != null && current.getRight() != null){
	    ans += toStringHelper(current.getLeft()) + toStringHelper(current.getRight());
	}
	return ans;
    }

*/

    public String toString(){
	return toString(root);
    }

    public String toString(Node current){
	String result = "";

	System.out.println(root);

	if (current == null){
	    return "";
	}else{

	    if (current.getLeft()!=null){
		result += current.getLeft() + "<--";
	    }
	    result += current;
	    if (current.getRight()!=null){
		result += "-->" + current.getRight();
	    }

	    result+= "\n";
	    return result + toString(current.getLeft()) + toString(current.getRight());
	}
    }


    public Node find(int target){
	Node current = root;               
	while(current.getData() != target)        
	    {
		if(target < current.getData()){         
		    current = current.getLeft();
		}
		else{                          
		    current = current.getRight();
		}
		if(current == null){            
		    return null;     
		}
	    }
	return current;                   	
    }

    
}
