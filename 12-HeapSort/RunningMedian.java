public class RunningMedian {

    private Heap leftChild;
    private Heap rightChild;
    
    public RunningMedian() {
	leftChild = new Heap(true);
	rightChild = new Heap(false);
    }

    public void add(int value) {
	double m;
	try{
	    m = median(); //if there's nothing inside
	} catch (IllegalStateException e) {
	    m = value;
	}
	if (value < m) {
	    leftChild.insert(value);
	} else {
	    rightChild.insert(value);
	}
	balance();
    }

    public double remove() {
	double a = median();
	if (a==(double)leftChild.getRoot()) {
	    leftChild.remove(0);
	    balance();
	} else if (a==(double)rightChild.getRoot()) {
	    rightChild.remove(0);
	    balance();
	} else {
	    leftChild.remove(0);
	    rightChild.remove(0);
	}
	return a;
    }


    public void balance() {
	int l = leftChild.getLength();
	int r = rightChild.getLength();
	if (l==r || l-r==1 || r-l==1) {
	    return;
	}
        if (l-r==2) {
	    int a = leftChild.getRoot();
	    leftChild.remove(0);
	    rightChild.insert(a);
	} else if (r-l==2) {
	    int b = rightChild.getRoot();
	    rightChild.remove(0);
	    leftChild.insert(b);
	}
    }

    public double median(){ //returns median
	if (leftChild.getLength() == 0 && rightChild.getLength() == 0) { //check if empty
	    throw new IllegalStateException();
	}
	if (leftChild.getLength() > rightChild.getLength()) {
	    return (double)leftChild.getRoot();
	} 
	else if (rightChild.getLength() > leftChild.getLength()) {
	    return (double)rightChild.getRoot();
	} 
	else {
	    return (leftChild.getRoot() + rightChild.getRoot())/2.0;
	}
    }

}
