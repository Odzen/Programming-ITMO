package Places;

import things.Size;
import things.Thing;
import things.TypeThing;

import java.util.ArrayList;
import java.util.List;

public class Construction extends AbsSize {
    private static  ArrayList<Room> arrayRooms;
    private static int numRooms;
    private int capacityCreatures;
    private int capacityFurniture;


    public Construction(String name, TypeThing type, boolean floating,int length, int width, boolean dangerous, ArrayList<Room> arrayRooms) {
        super(name, type, amount,  shiny,  floating,  length,  width,  dangerous);
        this.arrayRooms=new ArrayList<>();
        numRooms=0;
    }

    public void addRoom(Room room){
            arrayRooms.add(room);
            numRooms+=1;
    }


    public int getCapacityCreatures(){return this.capacityCreatures;}

    public static int getNumberRooms(){
        return numRooms;
    }

    public String toString() {
        return this.getName();
    }

    @Override
    public void defineSize() {
        if(numRooms>5 && this.getArea()>50){
            this.setSize(Size.BIG);
        }
        else if(numRooms>2 && this.getArea()>20){
            this.setSize(Size.MEDIUM);
        }
        else{
            this.setSize(Size.SMALL);
        }
    }

    public int defineTotalSetsCapacityFurniture() {
        for(int i=0; i<arrayRooms.toArray().length;i++){
            int capacity=0;
            capacity=arrayRooms.get(0).getCapacityThings();
            capacityFurniture+=capacity;
        }

        return capacityFurniture;
    }

    public void defineCapacityCreatures() {
        if(this.getSize()==Size.BIG){
            capacityCreatures=10;
        }
        else if(this.getSize()==Size.MEDIUM){
            capacityCreatures=5;
        }
        else{
            capacityCreatures=1;
        }
    }

    public boolean enoughSpaceForCreatures(int numberOfCreatures){

        if(capacityCreatures>numberOfCreatures){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean enoughSpaceForFurnitore(int numberFurnitore){

        if(capacityFurniture>numberFurnitore){
            return true;
        }
        else{
            return false;
        }
    }
}
