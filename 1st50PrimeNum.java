class PrimeNumber {  
    public static void main(String[] args) {
      
    final int NUMBER_OF_PRIMES = 50; // Number of primes to display
    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
      
    int newnumm = NUMBER_OF_PRIMES;
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness
      
    System.out.println("The first 50 prime numbers are \n");
      
    // Repeatedly find prime numbers
    while (count < NUMBER_OF_PRIMES) {
    boolean isPrime = true;
    // Test whether number is prime

        int counter = 2;
        while (counter * counter <= newnumm && isPrime) {
            if (newnumm % counter == 0) isPrime = false;
            else {counter = (counter == 2) ? 3 : counter+2}; 
        }

    // Display the prime number and increase the count
    if (isPrime) {
        count++; // Increase the count
        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) System.out.println(number);
        else System.out.print(number + " ");
    }
    // Check if the next number is prime
    number = (number == 2) ? 3 : number+2; // unless it was 2. so
    }
  }
}
