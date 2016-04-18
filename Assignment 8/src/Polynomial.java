/**
 * A class to implement a Polynomial as a list of terms, where each term has
 * an integer coefficient and a nonnegative integer exponent
 * @author your name
 */
public class Polynomial
{
   // instance variable declarations go here

   /**
    * Creates a new Polynomial object with no terms
    */
   public Polynomial()
   {
      // TO DO: Write constructor body here
   }

   /**
    * Inserts a new term into its proper place in a Polynomial
    * @param coeff the coeffiecent of the new term
    * @param expo the exponent of the new term
    */
   public void insert(int coeff, int expo)
   {
      // TO DO: write method body here.  The following statement is included
      // only for development purposes.  Remove after implementing the method 
      System.out.println("insert method called for " + coeff + " " + expo) ;
   }

   /**
    * Deletes the first occurrence of a specified term from a Polynomial, or
    * prints an appropriate message if the term does not appear in the 
    * Polynomial
    * @param coeff the coeffiecent of the term to be deleted
    * @param expo the exponent of the term to be deleted
    */
   public void delete (int coeff, int expo)
   {
      // TO DO: write method body here.  The following statement is included
      // only for development purposes.  Remove after implementing the method 
      System.out.println("delete method called for " + coeff + " " + expo) ;
   }

   /**
    * Returns the product of all the terms of a Polynomial, as a String
    * E.g. for the polynomial 3x^2 + 7x^3 + 2x^5, will return 42x^10
    * @return the polynomial product, as a String
    */
   public String product()
   {
      // TO DO: write method body here.  The following statements are included
      // only for development purposes.  Remove after implementing the method
      System.out.println("product method called") ;
      return "product method is under construction" ;
   }

   /**
    * Returns a polynomial as a String in this form: 3x^2 + 7x^3 + 2x^5
    * @return the polynomial as a String
    */
   public String toString()
   {
      // TO DO: write method body here.  The following statements are included
      // only for development purposes.  Remove after implementing the method
      System.out.println("toString method called") ;
      return "toString method is under construction" ;
   }
   
   /**
    * Reverses the order of the terms of a Polynomial.
    * E.g. the polynomial 3x^2 + 7x^3 + 2x^5 would be 2x^5 + 7x^3 + 3x^2 after
    * reversal
    */
   public void reverse()
   {
      // TO DO: write method body here.  The following statement is included
      // only for development purposes.  Remove after implementing the method
      System.out.println("reverse method called") ;
   }
}