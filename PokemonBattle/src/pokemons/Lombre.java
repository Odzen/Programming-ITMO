package pokemons;

import moves.Astonish;
import ru.ifmo.se.pokemon.Pokemon;


public class Lombre extends Lotad{

    public Lombre(String name, int level) {
        super(name, level);
        setStats(86.0D, 76.0D, 86.0D, 116.0D, 56.0D, 95.0D);
        addMove(new Astonish());

    }
}
