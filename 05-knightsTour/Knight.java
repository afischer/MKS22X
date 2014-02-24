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
    static int[] xMoves = {2,   1, 2, 1, -1, -2, -2, -1}; // THESE ARE ALL THE POSSIBLE MOVES 
    static int[] yMoves = {-1, -2, 1, 2,  2,  1, -1, -2}; // They line up by index.
    public static int moveNum = 1;  //move counter
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
	
	while (!solved){

	    if (moveNum == ((n * n) - 1)) { //are we done? If yeah:
		System.out.println(toString(board));
		System.out.println("Done!");
		solved = true;
	    }

	    else { //We're not done.
		for (int i = 0; i < 8; i++) { //try each of 8 solutions
		    if ((x + xMoves[i]) >= 0 && (x + xMoves[i]) < n        //move in x dir, check in bounds
			&& (y + yMoves[i]) >= 0 && (y + yMoves[i]) < n){   //move in y dir, check in bounds
		    
			if (board[x + xMoves[i]][y + yMoves[i]] == 0) {    //If we haven't been here yet
			    board[x + xMoves[i]][y + yMoves[i]] = moveNum; //put down the move num
			    System.out.println(toString(board));           //print the board
			    moveNum++;                                     //increment move counter
			    try{Thread.sleep(250);}catch(Exception e){};
			    solve( (x + xMoves[i]), (y + yMoves[i]), n );  //recusrion step
			
			}
		    }
		    board[x //PUT THE STUFF FROM ABOVE][y] = 0; //no moves found :(
		    moveNum--;
		    

		}
	
	
	    }
	}
	if(solved){System.exit(0);}
    }



    //toString method to return the grid as printable data
    public static String toString(int[][] a) {
	String s = "";
	int columns;
	int rows;

	for (rows = 0; rows < a.length; rows++) {
	    for (columns = 0; columns < a[0].length; columns++ ) {
		s = s + " " + a[rows][columns];
	    }
	    s = s + "\n"; //newline after each row
	}
	return s;
    }



}
