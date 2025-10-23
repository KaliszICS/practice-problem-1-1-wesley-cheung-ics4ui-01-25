public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}
	public static int sum2D(int[][] nums) {
		int sum = 0;
		for (int i = 0;i<nums.length;i++) {
			for (int j = 0;j<nums[i].length;j++) {
				sum += nums[i][j];
			}
		}
		return sum;
	}
	public static int sumRow(int[][] nums, int row) {
		int sum = 0;
		for (int j = 0;j<nums[row].length;j++) {
				sum += nums[row][j];
			}
			return sum;
		}
	public static int sumColumn(int[][] nums, int column) {
		int sum = 0;
		for (int j = 0;j<nums.length;j++) {
				sum += nums[j][column];
			}
		return sum;
		}
}
