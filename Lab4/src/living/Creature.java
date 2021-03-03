package living;

import Exceptions.ProblemSeeingObject;
import Places.AbsPlace;
import Places.Room;
import Places.Town;
import things.Size;
import things.Thing;
import things.TypeThing;

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
    //private VisionManager visionManager;


    public class VisionManager{

        private Creature creatureSeeing;
        private Object objectToSee;


        public VisionManager(Creature creatureSeeing, Object objectToSee) {
            this.creatureSeeing = creatureSeeing;
            this.objectToSee = objectToSee;
        }


        public String getStrSeeingProcess() throws ProblemSeeingObject {
            if(canSeeObj())
            {
                if (this.getObjToSee().getClass() == Thing.class) {
                    if (((Thing) objectToSee).isType(TypeThing.SUN)) {
                        return " The sun blinds " + this.getCreatureSeeing().getName();
                    } else
                        return this.getCreatureSeeing().getName() + " sees " + this.getObjToSee().toString();
                } else if (this.getObjToSee().getClass() == Creature.class) {
                    return this.getCreatureSeeing().getName() + " sees " + this.getObjToSee().toString();
                } else
                    return this.getCreatureSeeing().getName() + " sees " + this.getObjToSee().toString();
            }
            else
                throw new ProblemSeeingObject(" Problem seeing the object ");
        }

        public boolean canSeeObj() throws ProblemSeeingObject {
            if (objectToSee.getClass() == Creature.class)
                if (this.getCreatureSeeing().getActualPlace().equals(((Creature) objectToSee).getActualPlace()))
                    return true;
                else
                    throw new ProblemSeeingObject(" are not in same place(room) ");
            else if (objectToSee.getClass() == Thing.class)
                if (((Thing) objectToSee).isType(TypeThing.SUN)) {
                    return true;
                }
                else if (this.getCreatureSeeing().getActualPlace().hasThing((Thing) objectToSee))
                    return true;
                else
                    throw new ProblemSeeingObject(" object is in different place ");
            else if (objectToSee.getClass() == Town.class)
                    return true;
            else if (objectToSee.getClass() == AbsPlace.class)
                if (!(((AbsPlace) objectToSee).getSize().equals(Size.SMALL)))
                    return true;
                else
                    throw new ProblemSeeingObject(" The place is to small from the perspective of " + getCreatureSeeing().getName());
            else
                return true;
        }


        public Object getObjToSee() {
            return this.objectToSee;
        }

        public Creature getCreatureSeeing() {
            return this.creatureSeeing;
        }
    }

    public Creature(String name, Room place, ArrayList<Accessories> accessories) {
        this.name = name;
        this.actualPlace = place;
        this.mood =  Feelings.NEUTRAL;
        this.castaway=false;
        this.accessories=accessories;
        this.floating=false;
        //this.visionManager = null;
    }

    //human over something floating
    public Creature(String name, Thing thingFloating, ArrayList<Accessories> accessories) {
        this.name = name;
        this.thing = thingFloating;
        this.mood =  Feelings.NEUTRAL;
        this.castaway=true;
        this.accessories=accessories;
        this.floating=true;
        //this.visionManager = null;
    }


// Using the inner abstract class visionManager
    public void sees(Object objToSee) {
        try {
            VisionManager visionManager= new VisionManager(this, objToSee);

            System.out.println(visionManager.getStrSeeingProcess());

        } catch (ClassCastException e) {
            System.out.println(objToSee.toString() + " Don't exist");
        } catch (ProblemSeeingObject e) {
            System.out.println(this.getName() + "can not see " + objToSee.toString() +
                    " because " + e.getMessage());
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

