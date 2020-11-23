package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class SwordsDance extends StatusMove{

    public SwordsDance(){super(Type.NORMAL, 0.0D, 0.0D);}


    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 2);

    }

    protected String describe() {
        return "uses Swords Dance";
    }

}

/*
*
* Effects
Swords Dance sets the user's Attack by two stages.
*
*
* Move data
Type	NORMAL
Category	Status
Power	—
Accuracy	—
PP	20
Introduced	Generation 1
* */
