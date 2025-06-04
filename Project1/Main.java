public class Main {

    FINAL static int boardSize = 8;

    static int[][] chessBoard  = new int[8][8];

    //possible moves for the knight
    static int[] x = {2, 1, -1, -2, -2, -1, 1, 2};
    static int[] y = {1, 2, 2, 1, -1, -2, -2, -1};

    //solving the knight's tour with backtracking + Warnsdorff' rule
    public static boolean solveKnightTour(int x, int y, int moveCount){

        if(moveCount > boardSize * boardSize){
            return true; // all squares are visited
        }

        int [][] nextMoves = getSortedMoves(x, y);
    }

    // getting next possible moves for the knight --> sorted by Warnsdorff's Rule (least onward moves)
    public static int[][] getSortedMoves(int x, int y){
        
    }

    public static boolean isValidStart(int x, int y){

        if(x < 0 || x >= boardSize || y < 0 || y >= boardSize){
            return false;
        }

        return true;
    }

    public static void main(String[] args){

        //initializing unvisited spaces with 0 
        for(int i = 0; i < 8;i++){
            for(int j = 0; j < 8; j++){
                chessBoard[i][j] = 0;
            }
        }

        //starting position of the knight
        int startX;
        int startY;
        System.out.println("Enter the starting position of your knight (x, y): ");
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        startX = scanner.nextInt();
        startY = scanner.nextInt();

        // checking if the starting position is valid
        if(!isValidStart(startX, startY)){
            System.out.println("Invalid starting position. Please enter a new starting position:");
            return;
        }

        // solve the knights tour
        if (solveKnightTour(starX, startY, 2)){
            printBoard();
        }
        else{
            System.out.println("No solution found :(");
        }
    }
 
    
}
