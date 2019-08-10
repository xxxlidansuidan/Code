class PrimeNumber {  
    public static void main(String[] args) {
      
    final int NUMBER_OF_PRIMES = 50; // Number of primes to display
    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
      
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness
      
    System.out.println("The first 50 prime numbers are \n");
      
    // Repeatedly find prime numbers
    while (count < NUMBER_OF_PRIMES) {
    boolean isPrime = true;
    // Test whether number is prime
    for (int divisor = 2; divisor <= number / 2 && isPrime; divisor++) {
        if (number % divisor == 0) isPrime = false; 
    }
    // Display the prime number and increase the count
    if (isPrime) {
        count++; // Increase the count
        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) System.out.println(number);
        else System.out.print(number + " ");
    }
    // Check if the next number is prime
    number++;
    }
  }
}
