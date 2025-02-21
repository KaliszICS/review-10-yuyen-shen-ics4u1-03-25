public class PracticeProblem {

	public static void main(String args[]) {
		pyramid(4);
		pyramid(8);
		square(5);
		square(3);
		System.out.println(hasLowercase("yes"));
		System.out.println(hasLowercase("NO"));
	}

	//q1
	public static void pyramid(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 0; j < num; j++) {
				if (j < num - i) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}

	//q2
	public static void square(int num2) {
		for (int a = 0; a < num2; a++) {
			for (int b = 0; b < num2; b++){
				if (a == 0 || a == num2 - 1 || b == 0 || b == num2 - 1){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

	//q3
	public static boolean hasLowercase(String word) {
		for (int x = 0; x < word.length(); x++) {
			if (word != word.toUpperCase()) {
				return true;
			}
		}
		return false;
	}
}
