package moves;

import ru.ifmo.se.pokemon.*;

public class RockSLide extends PhysicalMove {

    public RockSLide() { super(Type.ROCK, 75.0D, 90.0D);}


    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.3D) {
            Effect.flinch(pokemon);
        }
    }

    protected String describe() {
        return "uses Rock Slide";
    }

}
/*
Effects
Has a 30% chance to make the target flinch.

* Move data
Type	ROCK
Category	Physical
Power	75
Accuracy	90
PP	10
Introduced	Generation 1

 * */
