package living;

public enum Accesories {
    HAT("шляпа"),
    SHIRT("рубашка"),
    APRON("фартук"),
    TROUSERS("брюки");

    private final String name;
    Accesories(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
