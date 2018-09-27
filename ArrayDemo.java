public class ArrayDemo {
	public static void main(String[] args) {
		int[] test = new int[10];
		int[][] test2d = new int[10][10];
		printArray(test);
		printArray(test2d);
		System.out.println(countZeros2D(test2d));
		fill2D(test2d);
		printArray(test2d);
		fill2DCopy(test2d);
		printArray(test2d);
	}
	
	public static void printArray(int[]ary) {
		String out = "[";
		for(int i = 0; i < ary.length; i++) {
			if (i == ary.length - 1) {					
				out += String.valueOf(ary[i]) + "]";
			}
			else {
				out += String.valueOf(ary[i]) + ", ";
			}
		}
			System.out.println(out);
	}
	
	public static void printArray(int[][]ary) {
		System.out.println("[");
		for(int i = 0; i < ary.length; i++) {
			printArray(ary[i]);
		}
		System.out.println("]");
	}
	
	
	public static int countZeros2D(int[][] nums) {
		int count = 0;
		for(int d1 = 0; d1 < nums.length; d1++) {
			for(int d2 = 0; d2 < nums[d1].length; d2++) {
				if(nums[d1][d2] == 0) {
					count += 1;
				}
			}	
		}
		return count;
	}
	
	public static void fill2D(int[][] vals) {
		for(int d1 = 0; d1 < vals.length; d1++) {
			for(int d2 = 0; d2 < vals[d1].length; d2++) {
				if(d1 == d2) {
					vals[d1][d2] = 3;
				}
				else {
					vals[d1][d2] = 1;
				}
			}
		}
	
	}

	public static void fill2DCopy(int[][] vals) {
                for(int d1 = 0; d1 < vals.length; d1++) {
                        for(int d2 = 0; d2 < vals[d1].length; d2++) {
                                if(vals[d1][d2] < 0) {
                                        vals[d1][d2] = 3;
                                }
                                else {
                                        vals[d1][d2] = 1;
                                }
                        }
                }

        }



}
