package Places;

import Exceptions.DrownedTownException;
import Exceptions.SizeTownAndConstructions;
import things.Thing;
import things.TypeThing;

import java.sql.SQLOutput;
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
    private int capacityConstructions;

    public Town(String name, boolean prepareForStrongRain, ArrayList<Thing> things, ArrayList<Construction> constructions, int capacityConstructions) {
        numConst=0;
        this.name = name;
        this.prepareForStrongRain=prepareForStrongRain;
        this.awash=false;
        this.raining=false;
        this.things=new ArrayList<>();
        this.constructions=new ArrayList<>();
        this.capacityConstructions=capacityConstructions;
    }


    public static class Sun{
        private TypeThing type;
        private boolean shiny;
        private Town actualTown;


        public Sun(TypeThing type, boolean shiny, Town actualTown)
        {
            this.type=type;
            this.shiny=shiny;
            this.actualTown=actualTown;
        }

        public void shinning(){
            if(shiny)
                System.out.println("The sun came out and it's shining ");
            else
                System.out.println("There is no sun nor its shine ");
        }

        public void setShiny(boolean shinySet){
            shiny=shinySet;
        }

        public TypeThing getType() {
            return type;
        }

        public boolean getShinny(){
            return shiny;
        }

        @Override
        public String toString() {
            return "Sun";
        }
    }


    public void addConst(Construction construction){
        if(capacityConstructions>=numConst) {
            getConstructions().add(construction);
            numConst += 1;
        }
        else
            throw new SizeTownAndConstructions(" There is no capacity for more contructions");
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

    public void determinateAwash(Sun sun) {

        try {
            if (getRaining(sun)) {
                if (isPrepareForStrongRain()) {
                    System.out.println("The village " + this.getName() + "is ok");
                    setAwash(false);
                } else {
                    System.out.println("The village " + this.getName() + " is flooded");
                    setAwash(true);
                }
            } else {
                setAwash(true);
            }
        }
        catch(DrownedTownException e){
            System.out.println(" Is not raining, so it cannot be an awash");
        }
    }

    public void isRaining(Sun sun) throws DrownedTownException{
        if(!sun.shiny){
            raining=true;
        }
        else
        {
            raining=false;
            throw new DrownedTownException("If the sun is shinning, it cannot be raining");
        }
    }

    public boolean getRaining(Sun sun) throws DrownedTownException {
        this.isRaining(sun);
        return  raining;
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
