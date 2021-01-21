package things;

public enum Size {
    SMALL("маленький"),
    MEDIUM("средний"),
    BIG("большой");

    private final String name;
    Size(String name) {
        this.name = name;
    }

    public String getTextSize() {
        return " is " + this.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
