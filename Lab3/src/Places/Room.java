package Places;

import things.Size;
import things.Thing;
import java.util.ArrayList;

public class Room extends AbsPlace {


    public Room(String name, int amount, boolean floating, int length, int width, boolean dangerous,ArrayList<Thing> things, int capacityThings) {
        super(name, floating,length,width,dangerous,things,capacityThings);
    }

    public boolean hasThing(Thing thing) {
        return this.getThings().contains(thing);
    }

    public void addThing(Thing thing) {
        super.getThings().add(thing);
        numThings+=1;
        setCapacityThings(1);
    }

    @Override
    public void defineSize() {
        if(getCapacityThings()>20 && this.getArea()>15){
            this.setSize(Size.BIG);
        }
        else if(getCapacityThings()>10 && this.getArea()>10){
            this.setSize(Size.MEDIUM);
        }
        else{
            this.setSize(Size.SMALL);
        }
    }

    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
