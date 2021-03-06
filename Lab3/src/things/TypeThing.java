package things;

public enum TypeThing {

    CART("телега"),
    TROUGHS("корыта"),
    BABYSTROLLERS("детские коляски"),
    FISHTANK("садки для рыб"),
    BERTH("причал"),
    HEDGE("изгородь"),
    SUN("сольце"),
    FURNITURE("Мебель"),
    ANYTHING("предмет"),
    HOUSE("дом"),
    TREE("дерево"),
    ROOM("room");



    private final String name;
    TypeThing(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
