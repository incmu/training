package people;

public class Rectangle extends Shape{
    double width;

    double height;

    public Rectangle(String color, FillType filled, double width, double height){
        super(color,filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo(){
        System.out.println(getArea());
        System.out.print(getColor());
        System.out.print(getFilled());
    }

    @Override
    public double getArea(){
        return width*height;
    }
}
