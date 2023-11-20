package Storage;

public class Main {
    public static void main(String[] args){
        Box box = new Box(4);

       box.add( new Book("Fedor Dostojevski","Crime and Punishment", 2));
        box.add( new Book("Robert Martin","Clean Code",1));
        box.add( new Book("Kent Beck","Test Driven Developement",0.5));

        box.add( new CD("Pink Floyd","Dark Side of the moon", 1973));
        box.add( new CD("Wigwan","Nuclear Nightclub", 1975));
        box.add( new CD("Rendezvous Park","Closter to Being here",2012));

        System.out.println(box);

    }
}
