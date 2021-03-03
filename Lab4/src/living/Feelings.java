package living;

public enum Feelings {
    NEUTRAL("Neutral"),
    INTEREST("Interest"),
    DOUBTFUL("Doubtful"),
    HUNGER("Hunger"),
    STAGNATION("Stagnation"),
    TIREDNESS("Tiredness"),
    SATISFACTION("Satisfaction"),
    SURPRISE("Surprised"),
    DWINDLING("Dwindling"),
    ATTENTION("Attention"),
    CURIOSITY("Curiosity"),
    TRAPPED("Trapped");

    private final String name;
    Feelings(String name) {
        this.name = name;
    }

    public String getTextFeeling() {
        return " feels " + this.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
