package startBattle;

import pokemons.*;
import ru.ifmo.se.pokemon.*;



public class StartBattle {
    public static void main (String args[])
    {
        Battle battleField = new Battle ();

        battleField.addAlly(new Lombre("Lombre", 8));
        battleField.addAlly(new Zygarde("Zygarde", 20));
        battleField.addAlly(new Yanma("Yanma", 29));

        battleField.addFoe(new Lotad("Lotad",29));
        battleField.addFoe(new Yanmega("Yanmega",29));
        battleField.addFoe(new Ludicolo("Ludicolo", 32));

        battleField.go ();
    }
}
