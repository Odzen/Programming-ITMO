package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {

    public Blizzard() {
        super(Type.ICE, 110.0D, 70.0D);
    }

    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1D)
            Effect.paralyze(pokemon);
    }

    protected String describe() {
        return "uses Blizzard";
    }
}
/*
    Blizzard deals damage and has a 10% chance of paralyzing the target.

    Move data
    Type	ICE
    Category	Special  Special
        Power	110
        Accuracy	70
        PP	5
        Introduced	Generation 1

 */

