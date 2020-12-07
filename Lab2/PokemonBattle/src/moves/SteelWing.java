package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class SteelWing extends PhysicalMove {

    public SteelWing() { super(Type.FIGHTING, 70.0D, 90.0D);}


    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() <= 0.1D) {
            pokemon.setMod(Stat.DEFENSE, 1);
        }
    }

    protected String describe() {
        return "uses Stell Wing";
    }

}
/*

Effects
Has a 10% chance to raise the user's Defense by one stage.

* Move data
Type	FIGHTING
Category	Physical
Power	70
Accuracy	90
PP	25
Introduced	Generation 2
* */

