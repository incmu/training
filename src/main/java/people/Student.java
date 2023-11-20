package people;

public class Student extends Person{
    int credits;

    public Student(String name,String address) {
        super(name, address);

    }



    public void study(){
        this.credits++;
    }


    public int credits() {
        return credits;
    }

    @Override
    public String toString() {
        return super.toString()+"\n name: " + this.name + "\n address: " + this.address + "\n credits: " + this.credits;
    }
}
