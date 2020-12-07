package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class LandsWrath extends PhysicalMove {

    public LandsWrath() { super(Type.GROUND, 90.0D, 100.0D);}

    @Override
    protected String describe() {
        return "uses Lands Wrath";
    }
}

/*
Inflicts regular damage with no additional effect.

Move data
Type	GROUND
Category	Physical  Physical
Power	90
Accuracy	100
PP	10
Introduced	Generation 6
*/
