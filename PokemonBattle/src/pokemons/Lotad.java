package pokemons;

import moves.Blizzard;
import moves.SwordsDance;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lotad extends Pokemon {

    public Lotad(String name, int level)
    {
        super(name,level);
        Type[] typesLotad={Type.WATER,Type.GRASS};
        setType(typesLotad);
        setStats(40.0D, 30.0D, 30.0D, 40.0D, 50.0D, 30.0D);
        setMove(new SwordsDance(), new Blizzard());

    }
}
