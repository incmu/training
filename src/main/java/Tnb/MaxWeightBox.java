package Tnb;

import java.util.ArrayList;
import java.util.List;

public class MaxWeightBox extends Box{
    private int maxWeight;
    private List<Thing> things;

    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing){
        int totalWeight = things.stream().mapToInt(Thing::getWeight).sum();
        if (totalWeight + thing.getWeight() <= maxWeight){
            things.add(thing);
        }
    }
    @Override
    public boolean isInTheBox(Thing thing){
        return things.contains(thing);
    }
}
