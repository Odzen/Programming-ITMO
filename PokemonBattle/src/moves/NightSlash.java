package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class NightSlash extends PhysicalMove {

    public NightSlash(){super(Type.DARK,70.0D,100.0D);}

    @Override
    protected double calcCriticalHit(Pokemon pok1, Pokemon pok2) {
        if (pok1.getStat(Stat.SPEED) / 256.0D > Math.random()) {
            System.out.println(/*Messages.get(*/"Critical hit!");
            return 2.0D;
        } else
            return 1.0D;
    }
    @Override
    protected String describe() {
        return "uses Night Slash";
    }

}

/*

Effects
Has an increased chance for a critical hit.

MOVE DATA
Type	DARK
Category	Physical
Power	70
Accuracy	100
PP	15
Introduced	Generation 4
*/
