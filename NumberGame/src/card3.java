
public class card3 {

	public int C[] = new int[52];

	public card3() {

		System.out.println("\n Is There Your Number Betwen These Numbers");
		int i3 = 4;
		for (int x = 0; x < C.length; x++) {
			C[x] = i3;
			i3++;
			if (i3 % 8 == 0)
				i3 += 4;
			System.out.print(C[x] + ",");
			if ((x + 1) % 8 == 0)
				System.out.println();
		}
		System.out.println("\nPlease Answer With (y or n):");
		System.out.println("------------------------------");
	}
}
