package Places;

import things.Size;
import things.Thing;
import things.TypeThing;

import java.util.ArrayList;
import java.util.Arrays;

public class Room extends AbsPlace {

    private boolean dark;
    private boolean spiderweb;
    private ArrayList<Thing> walls;
    private ArrayList<Thing> wallsRemoved;
    private Thing wall1=new Thing("wall1",TypeThing.WALL,1,false,true,2,2,false,1);
    private Thing wall2=new Thing("wall2",TypeThing.WALL,1,false,true,2,2,false,1);
    private Thing wall3=new Thing("wall3",TypeThing.WALL,1,false,true,2,2,false,1);
    private Thing wall4=new Thing("wall4",TypeThing.WALL,1,false,true,2,2,false,1);
    public Room(String name, int amount, boolean floating, int length, int width, boolean dangerous,ArrayList<Thing> things, int capacityThings, boolean dark, boolean spiderweb) {
        super(name, floating,length,width,dangerous,things,capacityThings);
        this.dark=dark;
        this.spiderweb=spiderweb;
        walls=new ArrayList(Arrays.asList(wall1,wall2,wall3,wall4));
        wallsRemoved=new ArrayList<>();
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

    public void setDark(boolean dark) {
        this.dark = dark;
    }

    public boolean isDark() {
        return dark;
    }

    public boolean isSpiderweb() {
        return spiderweb;
    }

    public void setSpiderweb(boolean spiderweb) {
        this.spiderweb = spiderweb;
    }

    public void printDarkness(){
        if(isDark())
            System.out.println(this.toString()+ " is Dark");
        else
            System.out.println(this.toString()+ " is not Dark");
    }

    public void printSpiderWeb(){
        if(isSpiderweb())
            System.out.println(this.toString()+ " is covered with cobwebs");
        else
            System.out.println(this.toString()+ " is clean");
    }
    public void fallingApart(){
        wallsRemoved.add(walls.get(0));
        walls.remove(0);
        System.out.println(this.toString()+ " is falling apart");
    }

    public ArrayList<Thing> getWalls() {
        return walls;
    }

    public ArrayList<Thing> getWallsRemoved() {
        return wallsRemoved;
    }
}
