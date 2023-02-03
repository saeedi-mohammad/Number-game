
public class card2 {

	public int B[] = new int[54];

	public card2() {

		System.out.println("\n Is There Your Number Betwen These Numbers");

		int i2 = 2;
		for (int x = 0; x < B.length; x++) {
			B[x] = i2;
			i2++;
			if (i2 % 4 == 0)
				i2 += 2;
			System.out.print(B[x] + ",");
			if ((x + 1) % 8 == 0)
				System.out.println();

		}
		System.out.println("\nPlease Answer With (y or n):");
		System.out.println("------------------------------");
	}

}// end of class
