package Places;

import things.Size;
import things.TypeThing;
import java.util.ArrayList;
import java.util.Objects;

public class Construction extends AbsPlace {


    public Construction(String name, boolean floating, int length, int width, boolean dangerous, ArrayList<Room> arrayRooms, int capacityCreatures,int capacityFurniture ) {
        super( name,  floating,  length,  width,  dangerous, arrayRooms,  capacityCreatures, capacityFurniture );
    }

    public void addRoom(Room room){
            super.getRooms().add(room);
            super.setNumRooms(1);
    }

    public void approaching(Construction anotherConstruction){
        System.out.println("The " + this.toString()  + " is approaching to " + anotherConstruction.toString());
    }

    public int getCapacityCreatures(){return super.getCapacityCreatures();}

    @Override
    public void defineSize() {
        if(getNumRooms()>5 && this.getArea()>50){
            this.setSize(Size.BIG);
        }
        else if(getNumRooms()>2 && this.getArea()>20){
            this.setSize(Size.MEDIUM);
        }
        else{
            this.setSize(Size.SMALL);
        }
    }

    public int defineTotalSetsCapacityFurniture() {
        for(int i=0; i<this.getRooms().toArray().length;i++){
            int capacity=0;
            capacity=this.getRooms().get(0).getCapacityThings();
            setCapacityFurniture(capacity);
        }
        return getCapacityFurniture();
    }

    public void defineCapacityCreatures() {
        if(this.getSize()==Size.BIG){
            setCapacityCreatures(10);
        }
        else if(this.getSize()==Size.MEDIUM){
            setCapacityCreatures(5);
        }
        else{
            setCapacityCreatures(1);
        }
    }

    public boolean enoughSpaceForCreatures(int numberOfCreatures){
        if(this.getCapacityCreatures()>numberOfCreatures){
            return true;
        }
        else{
            return false;
        }
    }



    public boolean enoughSpaceForFurnitore(int numberFurnitore){
        if(getCapacityFurniture()>numberFurnitore){
            return true;
        }
        else{
            return false;
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
