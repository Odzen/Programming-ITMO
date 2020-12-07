package startBattle;

import pokemons.*;
import ru.ifmo.se.pokemon.*;



public class StartBattle {
    public static void main (String args[])
    {
        Battle battleField = new Battle ();

        battleField.addAlly(new Lombre("-GrassMan1", 8));
        battleField.addAlly(new Zygarde("-LargeWorm", 20));
        battleField.addAlly(new Yanma("-Dragonfly1", 29));

        battleField.addFoe(new Lotad("-GrassMan2",29));
        battleField.addFoe(new Yanmega("-Dragonfly2",29));
        battleField.addFoe(new Ludicolo("-GrassMan3", 32));

        battleField.go ();
    }
}
