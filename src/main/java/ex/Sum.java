package ex;

public class Sum {
	public static int arrayPlusArray(int[] arr1, int[] arr2) {
		int count = 0;

		for (int i = 0; i < arr1.length; i++) { //for (int cur : arr1){
			count += arr1[i];					// count += cur;
		}
		for (int j = 0; j < arr2.length; j++) { //si può mettere la stessa variabile i o cur perchè è locale quindi muore quando si chiude la graffa 
			count += arr2[j];
		}
		return count;
	}
}
