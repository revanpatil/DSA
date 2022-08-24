import java.util.Arrays;

public class RowsColMatrix {

	public static void main(String[] args) {
		int arr[][] = new int[][] {
			{10,20,30,40},
			{15,25,35,45,},
			{28,29,37,49},
			{33,34,38,50}
		};
		
		int target = 49;

		System.out.println(Arrays.toString(search(arr,49)));

	}


	static int[] search(int [][]matrix ,int target) { 
		int r =0; int c = matrix.length-1;     //gives sze of matrix i.e row size
    //lower bound = r = 0;
    //upper bound = c =3;
		while(r<matrix.length && c>0) {
			if(matrix[r][c] == target) {    // when [r][c] == target 
				return new int[] {r,c};
			}
			if(matrix[r][c] < target) {   // when [r][c] < target ---> move to next row
 				r++;
			}
			else {          //when [r][c] > target ---> decreament the column i.e previous col
				c--;
			}
		}
		return new int[] {-1,-1};
	}


}
