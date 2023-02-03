import java.util.Scanner;

public class Nmain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		sourse H = new sourse();
		System.out.print("Do You Want to Start?(y/n):");
		String start = input.nextLine();
		if (start.charAt(0) != 'y')
			return;
		int flag = 1;
		while (flag == 1) {
			if (flag == 0)
				System.out.println("-------------------------------");
			System.out.println("\nConsider a number between 1 to 107");

			new card1();
			start = input.nextLine();
			if (start.charAt(0) == 'y')
				H.Seta();

			new card2();
			start = input.nextLine();
			if (start.charAt(0) == 'y')
				H.Setb();

			new card3();
			start = input.nextLine();
			if (start.charAt(0) == 'y')
				H.Setc();

			new card4();
			start = input.nextLine();
			if (start.charAt(0) == 'y')
				H.Setd();

			new card5();
			start = input.nextLine();
			if (start.charAt(0) == 'y')
				H.Sete();

			new card6();
			start = input.nextLine();
			if (start.charAt(0) == 'y')
				H.Setf();

			new card7();
			start = input.nextLine();
			if (start.charAt(0) == 'y')
				H.Setg();

			if (H.Get() > 107 || H.Get() == 0) {
				System.out.println("One or more Steps in your selection have been mistake");
				System.out.println("\n Do You Want to Try Again?(y/n):");
				flag = 0;
				start = input.nextLine();
				if (start.charAt(0) != 'y')
					break;
			} else {
				System.out.println("your Number was:" + H.Get());
				break;
			}
		}
		input.close();

	}// end of main

}// end of class
