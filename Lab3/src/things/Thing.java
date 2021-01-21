package things;

import java.util.Objects;

public abstract class Thing{

    private String name;
    private TypeThing type;
    private int amount;
    private boolean shiny;
    private  boolean floating;
    private boolean dangerous;
    private int length;
    private int width;
    private static int area;
    private Size size;

    public Thing(String name, TypeThing type, int amount, boolean shiny, boolean floating, int length, int width, boolean dangerous) {
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
        area=width* length;
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


    public void setType(TypeThing type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

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
            return this.getName() + "floating";
        else
            return this.getName();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return amount == thing.amount &&
                shiny == thing.shiny &&
                floating == thing.floating &&
                dangerous == thing.dangerous &&
                length == thing.length &&
                width == thing.width &&
                Objects.equals(name, thing.name) &&
                type == thing.type &&
                size == thing.size;
    }

    //The size depends of the typething and others characteristics
    public abstract void defineSize();

    public boolean isType(TypeThing type) {
        return this.type.equals(type);
    }
}
