
public class card1 {

	public int A[] = new int[54];

	public card1() {

		System.out.println("\n Is There Your Number Betwen These Numbers");
		int i1 = 1;
		for (int x = 0; x < A.length; x++) {
			A[x] = i1;
			i1 += 2;
			System.out.print(A[x] + ",");
			if ((x + 1) % 8 == 0)
				System.out.println();
		}
		System.out.println("\nPlease Answer With (y or n):");
		System.out.println("------------------------------");
	}

}// end of class
