package Places;

import things.Size;
import things.Thing;
import things.TypeThing;

import java.util.ArrayList;
import java.util.Objects;

public abstract class AbsPlace {
    private String name;
    private ArrayList<Room> arrayRooms;
    private ArrayList<Thing> arrayThings;
    private int capacityCreatures;
    private int capacityFurniture;
    private int capacityThings;
    private int amount;
    boolean floating;
    int length;
    int width;
    boolean dangerous;
    public static int numThings;
    public static int numRooms;
    private Size size;


    //If it is a Place - Construction
    public AbsPlace(String name, int amount, boolean floating, int length, int width, boolean dangerous, ArrayList<Room> arrayRooms, int capacityCreatures,int capacityFurniture ) {
        this.name=name;
        this.amount=amount;
        this.floating=floating;
        this.length=length;
        this.width=width;
        this.dangerous=dangerous;
        this.arrayRooms=arrayRooms;
        this.capacityCreatures=capacityCreatures;
        this.capacityFurniture=capacityFurniture;
    }

    //If it is a Place - Room
    public AbsPlace(String name, int amount, boolean floating, int length, int width, boolean dangerous,ArrayList<Thing> things, int capacityThings) {
        this.name=name;
        this.amount=amount;
        this.floating=floating;
        this.length=length;
        this.width=width;
        this.dangerous=dangerous;
        this.arrayThings=things;
        this.capacityThings=capacityThings;
    }

    public boolean hasThing(Thing thing) {
        return this.getThings().contains(thing);
    }
    public boolean hasRoom(Room room) {
        return this.getRooms().contains(room);
    }

    public String getName() {
        return this.name;
    }

    public int getLength(){
        return length;
    }

    public int getAmount(){
        return amount;
    }

    public int getWidth(){
        return width;
    }

    public int getCapacityCreatures(){
        return capacityCreatures;
    }

    public int getCapacityThings(){
        return capacityThings;
    }

    public int getCapacityFurniture(){
        return capacityFurniture;
    }

    public boolean isDangerous(){
        return dangerous;
    }

    public boolean isFloating(){
        return floating;
    }

    public int getArea(){
        int area=width*length;
        return area;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public void setCapacityFurniture(int capacity) {
        capacityFurniture += capacity;
    }

    public void setCapacityCreatures(int creature) {
        capacityCreatures= creature;
    }

    public void setCapacityThings(int things) {
        capacityThings-= things;
    }



    public Size getSize() {
        return size;
    }

    public ArrayList<Thing> getThings() {
        return arrayThings;
    }

    public ArrayList<Room> getRooms() {
        return arrayRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbsPlace absPlace = (AbsPlace) o;
        return capacityCreatures == absPlace.capacityCreatures &&
                capacityFurniture == absPlace.capacityFurniture &&
                capacityThings == absPlace.capacityThings &&
                amount == absPlace.amount &&
                floating == absPlace.floating &&
                length == absPlace.length &&
                width == absPlace.width &&
                dangerous == absPlace.dangerous &&
                Objects.equals(name, absPlace.name) &&
                Objects.equals(arrayRooms, absPlace.arrayRooms) &&
                Objects.equals(arrayThings, absPlace.arrayThings) &&
                size == absPlace.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, arrayRooms, arrayThings, capacityCreatures, capacityFurniture, capacityThings, amount, floating, length, width, dangerous, size);
    }

    //The implementation depends if it is a room or a construction
    public abstract void defineSize();
}
