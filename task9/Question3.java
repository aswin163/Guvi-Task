package task9;
//Q3. Program to print the given number pattern

public class Question3 {

	public static void main(String[] args) {
		int num = 1;
		for(int i=0; i<=4; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}

	}

}
