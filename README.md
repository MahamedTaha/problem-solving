# problem-solving
public class starPattern {
	public static void main(String[] args) {
		int num = 5;
		int temp = num;
		for (int i = 0; i < num; i++) {
			for (int n = 0; n < temp - 1; n++) System.out.print(" ");
			for (int j = 0; j <= i; j++) System.out.print("* ");
			temp--;
			System.out.println();
		}
/////////////////////////////////////////////////////////////////////////////
		int temp2= num;
		for (int f = 0; f < temp2*2; f++) {
	System.out.print(" ");
			for (int j = 0; j <f; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < temp2-1 ; j++) 	System.out.print("* ");
			temp2--;
			System.out.println();
		}
	}
}
