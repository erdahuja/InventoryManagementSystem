
public class InsertionSort {
	public static void main(String[] args) {

		// ,int a[] = { 6, 5, 4, 3, 2, 1 };// worst
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };// best
		// int a[]={6,4,2,1,3,5};//avg
		int x, temp;
		int time = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < i; j++) {
				x = a[i];
				/*
				 * System.out.println("\nkey-" + x); System.out.println("value-"
				 * + a[j]);
				 */
				if (x < a[j]) {
					temp = x;
					a[i] = a[j];
					a[j] = temp;
					time++;

				}

			}

		}
		for (int i1 = 0; i1 < a.length; i1++) {
			System.out.print(a[i1] + " ");
		}
		System.out.println("\ntime " + time);
	}

}
