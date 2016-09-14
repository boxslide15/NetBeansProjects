/**
 *
 * @author Luis Hernandez
 */
public class TriangleAnalyzer {
    
    private int triangleSide1;
    private int triangleSide2;
    private int triangleSide3;
    
    public TriangleAnalyzer(int side1, int side2, int side3){
        triangleSide1 = side1;
        triangleSide2 = side2;
        triangleSide3 = side3;
    }
    
    public String getTriangleSides(){
        return "Triangle length first side: " + Integer.toString(triangleSide1) + ", second side: " + Integer.toString(triangleSide2) + ", third side: " + Integer.toString(triangleSide3);
    }
    
    public boolean isTriangle(){
        return triangleSide1 + triangleSide2 > triangleSide3 && triangleSide2 + triangleSide3 > triangleSide1 && triangleSide1 + triangleSide3 > triangleSide2;
    }
    
    public boolean isEquilateral(){
        return triangleSide1 == triangleSide2 && triangleSide2 == triangleSide3 && triangleSide1 == triangleSide3;
    }
    
    public boolean isIsosceles(){
        return triangleSide1 == triangleSide2 || triangleSide2 == triangleSide3 || triangleSide1 == triangleSide3;
    }
    
    public boolean isRight(){
        return (Math.pow(triangleSide1, 2) + Math.pow(triangleSide2, 2) == Math.pow(triangleSide3, 2)) || 
               (Math.pow(triangleSide2, 2) + Math.pow(triangleSide3, 2) == Math.pow(triangleSide1, 2)) || 
               (Math.pow(triangleSide1, 2) + Math.pow(triangleSide3, 2) == Math.pow(triangleSide2, 2));
    }
    
    public boolean isObtuse(){
        return (Math.pow(triangleSide1, 2) + Math.pow(triangleSide2, 2) < Math.pow(triangleSide3, 2)) || 
               (Math.pow(triangleSide2, 2) + Math.pow(triangleSide3, 2) < Math.pow(triangleSide1, 2)) || 
               (Math.pow(triangleSide1, 2) + Math.pow(triangleSide3, 2) < Math.pow(triangleSide2, 2));
    }
    
    public String typeOfTriangle(){
        String triangleType;
        if (isTriangle()){
           if (isEquilateral()){
               triangleType = "Equilateral triangle";
           }
           else if (isIsosceles()){
                if (isRight()){
                triangleType = "Right Isosceles triangle.";
                }
            else if (isObtuse()){
                triangleType = "Obtuse Isosceles triangle.";
            }
            else{
                triangleType = "Acute Iscosceles triangle.";
            }
        }
        else if (isRight()){
                triangleType = "Right triangle.";
                }
            else if (isObtuse()){
                triangleType = "Obtuse triangle.";
                }
            else{
                triangleType = "Acute triangle.";
            }
        }
        else{
            triangleType = "The side lengths don't form a triangle";
        }
        
        return triangleType;
    }
    
    public Double areaOfTriangle(){
        Double s = (triangleSide1 + triangleSide2 + triangleSide3) * 0.5;
        return Math.sqrt(s * (s - triangleSide1) * (s - triangleSide2) * (s - triangleSide3));
    }
}