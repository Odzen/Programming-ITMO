package moves;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class HydroPump extends SpecialMove {

    public HydroPump() {
        super(Type.WATER, 110.0D, 80.0D);
    }

    protected String describe() {
        return "uses Hydro Pump";
    }
}
/*
    Hydro Pump Inflicts regular damage with no additional effect.

    Move data
    Type	WATER
    Category	Special  Special
        Power	110
        Accuracy	80
        PP	5
        Introduced	Generation 1

 */

