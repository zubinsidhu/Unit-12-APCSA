
public class Lab12_2 {

	public static void main(String[] args) {
		int[] a1 = {-1, 0, 5, -8, 1, 2, 4, -9, 0, 9};
		int[] a2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] a3 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		int[] a4 = {-12, 44, 5, -81, 1, 22, 4, -19, 10, 19};
		System.out.println(findMin(a1, 6));
		System.out.println(findMin(a2, 7));
		System.out.println(findMin(a3, 1));
		System.out.println(findMin(a4, 8));
	}

	public static int findMin(int[] a, int n) {
		if (n == 0) return a[n];
		int x = findMin(a, n - 1);
		if (a[n - 1] < x) return a[n - 1];
		else return x;
	}
}