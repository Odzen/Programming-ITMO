package things;

public class Construction extends Thing{

    private Room room;

    public Construction(String name, TypeThing type ,int amount, boolean shiny, boolean floating , int numRooms) {
        super(name, type,  amount,  shiny,  floating);
    }

    @Override
    public void decreaseAmount() {

    }

    @Override
    public boolean existing() {
        return false;
    }

    @Override
    public void calculateArea() {

    }

    @Override
    public void increaseAmount() {

    }
}
