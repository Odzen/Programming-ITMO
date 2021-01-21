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
    private ArrayList<Accesories> accesories;

    public Creature(String name, Room place, boolean castaway, ArrayList<Accesories> accessories) {
        this.name = name;
        this.actualPlace = place;
        this.mood =  Feelings.NEUTRAL;
        this.castaway=castaway;
        this.accesories=accessories;
        floating=false;
    }

    //human over something floating
    public Creature(String name, Thing thing, boolean castaway, ArrayList<Accesories> accessories) {
        this.name = name;
        this.thing = thing;
        this.mood =  Feelings.NEUTRAL;
        this.castaway=castaway;
        this.accesories=accessories;
        floating=true;
    }

    public void sees(Object objToSee) {

        if(objToSee.getClass() == Creature.class){
            System.out.println(this.getName() + " see " + objToSee.toString());
        }
        else if(objToSee.getClass() == Thing.class){
            Thing castObjToSee=(Thing)objToSee;
            if(!(castObjToSee.getSize() == Size.SMALL)){
                System.out.println(this.getName() + " see " + castObjToSee.toString());
            }
        }
        //It depens of which kind of object
        //If its a thing, another creature, etc
        // The thing could be a natureThing with different characteristics that could provoque a reaction
        // on the object
        //this.visionManager = new VisionManager(this, objToSee);

        //if (this.visionManager.canSeeObj(objToSee))
            //System.out.println(this.visionManager.getStrSeeingProcess());


    }

    public void moves(Room nextPlace){
        this.setActualPlace(nextPlace);
        System.out.println(getName() + " moves to " + nextPlace.getName());
    };
    public void said(Creature creature, String msg){
        System.out.println(this.getName() + " said to " + creature.getName() + " \"" + msg + "\"");
    }

    public void setActualPlace(Room actualPlace) {
        this.actualPlace = actualPlace;
    }

    public void setMood(Feelings mood) {
        this.mood = mood;
    }

    @Override
    public void moveAccessory(Accesories accessory) {
        System.out.println(this.getName() + "moves" + accessory.toString());
    }


    public void feels(Feelings feeling){
        this.setMood(feeling);
        System.out.println(this.getName() + feeling.getTextFeeling());
    }



    @Override
    public boolean equals(Object obj) {
        //String type= new String();
        if (obj instanceof Creature) {
            return true;
        }
        else
            return false;
    }

    public boolean isCastaway() {
        return castaway;
    }

    public boolean isFloating() {
        return floating;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mood, actualPlace, castaway, accesories);
    }

    @Override
    public String toString() {
            if (isFloating()) {
                if (isCastaway()) {
                    return this.getName() + "is on" + this.getThingOverFLoating().toString();
                } else {
                    return this.getName() + "is floating";
                }
            }
            else
                return this.getName() +"is in"+ this.getActualPlace().toString();
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

