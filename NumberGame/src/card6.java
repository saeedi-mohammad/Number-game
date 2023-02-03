
public class card6 {

	public int F[] = new int[44];

	public card6() {

		System.out.println("\n Is There Your Number Betwen These Numbers");

		int i6 = 32;
		for (int x = 0; x < F.length; x++) {
			F[x] = i6;
			i6++;
			if (i6 % 64 == 0)
				i6 += 32;
			System.out.print(F[x] + ",");
			if ((x + 1) % 8 == 0)
				System.out.println();

		}
		System.out.println("\nPlease Answer With (y or n):");
		System.out.println("------------------------------");
	}
}
