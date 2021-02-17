package things;

import Places.Town;

import java.util.Objects;

public class Thing{

    private String name;
    private TypeThing type;
    private int amount;
    private boolean shiny;
    private  boolean floating;
    private boolean dangerous;
    private int length;
    private int width;
    private int capacity;
    private static int area;
    private Size size;

    public Thing(String name, TypeThing type, int amount, boolean shiny, boolean floating, int length, int width, boolean dangerous, int capacity) {
        this.capacity=capacity;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.shiny = shiny;
        this.floating=floating;
        this.length=length;
        this.width=width;
        this.dangerous=dangerous;
        area=0;
    }


    public  void decreaseAmount(){
        amount-=1;
    }
    public boolean existing(){
        return this.amount > 0;
    }
    public void calculateArea(){
        area=width*length;
    }
    public void increaseAmount(){
        amount+=1;
    }
    public int getAmount(){
        return amount;
    }
    public int getArea(){
        return area;
    }
    public boolean getFloating(){return floating;}
    public boolean getShinny(){return shiny;}


    public void setType(TypeThing type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setCapacity(int capacity){this.capacity=capacity;}

    public int getCapacity(){return capacity;}

    public Size getSize() {
        return size;
    }

    @Override
    public int hashCode() {
        int result = 10;
        result += (this.getName().hashCode()/50) >> 2;
        result += this.getAmount();
        return result;
    }


    @Override
    public String toString() {
        if (floating)
            return this.getName() + " pass by floating";
        else
            return this.getName();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (o instanceof Town){
            Thing thing = (Thing) o;
            if(thing.name == this.name &&
                    this.type == thing.type &&
                    this.amount == thing.amount &&
                    this.size == thing.size &&
                    this.shiny == thing.shiny &&
                    this.dangerous == thing.dangerous &&
                    this.floating == thing.floating &&
                    this.length == thing.length &&
                    this.width == thing.width &&
                    this.area == thing.area) {
                return true;
            }
        }
        return false;
    }


    public boolean isType(TypeThing type) {
        return this.type.equals(type);
    }

    public boolean isFloating() {
        return floating;
    }
}
