public class MagicSquare {
	//instance variables
	
	//constructor
	MagicSquare(int[][] arr){
    
	}
	
	//display the matrix
	void display() {

	}
	
	//test if square has no duplicate values
	boolean unique() {

	}
	
	//returns the sum of a row
	int sumRow(int row) {

	}
	
	//returns the sum of a column
	int sumColumn(int col) {

	}
	
	//returns the sum of both diagonals (true for first, false for second)
	int sumDiag(boolean t) {

	}
	//determine if the square is a magic square
	boolean isMagic() {

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
