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
    
    Node head;

    public static void add(String s, int position) { //Create a node and add it to the position location. 
	                                             //Throw an exception if position>=length of the list.
	currNode = head;
	Node n = new Node(s);

	if (position>this.length()){
	    throw new IndexOutOfBoundsException;
	    System.exit(0);
	}
	
	for(int i=0; i<position; i++){
	    currNode = currNode.getNext();
	}
	currNode.setNext(n); //FIX THIS SO IT DOESN'T BREAK THE WHOLE LIST!!!!!!!!
	
    }
    public static String get(int position) { // return the string found at the indicated position

    }
    public static String set(int position, String newString) {

    }
    public static void remove(int position) {

    }
    public static int find(String S) {

    }

    //@return the number of elements stored in the linked list. 
    public static int length() {
	int count = 0;
	currNode = head;
	
	while (n.getNext() != null){
	    count++;
	    n = n.getNext();
	} 
	return count+1; //note that last one is not counted in loop.
    }

    public static String toString() {

    }


}