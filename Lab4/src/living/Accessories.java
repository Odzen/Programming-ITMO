package living;

public enum Accessories {
    HAT("шляпа"),
    SHIRT("рубашка"),
    APRON("фартук"),
    TROUSERS("брюки");

    private final String name;
    Accessories(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
