/*
****
****
****
****

 */
public class MagicSquare {
	//instance variables
	private int[][] square;
	
	//constructor
	MagicSquare(int[][] arr){
		square = arr;
	}
	
	//display the matrix
	void display() {
		for(int[] r : square) {
			for(int c : r) {
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}
	
	//test if square has no duplicate values
	boolean unique() {
		for(int num=1; num<square.length*square[0].length; num++) {
			int count = 0;
			for(int[] r : square) {
				for(int c : r) {
					if(c==num) {
						count++;
					}
				}
			}
			if(count>1) {
				return false;
			}
		}
		return true;
	}
	
	//returns the sum of a row
	int sumRow(int row) {
		int sum = 0;
		for(int i=0; i<square[row].length; i++) {
			sum+=square[row][i];
		}
		return sum;
	}
	
	//returns the sum of a column
	int sumColumn(int col) {
		int sum = 0;
		for(int i=0; i<square.length; i++) {
			sum+=square[i][col];
		}
		return sum;
	}
	
	//returns the sum of both diagonals (true for first, false for second)
	int sumDiag(boolean t) {
		int sum = 0;
		if(t==true) {
			for(int i=0; i<square.length; i++) {
				sum+=square[i][i];
			}
		}
		else {
			for(int r=0; r<square.length; r++) {
				for(int c=0; c<square[r].length; c++) {
					sum+=square[r][c];
				}
			}
		}
		return sum;
	}
	//determine if the square is a magic square
	boolean isMagic() {
		int count = 0;
		int test = sumRow(0);
		for(int i=0; i<square.length; i++) {
			if(test==sumRow(i) || test==sumColumn(i) || test==sumDiag(true) || test==sumDiag(false)) {
				count++;
			}
		}
		return count==9;
	}
	
	//main method
	public static void main(String[] args) {
		int[][] square = {{1,4,12,8},{2,5,13,16},{7,3,10,9},{11,6,14,15}};
		MagicSquare squ = new MagicSquare(square);
		squ.display();
		System.out.println(squ.unique());
		System.out.println(squ.sumRow(0));
		System.out.println(squ.sumColumn(0));
		System.out.println(squ.sumDiag(true));
		System.out.println(squ.isMagic());
	}
}
