package Places;

import things.Thing;

import java.util.ArrayList;
import java.util.Objects;

public class Town {
    private boolean awash; //covered with water
    private boolean raining;
    private boolean prepareForStrongRain;
    private String name;
    private ArrayList<Thing> things;
    private ArrayList<Construction> constructions;
    private int numThings;
    private int numConst;

    public Town(String name, boolean prepareForStrongRain, ArrayList<Thing> things, ArrayList<Construction> constructions) {
        this.name = name;
        this.prepareForStrongRain=prepareForStrongRain;
        this.awash=false;
        this.raining=false;
        this.things=new ArrayList<>();
        this.constructions=new ArrayList<>();
    }


    public void addConst(Construction construction){
        getConstructions().add(construction);
        numConst+=1;
    }

    public void addThings(Thing thing){
        getThings().add(thing);
        numThings+=1;
    }

    public void setAwash(boolean awash) {
        this.awash = awash;
    }

    public void setRaining(boolean raining) {
        this.raining = raining;
    }

    public String getName() {
        return name;
    }

    public int getNumThings(){return numThings;}

    public int getNumConst(){return numConst;}

    public ArrayList<Construction> getConstructions() {
        return constructions;
    }

    public ArrayList<Thing> getThings() {
        return things;
    }

    public boolean isAwash() {
        return awash;
    }

    public boolean isPrepareForStrongRain() {
        return prepareForStrongRain;
    }

    public void determinateAwash() {
        if(isRaining()){
            if(isPrepareForStrongRain()) {
                System.out.println("The village " + this.getName() + "is ok");
                setAwash(false);
            }
            else{
                System.out.println("The village " + this.getName() + " is flooded");
                setAwash(true);
            }
        }
        else{
            setAwash(true);
        }
    }

    public boolean isRaining() {
        return raining;
    }

    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (o instanceof Town){
            Town town = (Town) o;
            if(town.name == this.name &&
                    this.awash == town.awash &&
                    this.raining == town.raining &&
                    this.prepareForStrongRain == town.prepareForStrongRain &&
                    this.name == town.name &&
                    this.things == town.things &&
                    this.constructions == town.constructions) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(awash, raining, name, things, constructions);
    }
}
