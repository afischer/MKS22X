public class exercises{
    ////////PART 1////////
    
    //1. Test the setDirection method with the following inputs and complete the table, giving the compass direction each input represents.
    
    //2. Move a bug to a different location using the moveTo method. In which directions can you move it? How far can you move it? What happens if you try to move the bug outside the grid?

    //3. Change the color of a bug, a flower, and a rock. Which method did you use?
    
    //4. Move a rock on top of a bug and then move the rock again. What happened to the bug?
    
    
    ////////PART 2////////
    
    //1. Write a class CircleBug that is identical to BoxBug, except that in the act method the turn method is called once instead of twice. How is its behavior different from a BoxBug?
    
    //2. Write a class SpiralBug that drops flowers in a spiral pattern. Hint: Imitate BoxBug, but adjust the side length when the bug turns. You may want to change the world to an UnboundedGrid to see the spiral pattern more clearly.
    
    //3. Write a class ZBug to implement bugs that move in  pattern, starting in the top left corner. After completing  pattern, a ZBug should stop moving. In any step, if a ZBug t move and is still attempting to complete  pattern, the ZBug does not move and should not turn to start a new side. Supply the length of  as a parameter in the constructor. The following image shows  pattern of length 4. Hint: Notice that a ZBug needs to be facing east before beginning  pattern.

    // 4. Write a class DancingBug  by making different turns before each move. The DancingBug constructor has an integer array as parameter. The integer entries in the array represent how many times the bug turns before it moves. For example, an array entry of 5 represents a turn of 225 degrees (recall one turn is 45 degrees). When a dancing bug acts, it should turn the number of timesgivenbythecurrentarrayentry,thenactlikeaBug. Inthenextmove,it should use the next entry in the array. After carrying out the last turn in the array, it should start again with the initial array value so that the dancing bug continually repeats the same turning pattern.    The DancingBugRunner class should create an array and pass it as a parameter to the DancingBug constructor    


    
}
