class QuickSort {
	public static void main(String[] args) {
		int[] x = { 9, 2, 4, 7, 3, 7, 10 };
		System.out.println(Arrays.toString(x));
 
		int low = 0;
		int high = x.length - 1;
 
		quickSort(x, low, high);
		System.out.println(Arrays.toString(x));
	}
 
	public static void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
 
		if (low >= high)
			return;
 
		// pick the pivot
		int pivot = arr[low+(high-low)/2];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
 
			while (arr[j] > pivot) {
				j--;
			}
 
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}
}

//mine
import java.util.Scanner;
class Code {
        private static void swap(int[] arr, int i, int j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }
        public static int partition(int[] arr, int low, int high) {
                int pivot = arr[high];
                int i = (low - 1);
                for (int j = low; j < high; j++) {
                        if (arr[j] <= pivot) {
                                i++;
                                swap(arr, i, j);
                        }
                }
                swap(arr, i+1, high);
                for (int k : arr)
                        System.out.print(k + " ");
                System.out.println();
                return i+1;
        }
        public static void sort(int[] arr, int low, int high) {
                if (low < high) {
                        int pivot = partition(arr, low, high);
                        sort(arr, low, pivot - 1);
                        sort(arr, pivot + 1, high);
                }
        }
        public static void sort(int[] arr) {
                sort(arr, 0, arr.length - 1);
        }
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int[] arr = new int[input.nextInt()];
                for (int i = 0; i < arr.length; i++)
                        arr[i] = input.nextInt();
                sort(arr);
                for (int i : arr)
                        System.out.print(i + " ");
                System.out.println();
        }
}

