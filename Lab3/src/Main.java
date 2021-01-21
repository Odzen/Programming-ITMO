import things.Thing;
import things.TypeThing;

public class Main {
    public static void main(String[] args) throws NotPerceptiveHumanException {
        System.out.println();
        Thing cart = new Thing("телеги", TypeThing.CART, 5, false, false, 4, 4, false);
        Thing trough= new Thing("корыта", TypeThing.TROUGHS, 5, false, new Coordinate(30, 12));
        Thing babyCarriage = new Thing("детские коляски", TypeThing.BABYSTROLLERS, 5, false, new Coordinate(30, 10));
        Thing fishCage = new Thing("садки для рыб", TypeThing.FISHTANK, 5, true, new Coordinate(-60, 0));
        Thing berth = new Thing("Sun Window", TypeThing.BERTH, 5, true, new Coordinate(40, 10));
        Thing hedge = new Thing("изгородь", TypeThing.HEDGE, 2, true, new Coordinate(60, 0));
        Thing bush = new Thing("изгородь", TypeThing.HEDGE, 1, true, new Coordinate(60, 0));
        Thing trees = new Thing("Front Window", TypeThing.TREE, 6, true, new Coordinate(60, -1));

        Place astronomicRoom = new Place("астрономическая");
        astronomicRoom.addThing(computer1);
        astronomicRoom.addThing(panel1);
        astronomicRoom.addThing(frontWindow1);
        astronomicRoom.addThing(frontWindow2);
        astronomicRoom.addThing(frontWindow3);
        Place dinningRoom = new Place("пищевой отсек");
        dinningRoom.addThing(anyFood);
        Place machinesRoom = new Place("машинный зал");
        machinesRoom.addThing(backWindow);

    }
