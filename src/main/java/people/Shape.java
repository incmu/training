package people;

public class Shape {

    enum FillType{
        IS_FILLED,
        NOT_FILLED
    }

    private String color;


    private FillType filled;

    public Shape(String color, FillType filled){
        this.color = color;
        this.filled = filled;
    }

    public void displayInfo(){
        System.out.print(color);
        System.out.print(filled);
    }

    double getArea(){
        return getArea();
    }
    public String getColor() {
        return color;
    }
    public FillType getFilled(){
        return filled;
    }



}
