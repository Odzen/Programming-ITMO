package Places;

import things.Size;
import things.Thing;
import things.TypeThing;

import java.util.ArrayList;

public class Room extends Thing {


    private int capacityThings;
    private ArrayList<Thing> things;
    private int numThings;


    public Room(String name, TypeThing type, int amount, boolean shiny, boolean floating, int length, int width, boolean dangerous, int capacityThings) {
        super( name,  type,  amount,  shiny,  floating,  length,  width,  dangerous);
        this.things=new ArrayList<>();
        numThings=0;
        this.capacityThings=capacityThings;
    }

    public boolean hasThing(Thing thing) {
        return this.getThings().contains(thing);
    }

    public void addThing(Thing thing) {
        this.things.add(thing);
        numThings+=1;
        capacityThings-=1;
    }


    public String toString() {
        return this.getName();
    }

    public ArrayList<Thing> getThings() {
        return things;
    }

    public int getNumThings(){return this.numThings;}
    public int getCapacityThings(){return this.capacityThings;}

    @Override
    public void defineSize() {
        if(capacityThings>20 && this.getArea()>15){
            this.setSize(Size.BIG);
        }
        else if(capacityThings>10 && this.getArea()>10){
            this.setSize(Size.MEDIUM);
        }
        else{
            this.setSize(Size.SMALL);
        }
    }

}
