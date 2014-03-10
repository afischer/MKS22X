import java.util.*;
import java.io.*;
public class Knight{

    private int[][]board;
    private int maxx,maxy;
    private int startx,starty;
    private boolean solved = false;
    private boolean foundstart = false;

    public Knight(int n){

	maxx=n+4;
	maxy=n+4;
	board = new int[maxy][maxx];
	for(int i=0; i<board.length;i++){
	    for(int j=0;j<board[i].length;j++){
		if(i<2 || i>maxx-3 || j<2 || j>maxy-3){
		    board[i][j]=-1;
		}
	    }
	}
    }

    public void wait(int millis){
	try {
	    Thread.sleep(millis);
	}
	catch (InterruptedException e) {
	}
    }

    public String toString(){
	String s = "";
	for(int i=0;i<board.length;i++){
	    for(int j=0;j<board[i].length;j++){
		s+=board[i][j]+"\t";
	    }
	    s+="\n"+"\n";
	}
	return s;
    }


    public void solve(){
	solve(2,2,1);

    }
    

    
    public void solve(int x,int y, int n){
	if (!solved){
	    wait(20);
	    System.out.println(this);
	    
	    //try to solve the maze here...
	    //boolean challanged = accepted;
	    
	    //If you're at the end, you're solved!
	    if (n>(maxx-4)*(maxy-4)){
		solved = true;
		return;
	    }else{

		//If you're at a wall
		if (board[x][y] != 0){
		    board[x][y] = n;
		    
		    solve(x+1, y+2,n+1);
		    solve(x-1, y+2,n+1);
		    solve(x+1, y-2,n+1);
		    solve(x-1, y-2,n+1);
		    solve(x+2, y+1,n+1);
		    solve(x-2, y+1,n+1);
		    solve(x+2, y-1,n+1);
		    solve(x-2, y-1,n+1);
		  
		    if(!solved){
			board[x][y]=0;
		    }

		}
		
	    }
	}
	
    }

}