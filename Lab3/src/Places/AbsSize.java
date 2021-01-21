package Places;

import java.util.ArrayList;

public abstract class AbsSize{

    private int length;
    private int width;
    private static int area;


    public AbsSize(String name) {
        this.name = name;
        this.things = new ArrayList<>();
    }

    //The size depends of the typething and others characteristics
    public abstract void defineSize();
}
