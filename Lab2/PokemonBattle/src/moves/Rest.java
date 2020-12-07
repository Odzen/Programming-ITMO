package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    public Rest(){super(Type.PSYCHIC, 0.0D, 0.0D);}

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect e = new Effect().condition(Status.SLEEP).turns(3).stat(Stat.HP,6);
        pokemon.setCondition(e);
    }

    @Override
    protected String describe() {
        return "uses Rest";
    }

}

/*
*
* Effects
User sleeps for two turns, completely healing itself.
*
*
* Move data
Type	PSYCHIC
Category	Status
Power	—
Accuracy	—
PP	10
Introduced	Generation 1
* */
