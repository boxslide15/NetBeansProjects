/**
 * A class to implement a Polynomial as a list of terms, where each term has
 * an integer coefficient and a nonnegative integer exponent
 * @author Luis Hernandez
 */
import java.util.ArrayList;
public class Polynomial{

   private ArrayList<Term> myList;

   /**
    * Creates a new Polynomial object with no terms
    */
   public Polynomial()
   {
      myList = new ArrayList<Term>();
   }

   /**
    * Inserts a new term into its proper place in a Polynomial
    * @param coeff the coeffiecent of the new term
    * @param expo the exponent of the new term
    */
   public void insert(int coeff, int expo)
   {
      Term newTerm = new Term(coeff, expo);

      if (myList.isEmpty()){
        myList.add(newTerm);
      }
      else{
        for (int i = 0; i < myList.size(); i++){

          Term insertTerm = myList.get(i);

          int insertExp = insertTerm.getExponent();

          if (expo <= myList.get(myList.size() - 1).getExponent()){
            myList.add(newTerm);
          }
          else if (insertExp <= expo){
              myList.add(i, newTerm);
          }

        }
      }
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
      int index = 0;
      boolean removed = false;
      for (int i = 0; i < myList.size(); i++){

        Term deleteTerm = myList.get(i);

        if (deleteTerm.getCoefficient() == coeff && deleteTerm.getExponent() == expo){
          myList.remove(i);
          System.out.println("Removed term from array");
          removed = true;
        }
      }

      if (removed == false){
        System.out.println("Term wasn't found, nothing removed");
      }

      System.out.println("delete method called for " + coeff + " " + expo) ;
   }

   /**
    * Returns the product of all the terms of a Polynomial, as a String
    * E.g. for the polynomial 3x^2 + 7x^3 + 2x^5, will return 42x^10
    * @return the polynomial product, as a String
    */
   public String product()
   {
      int coeffProduct = myList.get(0).getCoefficient();
      int expoProduct = myList.get(0).getExponent();

      for (int i = 1; i < myList.size(); i++){
        coeffProduct *= myList.get(i).getCoefficient();
        expoProduct += myList.get(i).getExponent();
      }

      Term product = new Term(coeffProduct, expoProduct);

      System.out.println("product method called") ;
      return product.toString();
   }

   /**
    * Returns a polynomial as a String in this form: 3x^2 + 7x^3 + 2x^5
    * @return the polynomial as a String
    */
   public String toString()
   {
      String expression = "";

      for (int i = 0; i < myList.size(); i++){
        Term addTerm = myList.get(i);
        String termString = addTerm.toString();
        expression = expression.concat(termString);
      }

      System.out.println("toString method called") ;
      return expression;
   }

   /**
    * Reverses the order of the terms of a Polynomial.
    * E.g. the polynomial 3x^2 + 7x^3 + 2x^5 would be 2x^5 + 7x^3 + 3x^2 after
    * reversal
    */
   public void reverse()
   {
      ArrayList<Term> reverseTerm = new ArrayList<Term>();
      
      for (int i = myList.size(); i >= 0; i--){
          reverseTerm.add(myList.get(i));
      }
      
      for (int i = 0; i < myList.size(); i++){
          myList.remove(i);
          myList.add(i, reverseTerm.get(i));
      }
      
      System.out.println("reverse method called") ;
   }
}
