package people;

public class Teacher extends Person{
    double salary;

    public Teacher(String name, String address, double salary){
        super(name, address);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+ "name: " + this.name + " \n address: " + this.address + "\n salary: " + this.salary;
    }
}
