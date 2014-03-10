#Knights Tour

### My Tour

My tour uses two arrays of ints that hold the possible pairs of x and y moves. A for loop loops through them, attempting to look for a solution in each of 8 directions. If the direction is valid and unused, it drops a number there, and calls the recursion. For some reason, it does not appear to be backtracking properly, or decrementing moveNum in the way I want it to… We will see.


A knight's tour is a sequence of moves of a knight on a chessboard such that the knight visits every square only once. If the knight ends on a square that is one knight's move from the beginning square (so that it could tour the board again immediately, following the same path), the tour is closed, otherwise it is open. The exact number of open tours on an 8x8 chessboard is still unknown.  
The knight's tour problem is the mathematical problem of finding a knight's tour. Creating a program to find a knight's tour is a common problem given to computer science students.[1] Variations of the knight's tour problem involve chessboards of different sizes than the usual 8 × 8, as well as irregular (non-rectangular) boards.

### Theory
Knight's graph showing all possible paths for a Knight's tour on a standard 8×8 chessboard. The numbers on each node indicate the number of possible moves that can be made from that position.
The knight's tour problem is an instance of the more general Hamiltonian path problem in graph theory. The problem of finding a closed knight's tour is similarly an instance of the Hamiltonian cycle problem. Note, however, that unlike the general Hamiltonian path problem, the knight's tour problem can be solved in linear time.

###### Source
[Thanks, Wikipedia](http://en.wikipedia.org/wiki/Knight's_tour)