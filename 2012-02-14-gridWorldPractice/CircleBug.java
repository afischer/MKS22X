import info.gridworld.*;
    
public class CircleBug extends Bug{
    private int steps;
    private int sideLength;
    public CircleBug(int n)
    {
	sideLength = n;
    }
    public void act()
    {
             if (steps<sideLength && canMove()==true)
                 {
                     move();
                     steps++; }
	     else {
		turn();
		steps = 0; }
    }
}
