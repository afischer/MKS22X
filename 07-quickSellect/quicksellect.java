public class quicksellect{
   
   public static int quicksellect(int []L, int k){
      return quicksellect(L, k, 0, L.length-1);
   }
   
   public static int quicksellect(int[]L, int k, int left, int right){
      int pivIndex = partition(L, k, left, right);
      
      if (pivIndex == k){ //not sure this is correct.
         return L[k];
      }
      else{
         return quicksellect(L, k, 0, pivot);
      }
   }
   
   public static int partition(int[] L, int k, int left, int right){
      int pivot = L[left + (int)(Math.random() * ((right - left)+1))];
      int front = 0;
      int back = L.length -1;
      int[] temp = new int[L.length];
      
      for (int i = 0; i<L.length; i++){
         if (L[i] <= pivot) {
            temp[front] = L[i];
            front++;
         }
         else {
            temp[back] = L[i];
            back--;
         }
      }
      
      for (int i = 0; i<L.length; i++){
         L[i] = temp[i];
      }
      
      return k;
   }
   
   
   public static void main(String[] args){
      int[] a = new int[10];
      
      a[0] = 2;
      a[1] = 64;
      a[2] = 25;
      a[3] = 36;
      a[4] = 52;
      a[5] = 43;
      a[6] = 6;
      a[7] = 11;
      a[8] = 98;
      a[9] = 13;
      
      System.out.println(quicksellect(a, 3));
      
   }
   
}
