package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Astonish extends PhysicalMove {

    public Astonish() { super(Type.GHOST, 30.0D, 100.0D);}


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
Type	GHOST
Category	Physical
Power	30
Accuracy	100
PP	15
Introduced	Generation 3

 * */