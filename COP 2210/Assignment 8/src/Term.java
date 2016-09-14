/**
 *
 * @author Luis Hernandez
 */
public class Term {

    private int coefficient;
    private int exponent;

    public Term(int coefficient, int exponent){
      this.coefficient = coefficient;
      this.exponent = exponent;
    }

    public int getCoefficient(){
      return coefficient;
    }

    public int getExponent(){
      return exponent;
    }

    public void setCoefficient(int newCoefficient){
      coefficient = newCoefficient;
    }

    public void setExponent(int newExponent){
      exponent = newExponent;
    }

    public String toString(){
      String expression = "";
      if (coefficient > 0 || coefficient < 0 && exponent > 0){
          switch (exponent) {
              case 0:
                  expression = Integer.toString(coefficient);
                  break;
              case 1:
                  expression = coefficient + "x";
                  break;
              default:
                  expression = coefficient + "x^" + exponent;
                  break;
          }
      }
      else{
          return "That isn't a valid term object";
      }
      return expression;
    }
}
