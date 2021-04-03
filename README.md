# Sliding Puzzle
> 3 by 3 sliding puzzle that's automatically solved using the A* search algorithm.

This program consists of the implementation of the A* Search Algorithm that solves the 3x3 sliding puzzle game automatically.

We will call "state" each possible configuration of the board, therefore,  the board shown bellow will be the target state (solution). 
[1][2][3]
[4][5][6]
[7][8][ ]

The objective of the program is that, starting from an initial state on the board which contains the disordered tiles, it will find the sequence of states that we bring them to the goal state. The total number of states that can be had in a 3x3 board is of factorial order, that is, 9! = 362,880 possible states.

The steps followed by the algorithm are listed below:
1. Create two lists called L1 and L2. Add the initial state to L1. L2 is empty.
2. Make n = the first element of L1. If n equal to the target state, the algorithm ends successfully.
3. Obtain the following possible states of n according to the movement of chips that we can make. Evaluate each of the states in f(n), discard those states that are in L2, add them to L1 and order L1 from least to greatest according to the evaluation function f(n).
4. Move n from L1 to L2.
5. If L1 is not empty, go back to step 2, otherwise the algorithm ends with an error.

2 ways to calculate f(n):
+ g(n) = number of tiles that are not in their position or square.
+ h(n) = sum of the distances of each piece to the tile it should be.
