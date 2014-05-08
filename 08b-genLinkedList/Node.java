public class Node<T> {
    public T data;
    public Node<T> next;

    public Node(){}

    public Node(T s){
	this.data=s;
	next = null;
    }

    //Getters
    public Node<T> getNext(){
	return next;
    }

    public T getData(){
	return data;
    }

    //Setters
    public void setNext(Node<T> next){
	this.next=next;
    }

    public void setData(T data){
	this.data=data;
    }

    //ToString
    public String toString(){
	return "Data: "+data;
    }
}
