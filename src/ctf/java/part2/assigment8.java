package ctf.java.part2;

public class assigment8 {
	public static void main(String[] args) {
		int[][] twoD_Array = {
				{1, 2, 3},{4, 5, 6},{7,8, 9}
				};
		//1.
		for (int row = 0; row < twoD_Array.length; row++){
			for (int element = 0; element < twoD_Array[row].length; element++){
			System.out.println(twoD_Array[row][element]);
			}
		}
		//2.
		System.out.print("Sum of last each row :");
		int sum = 0;
		for (int row = 0; row < twoD_Array.length; row++){
			sum += (twoD_Array[row][twoD_Array[row].length -1]);
		}
		System.out.println(sum);
	}
}
