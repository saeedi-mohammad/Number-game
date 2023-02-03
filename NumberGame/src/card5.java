
public class card5 {

	public int E[] = new int[48];

	public card5() {

		System.out.println("\n Is There Your Number Betwen These Numbers");

		int i5 = 16;
		for (int x = 0; x < E.length; x++) {
			E[x] = i5;
			i5++;
			if (i5 % 32 == 0)
				i5 += 16;
			System.out.print(E[x] + ",");
			if ((x + 1) % 8 == 0)
				System.out.println();

		}
		System.out.println("\nPlease Answer With (y or n):");
		System.out.println("------------------------------");
	}
}
