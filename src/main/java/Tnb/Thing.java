package Tnb;

public class Thing {

    private String name;

    private int weight;

    public Thing(String name,int weight){
        if (weight < 0){
            throw new IllegalArgumentException("Cannot accept negative weight");
        }
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Thing otherThing = (Thing) obj;
        return name.equals(otherThing.name);
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }

}
