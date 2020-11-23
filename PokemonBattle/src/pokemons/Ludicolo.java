package pokemons;

import moves.HydroPump;

public class Ludicolo extends Lombre{

    public Ludicolo(String name, int level) {
        super(name, level);
        setStats(86.0D, 76.0D, 86.0D, 116.0D, 56.0D, 95.0D);
        addMove(new HydroPump());

    }
}
