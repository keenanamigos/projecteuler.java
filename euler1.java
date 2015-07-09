public class Euler1 {
   
   public static void main(String[] args) 
   {
      int x = 0;
      for(int i = 1; i < 1000; ++i) 
         if (i % 3 == 0 | i % 5 == 0)
            x += i;

      System.out.println(x);
   }
}

// X variable will be what the results are stored in for the final result
// For loop to iterate through i from 1 to 1000
// If i is divisible by 3 or by 5, store it into x

/* If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000. */
