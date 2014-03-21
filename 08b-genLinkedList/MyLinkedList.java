/*

2. MyLinkedList  //does not handle circular lists
-void add(String s, int position) 
-String get(int position) 
-String set(int position,String newString) // change the value of the string found at the indicated position to newString
-void remove(int position)//remove the Node from that location.
-int find(String s)//return the location of the 1st occurance of s in the list, -1 if the string isn't found.
-int length() 
-String toString() //convert the list to a string in the format "[ word1 , word2 , word3]"

*/


public class MyLinkedList {
    
    int length;
    private Node<T> head = new Node();
    
    //Constructor
    public MyLinkedList(){
	head=null;
    }
    
    public void add(T s, int position) { //Create a node and add it to the position location. 
	//Throw an exception if position>=length of the list.
       	
	if (position>this.length()){
	    throw new IndexOutOfBoundsException();
	}
	
	Node insertpt = new Node("insertpt");
	
	insertpt.setNext(getNode(position));
	getNode(position-1).setNext(insertpt);
    }
    public T get(int position) { // return the string found at the indicated position
	Node currNode = head;
	for (int i=0; i<position; i++){
	    currNode = currNode.getNext();
	}
	return currNode.getData();
    }
    
    public Node getNode(int position){
	return getNode(head,position);
    }

    //recursive part of getNode
    public Node getNode(Node start, int position){
	if (position<0 || position > length()-1){ 
	    throw new IndexOutOfBoundsException();
	}
	else if (position == 0){
	    return start;
	}
	else {
	    return getNode(start.getNext(),position-1);
	}
    }
    

    public void set(int position, T newData) {
	getNode(position).setData(newData);
    }

    public void remove(int position) {
      
	if (position==0){
	    head=head.getNext();
	}
	getNode(position-1).setNext(getNode(position+1));
    }

    public int find(String s) {
	for (int i = 0; i <length(); i++){
	    if (s.equals (getNode(i).getData())){
		return i;
	    }
	}
	return -1;
	
    }

    //@return the number of elements stored in the linked list. 
    public int length() {
	int count = 0;
	Node currNode = head;
	
	while (currNode.getNext() != null){
	    count++;
	    currNode = currNode.getNext();
	} 
	return count+1; //note that last one is not counted in loop.
    }

    public String toString() {
	return data;
    }

    
    public static void main(String[] args) {
	MyLinkedList l = new MyLinkedList();
	l.add("test",0);
	l.add("moretest",1);
	l.add("lesstest",0);
	l.add("lasttest",3);

	System.out.println(l);
	l.set(2,"edit");
	System.out.println(l.get(2));
	System.out.println(l);
	l.remove(2);
	System.out.println(l);
	l.remove(0);
	System.out.println(l);
    }

}
