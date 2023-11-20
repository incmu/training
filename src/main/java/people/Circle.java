package people;

public class Circle extends Shape{

    double radius;

    public Circle(String color, FillType filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void displayInfo(){
        System.out.println(getArea());
        System.out.print(getColor());
        System.out.print(getFilled());
    }

    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
