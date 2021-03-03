package Places;

import living.Creature;
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
    boolean floating;
    int length;
    int width;
    boolean dangerous;
    public static int numThings;
    private int numRooms;
    private Size size;


    //If it is a Place - Construction
    public AbsPlace(String name, boolean floating, int length, int width, boolean dangerous, ArrayList<Room> arrayRooms, int capacityCreatures,int capacityFurniture ) {
        this.name=name;
        this.floating=floating;
        this.length=length;
        this.width=width;
        this.dangerous=dangerous;
        this.arrayRooms=arrayRooms;
        this.capacityCreatures=capacityCreatures;
        this.capacityFurniture=capacityFurniture;
    }

    //If it is a Place - Room
    public AbsPlace(String name, boolean floating, int length, int width, boolean dangerous,ArrayList<Thing> things, int capacityThings) {
        this.name=name;
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
        if(dangerous)
            System.out.println(this.toString() + " is dangerous");
        else
            System.out.println(this.toString() + " is not dangerous");
        return dangerous;
    }

    public boolean isFloating(){
        return floating;
    }

    public int getArea(){
        int area=width*length;
        return area;
    }

    public int getNumRooms(){
        return numRooms;
    }
    public void setSize(Size size) {
        this.size = size;
    }

    public void setNumRooms(int number) {
        this.numRooms += number;
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

    public void setName (String newName){
        name=newName;
    }

    public void looksLike(String look){
        System.out.println(this.getName()+ " похож на "+ look );
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
        if (o instanceof AbsPlace){
            AbsPlace place = (AbsPlace) o;
            if(place.name == this.name &&
                    this.arrayRooms == place.arrayRooms &&
                    this.arrayThings == place.arrayThings &&
                    this.capacityCreatures == place.capacityCreatures &&
                    this.capacityFurniture == place.capacityFurniture &&
                    this.capacityThings == place.capacityThings &&
                    this.floating == place.floating &&
                    this.length == place.length &&
                    this.width == place.width &&
                    this.dangerous == place.dangerous &&
                    this.numThings == place.numThings &&
                    this.numRooms == place.numRooms &&
                    this.size == place.size) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, arrayRooms, arrayThings, capacityCreatures, capacityFurniture, capacityThings, floating, length, width, dangerous, size);
    }

    //The implementation depends if it is a room or a construction
    public abstract void defineSize();
}
