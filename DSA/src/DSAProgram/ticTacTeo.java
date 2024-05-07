package DSAProgram;

import java.util.Scanner;

class game{
	Scanner sc=new Scanner(System.in);
	static char[][] bord;
	game(){
		bord=new char[3][3];
		initBoard();
	}
	public void initBoard() {
		for(int i=0;i<bord.length;i++) {
			for(int j=0;j<bord[i].length;j++) {
				bord[i][j]=' ';
			}
		}
	}
	
	public static void displayBoard() {
		System.out.println("-------------");
		for(int i=0;i<bord.length;i++) {
			System.out.print("| ");
			for(int j=0;j<bord.length;j++) {
				System.out.print(bord[i][j]+" | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
	public static void placeMark(int row,int col,char mark) {
		
			if(row>=0 && row<=2 && col>=0&&col<=2) {
			 
				bord[row][col]=mark;
			}
		
	}
	public static boolean colWin() {
		for(int j=0;j<3;j++) {
			if(bord[0][j]!=' ' && bord[0][j]==bord[1][j] &&bord[1][j]==bord[2][j]) {
				return true;
			}
			
		}
		return false;
	}
	
	public static boolean rowWin() {
		for(int i=0;i<3;i++) {
			if(bord[i][0]!=' '&&bord[i][0]==bord[i][1]&&bord[i][1]==bord[i][2]) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean diagnalWin() {
		if((bord[0][0]!=' '&&bord[0][0]==bord[1][1]&&bord[1][1]==bord[2][2])||bord[0][2]!=' '&&bord[0][2]==bord[1][1] &&bord[1][1]==bord[2][0] ) {
			return true;
		}
		return false;
	}
	
}

class humanPlayer{
	 String name;
	char mark;
	
	humanPlayer(String name,char mark){
		this.name=name;
		this.mark=mark;
	}
	public boolean isValidMove(int row,int col) {
		if(row>=0 && row<=2&&col>=0&&col<=2) {
		  if(game.bord[row][col]==' ') {
			  return true;
		  }
		}
		return false;
	}
	
	public void move() {
		int row;
		int col;
		
		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the row and col");
			row=sc.nextInt();
			col=sc.nextInt();
			
		}while(!isValidMove(row,col));
		
	    game.placeMark(row, col, mark);
	    game.displayBoard();
	 
	}
	
}

public class ticTacTeo {
	 
	public static void main(String[] args) {
		game obj=new game();
		 humanPlayer p1=new humanPlayer("priya",'X');
		 humanPlayer p2=new humanPlayer("bob",'O');
		 
		 
		 humanPlayer cp;
		 cp=p1;
		
		
		 while(true) {
			 System.out.println(cp.name);
		  if(game.colWin() || game.rowWin() || game.diagnalWin()) {
			  game.displayBoard();
			  System.out.println(cp.name+" has won");
			
			  break;
		  }
		  else {
			  System.out.println(cp.name);
			  cp.move();
//			  System.out.println(cp.name);
			 if(cp==p1) {
				 cp=p2;
			 }
			 else {
				 cp=p1;
			 }
		  }
		  }
		
		}
	}
	

