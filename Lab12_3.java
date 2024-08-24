
public class Lab12_3 {

	public static void main(String[] args) {
		System.out.println("C(7, 0) = " + binomialCoeff(7, 0));
		System.out.println("C(7, 1) = " + binomialCoeff(7, 1));
		System.out.println("C(7, 2) = " + binomialCoeff(7, 2));
		System.out.println("C(7, 3) = " + binomialCoeff(7, 3));
		System.out.println("C(7, 4) = " + binomialCoeff(7, 4));
		System.out.println("C(7, 5) = " + binomialCoeff(7, 5));
		System.out.println("C(7, 6) = " + binomialCoeff(7, 6));
		System.out.println("C(7, 7) = " + binomialCoeff(7, 7));
	}

	public static int binomialCoeff(int n, int k) {
		if (k == 0 || k == n) return 1;
		return binomialCoeff(n-1,k-1) + binomialCoeff(n-1,k);
	}
}