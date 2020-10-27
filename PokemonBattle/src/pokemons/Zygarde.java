package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zygarde extends Pokemon{

    public Zygarde(String name, int level)
    {
        super(name, level);
        Type[] typesZygarde={Type.DRAGON,Type.GROUND};
        setType(typesZygarde);
        setStats(108.0, 100.0D, 121.0D, 81.0D, 95.0D, 95.0D);
        setMove(new RockSLide(), new LandsWrath(),new Coil() ,new Rest());

    }

}
