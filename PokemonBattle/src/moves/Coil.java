package moves;

import ru.ifmo.se.pokemon.*;

public class Coil extends StatusMove{
    public Coil() { super(Type.POISON, 0.0D, 0.0D);}


    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 1);
        pokemon.setMod(Stat.DEFENSE, 1);
        pokemon.setMod(Stat.ACCURACY, 1);
    }

    protected String describe() {
        return "Coil";
    }
}

/*
Effects
Raises the user's Attack, Defense, and accuracy by one stage each.


* Move data
Type	POISON
Category	Status
Power	0
Accuracy	0
PP	20
Introduced	Generation 5

 * */
