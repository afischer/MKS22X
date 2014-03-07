import java.util.*;

//Andrew Fischer
//Merge Sort 2!

//Help from the interwebs, namely softbase. Thanks

public class mergeSort {
    public static void main(String args[]) {
	ArrayList<String> list = new ArrayList<>();
	list.add("hi");
	list.add("apple");
	list.add("banana");

	list = mergeSort(list);
	System.out.println(list);

    }

    public static void mergeSort(ArrayList<String> a) {

	if (a.size() <= 1) {
	    return;
	}

	//Make two parts!
	ArrayList<String> firstHalf = new ArrayList<>();
	ArrayList<String> secondHalf = new ArrayList<>();

	//Split into two parts!
	for (int i = 0; i < a.size() / 2; i++) {
	    firstHalf.add(a.get(i));
	}

	for (int i = a.size() / 2; i < a.size(); i++) {
	    secondHalf.add(a.get(i));
	}
	
	//Merge the two parts!!
	ArrayList<String> ans = new ArrayList<>();
	ans.add(merge(mergeSort(firstHalf), mergeSort(secondHalf)));
	a = ans;
    }
 
    //
    public static ArrayList<String> merge(ArrayList<String> a, ArrayList<String> b) {
	if (a.size() == 0) {
	    return b;
	}
	if (b.size() == 0) {
	    return a;
	}

	ArrayList<String> ans = new ArrayList<>();
	int next;
	if (a.get(0) > b.get(0)) {
	    next = b.get(0);
	    b.remove(0);
	} else {
	    next = a.get(0);
	    a.remove(0);
	}
	ans.add(next);
	ans.addAll(merge(a,b));
	a = ans;
    }
}
