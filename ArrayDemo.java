public class ArrayDemo {
	public static void main(String[] args) {
		int[] test = new int[10];
		int[][] test2d = new int[10][10];
		printArray(test);
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
		
		
}