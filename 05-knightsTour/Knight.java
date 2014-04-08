import java.io.*;
import java.util.*;

/*  TODO:

3 public methods:

Knight(int n)   - Constructor that initializes your board to be of size nxn.
solve()         - starts to solve the board starting with 0,0. Displays a sequence of
                  moves that represent a knights tour of the board. (Any open tour! read the notes)
toString()      - Return the grid of integers as a String. 
                  (please align the numbers to be read easily)

As well as the important recursive method

solve(x,y,n)    - x is starting point, y is starting y, n is board size.

*/


public class Knight {

    // Variable Initialization
    public static int[][] board;
    static int[] xMoves = {-2,  2,  1, 2, 1, -1, -2, -1}; // THESE ARE ALL THE POSSIBLE MOVES 
    static int[] yMoves = {1,  -1, -2, 1, 2,  2, -1, -2}; // They line up by index.
    public static int moveNum = 0;  //move counter
    public static boolean solved = false;


    //constructor to create board
    public Knight(int n){
	board = new int[n][n];
    }

    public void solve(){
	solve(0,0,board[0].length);
    }

    // - // - // - // - // - // - 


    //SOLVE METHOD
      public static void solve(int x, int y, int n){
	
	  board[x][y] = moveNum;

	  if (moveNum == (n*n)-1){
	      solved = true;
	  }

	  if (solved) {
	      System.out.println(toString(board));
	      System.exit(0);
	  } else {
	      for (int i = 0; i < 8; i++) {
		  if ((x + xMoves[i]) >= 0 && (x + xMoves[i]) < n     
		      && (y + yMoves[i]) >= 0 && (y + yMoves[i]) < n){
		      
		      if (board[x + xMoves[i]][y + yMoves[i]] == 0) { 
			  
			  board[x + xMoves[i]][y + yMoves[i]] = moveNum;
			  //try {Thread.sleep(100);}catch(Exception ex){}
			  // System.out.println(toString(board));          
			  moveNum++;                                    			  
			  solve((x + xMoves[i]), (y + yMoves[i]), n);  
		      }
		  }
	      }
		  
		  board[x][y] = 0; 
		  moveNum--;
	  }
      }
	      
	      
    //toString method to return the grid as printable data
    public static String toString(int[][] a) {
	String s = "";
	int columns;
	int rows;

	for (rows = 0; rows < a.length; rows++) {
	    for (columns = 0; columns < a[0].length; columns++ ) {
		s = s + " " + a[rows][columns] + "\t";
	    }
	    s = s + "\n"; //newline after each row
	}
	return s;
    }



}
