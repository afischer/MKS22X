public class MyTree {

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

    public void insert(int value){
	Node temp = root;
	while (true) {
	    if(temp.getData()==value){
		temp.increaseCount();
	    }
	    else if (temp.getData() > value){
		temp = temp.getRight();
		if (temp.count==0){
		    temp.setRight(new Node(value));
		    break;
		}
	    }
	    else {
		temp = temp.getLeft();
		if (temp.count==0){
		    temp.setLeft(new Node(value));
		    break;
		}
	    }
	}
    }
    

    public String toString(Node n){
	if (n.count==0){ return "";}
	String data = n.getLeft().getData() + " <-- " + n.getData() + " --> " + n.getRight().getData() + "\n";
	data += n.getLeft().getData() + "\n";
	data += n.getRight().getData() + "\n";
	return data;
    }
    //Overrides
    public String toString(){
	return toString(root);
    }

    //public Node find(int target){
    
    //}

    
}