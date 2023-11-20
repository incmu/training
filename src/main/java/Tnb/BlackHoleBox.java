package Tnb;

import java.util.ArrayList;
import java.util.List;

public class BlackHoleBox extends Box{
    private List<Thing> things;

    public BlackHoleBox(){
        this.things = new ArrayList<>();
    }

    @Override
    public void add(Thing thing) {
        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
