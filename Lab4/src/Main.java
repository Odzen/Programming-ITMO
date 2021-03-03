import Places.Construction;
import Places.Room;
import Places.Town;
import living.Accessories;
import living.Creature;
import living.Feelings;
import things.Thing;
import things.TypeThing;
import things.WaveInterface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Things Floating
        Thing cart = new Thing("телеги", TypeThing.CART, 6, false, true, 10, 10, false, 10);
        Thing trough = new Thing("корыта", TypeThing.TROUGHS, 8, false, true, 4, 4, false, 2);
        Thing babyCarriage = new Thing("детские коляски", TypeThing.BABYSTROLLERS, 2, false, true, 6, 6, false, 3);
        Thing fishCage = new Thing("садки для рыб", TypeThing.FISHTANK, 8, false, true, 2, 2, false, 8);
        Thing berth = new Thing("причалы", TypeThing.BERTH, 5, false, true, 4, 4, false, 7);
        Thing hedge = new Thing("изгородь", TypeThing.HEDGE, 2, false, true, 8, 8, false,2 );
        //Thing sun = new Thing("солньце", TypeThing.SUN, 1, true, false, 1000, 1000, false,3);


        //Things in rooms
        ArrayList<Thing> thingsAux= new ArrayList<>();

        //Rooms
        ArrayList<Room> roomsAux= new ArrayList<>();
        ArrayList<Room> roomsBiggerHouse= new ArrayList<>();
        ArrayList<Room> roomsOnMomminHouse= new ArrayList<>();
        Room livingRoom= new Room("Гостиная", 1,  true,  10,  10,  false,thingsAux, 50, false, false);
        Room toilet=new Room("туалет", 2,  true,  2,  2,  false,thingsAux, 3, false, false);
        Room playZone=new Room("игровая зона", 2,  true,  7,  7,  false,thingsAux, 10, false, false);
        Room office= new Room("офис", 1,  true,  5,  5,  false,thingsAux, 6, false, false);
        Room office2= new Room("офис", 1,  true,  5,  5,  false,thingsAux, 6, false, false);
        Room office3= new Room("офис", 1,  true,  5,  5,  false,thingsAux, 6, false, false);

        Room livingRoomBiggerHouse= new Room("Гостиная", 1,  true,  10,  10,  false,thingsAux, 50, false, false);
        Room livingRoom2BiggerHouse= new Room("Гостиная", 1,  true,  10,  10,  false,thingsAux, 50, false, false);
        Room toiletBiggerHouse=new Room("туалет", 2,  true,  2,  2,  false,thingsAux, 3, false, false);
        Room playZoneBiggerHouse=new Room("игровая зона", 2,  true,  7,  7,  false,thingsAux, 10, false, false);
        Room officeBiggerHouse= new Room("офис", 1,  true,  5,  5,  false,thingsAux, 6, false, false);
        Room office2BiggerHouse= new Room("офис", 1,  true,  5,  5,  false,thingsAux, 6, false, false);
        Room office3BiggerHouse= new Room("офис", 1,  true,  5,  5,  false,thingsAux, 6, false, false);

        //2 PART
        Room darkRoomBiggerHouse= new Room("крыша", 1,  true,  5,  5,  false,thingsAux, 11, true, true);
        Thing masks = new Thing("золотые маски", TypeThing.MASKS, 2, false, true, 1, 1, false,0 );
        Thing redVelvetDrapes = new Thing("красные бархатные портьеры", TypeThing.REDVELVETDRAPES, 2, false, true, 2, 2, false,0 );
        darkRoomBiggerHouse.addThing(masks);

        livingRoomBiggerHouse.defineSize();
        livingRoom2BiggerHouse.defineSize();
        toiletBiggerHouse.defineSize();
        playZoneBiggerHouse.defineSize();
        officeBiggerHouse.defineSize();
        office2BiggerHouse.defineSize();
        office3BiggerHouse.defineSize();
        darkRoomBiggerHouse.defineSize();

        livingRoom.defineSize();
        toilet.defineSize();
        playZone.defineSize();
        office.defineSize();



        //Constructions
        Construction houseMommin=new Construction( "Муми Дом",  true,  50,  50,  false,roomsAux, 15,30);
        Construction house2=new Construction("Дом1",  true,  30,  30,  false,roomsAux, 2,23);
        Construction house3=new Construction("Дом2",  true,  10,  10,  false,roomsAux, 1,6);
        Construction house4=new Construction("Дом3",  true,  25,  25,  false,roomsAux, 3,10);
        Construction biggerHouse=new Construction("Неизвестный дом",  true,  60,  60,  false,roomsAux, 20,130);

        houseMommin.addRoom(livingRoom);
        houseMommin.addRoom(toilet);
        houseMommin.addRoom(playZone);
        houseMommin.addRoom(office);
        houseMommin.addRoom(office2);
        houseMommin.addRoom(office3);

        biggerHouse.addRoom(livingRoomBiggerHouse);
        biggerHouse.addRoom(livingRoom2BiggerHouse);
        biggerHouse.addRoom(playZoneBiggerHouse);
        biggerHouse.addRoom(livingRoomBiggerHouse);
        biggerHouse.addRoom(officeBiggerHouse);
        biggerHouse.addRoom(office2BiggerHouse);
        biggerHouse.addRoom(office3BiggerHouse);
        biggerHouse.addRoom(darkRoomBiggerHouse);




        houseMommin.defineSize();
        house2.defineSize();
        house3.defineSize();
        house4.defineSize();
        biggerHouse.defineSize();


        //Castaways
        ArrayList<Accessories> accessoriesCastaway= new ArrayList<>();
        Creature castaway1= new Creature("Juan", hedge, accessoriesCastaway);
        Creature castaway2= new Creature("Sebastian", hedge, accessoriesCastaway);
        Creature castaway3= new Creature("Jorge", hedge, accessoriesCastaway);
        castaway1.determineCastaway();
        castaway2.determineCastaway();
        castaway3.determineCastaway();

        //Family
        Accessories hatDad=Accessories.HAT;
        ArrayList<Accessories> accessoriesDad= new ArrayList<>();
        ArrayList<Accessories> accessoriesAux= new ArrayList<>();
        accessoriesDad.add(hatDad);


        Creature moominTroll= new Creature("мумиТрол", playZone, accessoriesAux);
        Creature moominPappa= new Creature("мумиПапа", livingRoom, accessoriesAux);
        Creature moominMamma= new Creature("мумиМама", livingRoom, accessoriesAux);
        Creature litteMy= new Creature("LittleMy", toilet, accessoriesAux);
        Creature sniff= new Creature("sniff", office, accessoriesAux);


        //Add Things to the Town

        ArrayList<Thing> thingsOnTheTown= new ArrayList<>();


        ArrayList<Construction> constructionsOnTheTown= new ArrayList<>();


        Town moominValley = new Town("moominValley", false, thingsOnTheTown, constructionsOnTheTown, 4);

        Town.Sun sun=new Town.Sun(TypeThing.SUN, false, moominValley); // Instance of an static inner class // nested class

        sun.shinning();

        moominValley.addConst(houseMommin);
        moominValley.addConst(house2);
        moominValley.addConst(house3);
        moominValley.addConst(house4);
        moominValley.addConst(biggerHouse);


        moominValley.addThings(cart);
        moominValley.addThings(trough);
        moominValley.addThings(babyCarriage);
        moominValley.addThings(fishCage);
        moominValley.addThings(berth);
        moominValley.addThings(hedge);
        //Start

        moominValley.isPrepareForStrongRain();
        moominValley.determinateAwash(sun);


        moominValley.setRaining(true);





        System.out.println(cart.toString());
        System.out.println(trough.toString());
        System.out.println(babyCarriage.toString());
        System.out.println(fishCage.toString());
        System.out.println(berth.toString());
        System.out.println(hedge.toString());

        castaway1.floatingOver();
        castaway2.floatingOver();
        castaway3.floatingOver();

        System.out.println(houseMommin.toString() + " is " +houseMommin.getSize().toString());
        int capacityThingsRoom=livingRoom.getCapacityThings();

        if(capacityThingsRoom<cart.getCapacity() ||capacityThingsRoom<trough.getCapacity() ||
                capacityThingsRoom<babyCarriage.getCapacity() || capacityThingsRoom<fishCage.getCapacity() ||
                capacityThingsRoom<berth.getCapacity() || capacityThingsRoom<hedge.getCapacity()){
            System.out.println("Some of the things are capable to resist the furnitore of the Room");
        }
        else{
            System.out.println("The size of the things is not enough for the furniture of the room");
        }

        moominPappa.moveAccessory(hatDad);
        moominPappa.sees(moominValley);
        moominPappa.setMood(Feelings.SURPRISE);
        moominPappa.sees(sun);
        moominPappa.feels(Feelings.DWINDLING);

        biggerHouse.approaching(houseMommin);
        System.out.println(biggerHouse.toString() + " is " +biggerHouse.getSize().toString());
        biggerHouse.isDangerous();

        if (biggerHouse.getCapacityFurniture() < houseMommin.getCapacityFurniture()){
            System.out.println("The " + biggerHouse.toString() + " is not enough for the furniture of the " + houseMommin.toString());
        }
        else{
            System.out.println("The " + biggerHouse.toString() + " is enough for the furniture of the " + houseMommin.toString());
        }

        if (biggerHouse.getCapacityCreatures() < houseMommin.getCapacityCreatures()){
            System.out.println("The " + biggerHouse.toString() + " is not enough for the family of the " + houseMommin.toString());
        }
        else{
            System.out.println("The " + biggerHouse.toString() + " is enough for the family of the " + houseMommin.toString());
        }

        // Anonymous class using an SAM (Functional Interface) and lambda expression.
        WaveInterface wave= (Thing thingToMove) -> System.out.println("Wave moves "+ thingToMove.toString());


        // 2 PART
        biggerHouse.approaching(houseMommin);
        Thing wall= new Thing("wall",TypeThing.WALL,1,false,true,2,2,false,1);
        moominPappa.sees(biggerHouse);
        biggerHouse.looksLike("театр");
        biggerHouse.setName("театр");

        System.out.println(biggerHouse.toString() + " has " + masks.toString());
        darkRoomBiggerHouse.printDarkness();
        darkRoomBiggerHouse.printSpiderWeb();

        darkRoomBiggerHouse.fallingApart();

        wave.waveMovesThing(darkRoomBiggerHouse.getWallsRemoved().get(0));

        System.out.println(redVelvetDrapes.toString());

        moominPappa.sees(darkRoomBiggerHouse);
        moominPappa.feels(Feelings.CURIOSITY);




    }
}
