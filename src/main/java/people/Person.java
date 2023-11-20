package people;

public class Person {
    String name;
    static String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public static String getAddress(){
        return address;
    }


}
