
public class card4 {

	public int D[] = new int[52];

	public card4() {

		System.out.println("\n Is There Your Number Betwen These Numbers");

		int i4 = 8;
		for (int x = 0; x < D.length; x++) {
			D[x] = i4;
			i4++;
			if (i4 % 16 == 0)
				i4 += 8;
			System.out.print(D[x] + ",");
			if ((x + 1) % 8 == 0)
				System.out.println();

		}
		System.out.println("\nPlease Answer With (y or n):");
		System.out.println("------------------------------");
	}
}
