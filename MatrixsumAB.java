import java.util.*;
class MatrixsumAB
{
	public static void main(String[] args)
	{
		Scanner x = new Scanner(System.in);
		int row,col;

		int [][] A = new int[3][3];
		int [][] B = new int[3][3];
		int [][] C = new int[3][3];

		System.out.println("Enter First Matrix Elements : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				A[row][col] = x.nextInt();
		}
	
		System.out.println("Enter Second Matrix Elements : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				B[row][col] = x.nextInt();
		}


		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				C[row][col] = A[row][col]+B[row][col];
		}

		System.out.println("Elements of Matrix First are : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				System.out.print(A[row][col]+" ");
			
			System.out.println();
		}

		System.out.println("Elements of Matrix Second are : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				System.out.print(B[row][col]+" ");
			
			System.out.println();
		}

		System.out.println("Sum of both the matrix is : ");
		for(row = 0; row<3; row++)
		{
			for(col = 0; col<3; col++)
				System.out.print(C[row][col]+" ");
			
			System.out.println();
		}


 	}
}