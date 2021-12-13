import java.util.Scanner;
import java.io.File;
import java.io.IOException;



class Main {
  public static void main(String[] args) throws IOException {


//hi


//makes an array containing every single input in order. 
Scanner draws = new Scanner(new File("inputs.txt"));
int[] draw = new int[100];
for(int i = 0; i < 100; i++){
  draw[i] = draws.nextInt();
}


//makes a 2D array int[board #][pos in board] for every single board in order, could make it 3D for easier access later. Also a boolean array corresponding to each board.
Scanner boardScan = new Scanner(new File("boards.txt"));
int[][] board = new int[100][25];
for(int i = 0; i < 100; i++){
for(int k = 0; k < 25; k++){
board[i][k] = boardScan.nextInt();
}
}
boolean[][] tfArray = new boolean[100][25];
for(int i = 0; i < 100; i++){
for(int k = 0; k < 25; k++){
tfArray[i][k] = false;
}
}
boolean[] tagArray = new boolean[100];
for(int i = 0; i < 100; i++){
tagArray[i] = false;
}

int t = 0;

for(int n = 0; n < 100; n++){

for(int i = 0; i < 100; i++){
if(!tagArray[i]){
for(int k = 0; k < 25; k++){

if(draw[n] == board[i][k])
if(!tagArray[i]){

tfArray[i][k] = true;

if(
(tfArray[i][0] && tfArray[i][1] && tfArray[i][2] && tfArray[i][3] && tfArray[i][4]) ||
(tfArray[i][5] && tfArray[i][6] && tfArray[i][7] && tfArray[i][8] && tfArray[i][9]) ||
(tfArray[i][10] && tfArray[i][11] && tfArray[i][12] && tfArray[i][13] && tfArray[i][14]) ||
(tfArray[i][15] && tfArray[i][16] && tfArray[i][17] && tfArray[i][18] && tfArray[i][19]) ||
(tfArray[i][20] && tfArray[i][21] && tfArray[i][22] && tfArray[i][23] && tfArray[i][24]) ||
(tfArray[i][0] && tfArray[i][5] && tfArray[i][10] && tfArray[i][15] && tfArray[i][20]) ||
(tfArray[i][1] && tfArray[i][6] && tfArray[i][11] && tfArray[i][16] && tfArray[i][21]) ||
(tfArray[i][2] && tfArray[i][7] && tfArray[i][12] && tfArray[i][17] && tfArray[i][22]) ||
(tfArray[i][3] && tfArray[i][8] && tfArray[i][13] && tfArray[i][18] && tfArray[i][23]) ||
(tfArray[i][4] && tfArray[i][9] && tfArray[i][14] && tfArray[i][19] && tfArray[i][24])
){
System.out.println("dataCutoff");
System.out.println("t = " + t);
System.out.println();
t++;
tagArray[i] = true;
for(int j = 0; j < 25; j++){
if(tfArray[i][j]) System.out.print("[ ");
System.out.print(board[i][j] + " ");
if(tfArray[i][j]) System.out.print("]");
if(j%5 == 4) System.out.println();
if(j == 24) System.out.println();
}
}
}
}
}
}
}

  }
}