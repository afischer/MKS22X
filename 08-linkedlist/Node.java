public class Node<T> {
    private T data;
    private Node<T> next;

    public Node (){}

    public Node<T>(T s) {
        data = s;
        next = null;
    }
    
    public void setData(T s) {
        data = s;
    }

    public T getData() {
        return data;
    }
    
    public void setNext(Node<T> n) {
        next = n;
    }

    public Node<T> getNext() {
        return next;
    }

    public String toString() {
        return data;
    }
}
