package pokemons;

import moves.Confide;
import moves.Rest;
import moves.SteelWing;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Yanma extends Pokemon {

    public Yanma(String name, int level)
    {
        super(name, level);
        Type[] typesYanma={Type.FLYING,Type.BUG};
        setType(typesYanma);
        setStats(65.0D, 65.0D, 45.0D, 75.0D, 45.0D, 95.0D);
        setMove(new Confide(), new SteelWing(), new Rest());

    }


}
