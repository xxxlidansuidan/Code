import java.util.Scanner;
class Code {
        /** Main method */
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in); // Create a Scanner
                System.out.println("Enter the length of array: ");
                int[] numbers = new int[input.nextInt()]; // Create an array of length 10 

                // Prompt the user to enter ten numbers
                System.out.println("Enter your numbers: ");
                for (int i = 0; i < numbers.length; i++)
                        numbers[i] = input.nextInt();

                // Invoke bubblesort method
                insertionSort(numbers);

                // display the sorted numbers
                for (int e: numbers) {
                        System.out.print(e + " ");
                }
                System.out.println();
        }
        public static void insertionSort(int... a) {
                for (int i = 1; i < a.length; i++) {
                        int temp = a[i];
                        int j = i - 1;
                        while (j >= 0 && a[j] > temp) {
                                a[j+1] = a[j];
                                j = j - 1;
                        }
                        a[j+1] = temp;
                }
        }
}
