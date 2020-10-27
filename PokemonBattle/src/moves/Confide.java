package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Confide extends StatusMove {
    public Confide() { super(Type.NORMAL, 0.0D, 0.0D);}

        protected void applyOppEffects(Pokemon pok) {pok.setMod(Stat.SPECIAL_ATTACK , -1); }

        protected String describe() {
        return "uses Confide";
    }

}

/*
*
* Effects
Confide Lowers the target's Special Attack by one stage.
*
*
* Move data
Type	NORMAL
Category	Status
Power	—
Accuracy	—
PP	20
Introduced	Generation 6
* */
