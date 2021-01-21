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

    public Town(String name, boolean prepareForStrongRain) {
        this.name = name;
        this.prepareForStrongRain=prepareForStrongRain;
        this.awash=false;
        this.raining=false;
        this.things=new ArrayList<>();
        this.constructions=new ArrayList<>();
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
            if(isPrepareForStrongRain())
                setAwash(false);
            else{
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return awash == town.awash &&
                raining == town.raining &&
                Objects.equals(name, town.name) &&
                Objects.equals(things, town.things) &&
                Objects.equals(constructions, town.constructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(awash, raining, name, things, constructions);
    }
}
