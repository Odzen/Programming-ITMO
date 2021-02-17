package living;

import Places.Room;
import things.Size;
import things.Thing;
import java.util.ArrayList;
import java.util.Objects;

public class Creature implements Actions{

    private String name;
    private Feelings mood;
    private Room actualPlace;
    private Thing thing;
    private boolean castaway;
    private boolean floating;
    private ArrayList<Accessories> accessories;

    public Creature(String name, Room place, ArrayList<Accessories> accessories) {
        this.name = name;
        this.actualPlace = place;
        this.mood =  Feelings.NEUTRAL;
        this.castaway=false;
        this.accessories=accessories;
        this.floating=false;
    }

    //human over something floating
    public Creature(String name, Thing thingFloating, ArrayList<Accessories> accessories) {
        this.name = name;
        this.thing = thingFloating;
        this.mood =  Feelings.NEUTRAL;
        this.castaway=true;
        this.accessories=accessories;
        this.floating=true;
    }


    //It depens of which kind of object
    //If its a thing, another creature, etc
    // The thing could be a natureThing with different characteristics that could provoque a reaction
    // on the object
    public void sees(Object objToSee) {

        if(objToSee.getClass() == Creature.class){
            System.out.println(this.getName() + " sees " + objToSee.toString());
        }
        else if(objToSee.getClass() == Thing.class){
            Thing castObjToSee=(Thing)objToSee;
            if(!(castObjToSee.getSize() == Size.SMALL)){
                System.out.println(this.getName() + " sees " + castObjToSee.toString());
            }
        }

    }

    public void moves(Room nextPlace){
        this.setActualPlace(nextPlace);
        System.out.println(getName() + " moves to " + nextPlace.getName());
    };

    public void movesFloating(Thing nextThingToMove){
        this.setActualThingFloating(nextThingToMove);
        System.out.println(getName() + " moves to " + nextThingToMove.getName());
    };

    public void floatingOver(){
        if(determineCastaway()){
            System.out.println(getName() + " is floating on " + this.thing.getName());
        }
        else{
            System.out.println(getName() + " is not a castaway floating on " + this.thing.getName());
        }
    }

    public void said(Creature creature, String msg){
        System.out.println(this.getName() + " said to " + creature.getName() + " \"" + msg + "\"");
    }

    public void setActualPlace(Room actualPlace) {
        this.actualPlace = actualPlace;
    }

    public void setActualThingFloating(Thing thingNowFloating) {
        this.thing = thingNowFloating;
    }

    public void setMood(Feelings mood) {
        this.mood = mood;
    }

    @Override
    public void moveAccessory(Accessories accessory) {
        System.out.println(this.getName() + " moves " + accessory.toString());
    }

    public void feels(Feelings feeling){
        this.setMood(feeling);
        System.out.println(this.getName() + feeling.getTextFeeling());
    }

    public void setName(String newName){
        this.name=newName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (o instanceof Creature){
            Creature creature = (Creature) o;
            if(creature.castaway == this.castaway &&
                    this.floating == creature.floating &&
                    this.name == creature.name &&
                    this.actualPlace == creature.actualPlace &&
                    this.thing == creature.thing &&
                    this.accessories == creature.accessories) {
                return true;
            }
        }
        return false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, mood, actualPlace, castaway, accessories);
    }

    @Override
    public String toString() {
            if (isFloating()) {
                if (isCastaway()) {
                    return this.getName() + "is floating on the water on " + this.getThingOverFLoating().toString();
                } else {
                    return this.getName() + "is floating on the water";
                }
            }
            else
                return this.getName() +"is in"+ this.getActualPlace().toString();
    }

    public boolean determineCastaway() {
        if(thing.isFloating()){
            castaway=true;
        }
        else{
            castaway=false;
        }

        return castaway;
    }

    public boolean isCastaway() {
        return castaway;
    }

    public boolean isFloating() {
        return floating;
    }

    public Feelings getMood() {
        return mood;
    }

    public String getName() {
        return this.name;
    }

    public Room getActualPlace() {
        return actualPlace;
    }

    public Thing getThingOverFLoating(){
        return thing;
    }
}

