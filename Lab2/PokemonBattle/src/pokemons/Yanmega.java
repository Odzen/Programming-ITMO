package pokemons;

import moves.NightSlash;

public class Yanmega extends Yanma{

    public Yanmega(String name, int level) {
        super(name, level);
        setStats(86.0D, 76.0D, 86.0D, 116.0D, 56.0D, 95.0D);
        addMove(new NightSlash());

    }
}
