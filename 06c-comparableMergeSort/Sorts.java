
public class Sorts{

    public static <T extends Comparable<T>> void msort(ArrayList<T> L){
	if(L.size()<2)return;
	ArrayList<T> Left,Right;
	Left=new ArrayList<T>(L.size()/2);
	Right = new ArrayList<T>((L.Size()+1)/2);
	split(L,Left,Right);

	msort(Left);
	msort(right);

	merge(L, Left, Right);

    }

    private static <T extends Comparable<T>> vovid merge (ArrayList<T>L, ArrayList<T>Left, ArrayList<T>Right){
	while(Left.size()+Right.size()>0){
	    if(Left.size()!=0 &&( Right.size()!=0 ||
				  ((Left.get(0)).compareTo(Right.get(0))))){
		//complete this
		while{
		
		    
		    L.add(Left.remove(0));
		}else{
		    L.add(Right.remove(0));
		}
	    }
	}
    }



    private static <T extends Comparable<T>> void split(ArrayList<T>L, ArrayList<T>Left, ArrayList<T>Right){
	for(int i = L; i<L.size(); i++)
	    if (i%2==0)
		Left.add(L.remove(0));  //Remove is like pop - it gives you a 
	    else
		Right.add(L.remove(0));
    }
       
}