package Storage;

import java.util.ArrayList;

public class Box {
    private double maxweight;
    private ArrayList<ToBeStored> items;
    public Box(double maxweight){
        this.maxweight = maxweight;
        this.items = new ArrayList<>();

    }


    public void add(ToBeStored item){
        if (weight()+item.weight()<= maxweight){
            items.add(item);
        } else {
            System.out.print("Can't store anymore!");
        }
    }

    public double weight(){
        double totalWeight = 0;
        for(ToBeStored item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString(){
        return "Box has: "+items.size()+" items "+" It weighs: "+weight();
    }
}
