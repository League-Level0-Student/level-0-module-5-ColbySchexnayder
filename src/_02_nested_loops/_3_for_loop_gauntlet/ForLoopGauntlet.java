package _02_nested_loops._3_for_loop_gauntlet;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		//1.
		for (int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		//2.
		System.out.println();
		
		for (int i = 100; i >= 0; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 2; i <= 100; i += 2) {
			System.out.println(i);
		}
		
		System.out.println();
		
		for (int i = 2; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}		
		System.out.println();

		for (int i = 1; i <= 99; i +=2) {
			System.out.println(i);
		}
		System.out.println();
		
		for (int i = 1; i <= 500; i++) {
			System.out.print(i);
			if (i % 2 == 0) {
				System.out.println(" is even");
			}
			else {
				System.out.println(" is odd");
			}
		}
		System.out.println();
		
		for (int i = 0; i <= 777; i+=7) {
			System.out.println(i);
		}
		for (int i = 0; i <= 777; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println();
		
		for (int i = 0; i <= 30; i++) {
			System.out.println("In " + (1993 + i) + ", I was " + i + " years old");
		}
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + j);
			}
		}
		
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		
		num = 1;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(num + "\t");
				num++;
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 0; i <= 100; i++) {
			System.out.println(100-i);
		}
	}

}

















