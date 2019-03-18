package model;

/**
 *
 * @author Alunos
 * @since 18/03 - 11:00
 * @version 1.0 Freys Version
 * 
 */
public class Rectangle {
    private double base;
    private double heigth;

    public Rectangle() {
    }

    public Rectangle(double side) {
        this.base = side;
    }
    
    //getters
    public double getBase() {
        return base;
    }

    public double getHeigth() {
        return heigth;
    }
    
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    //setters
    
    /**
     * 
     * @return the area of the rectangle
     */
    public double rectangleArea(){
        return this.base * this.heigth;
    }
     /**
     * @return the perimeter of the rectangle
     */
    public double rectanglePerimeter(){
        return this.base * 2 + this.heigth * 2;
    }
    
    @Override
    public String toString() {
        return "A área do retângulo de base= " + this.base +
                "\n e altura= " + this.heigth + "\n é = " + rectangleArea() +
                "\n e o perimetro é = " + rectanglePerimeter();
    }
    
    
}
