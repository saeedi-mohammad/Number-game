
public class card7 {

	public int G[] = new int[44];

	public card7() {

		System.out.println("\n Is There Your Number Betwen These Numbers");

		int i7 = 64;
		for (int x = 0; x < G.length; x++) {
			G[x] = i7;
			i7++;
			if (i7 % 128 == 0)
				i7 += 64;
			System.out.print(G[x] + ",");
			if ((x + 1) % 8 == 0)
				System.out.println();

		}
		System.out.println("\nPlease Answer With (y or n):");
		System.out.println("------------------------------");
	}
}
