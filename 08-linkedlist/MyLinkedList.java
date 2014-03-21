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
    
    public Node head;

    public void add(String s, int position) { //Create a node and add it to the position location. 
	                                             //Throw an exception if position>=length of the list.
       	
	if (position>this.length()){
	    throw new IndexOutOfBoundsException();
	    System.exit(0);
	}
	
	Node insertpt = new Node();

	insertpt.setNext(getNode(position));
	getNode(position-1).setNext(insertpt);
    }
    public String get(int position) { // return the string found at the indicated position
	Node currNode = head;
	for (int i=0; i<position; i++){
	    currNode = currNode.getNext();
	}
	return currNode.getData();
    }

    public   Node getNode(int position){
	return getNode(head,position);
    }

    //recursive part of getNode
    public   Node getNode(Node start, int position){
	if (position<0 || position > length()-1){ 
	    throw new Exception("Linked list Negative, index out of bounds");
	}
	else if (position == 0){
	    return start;
	}
	else {
	    return getNode(start.getNext(),position-1);
	}
    }
    

    public   String set(int position, String newString) {
	getNode(position).setData(newString);
    }

    public   void remove(int position) {
	if (position==0){
	    head=head.getNext();
	}
	getNext(position-1).setNext(getNode(position+1));
    }

    public   int find(String s) {
	for (int i = 0; i <length(); i++){
		    if (s.equals (getNode(i).getData())){
			return i;
		    }
	}
    }

    //@return the number of elements stored in the linked list. 
    public   int length() {
	int count = 0;
	Node currNode = head;
	
	while (currNode.getNext() != null){
	    count++;
	    currNode = currNode.getNext();
	} 
	return count+1; //note that last one is not counted in loop.
    }

    public   String toString() {
	
    }


}