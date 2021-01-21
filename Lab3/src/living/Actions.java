package living;

import Places.Room;

public interface Actions {

    public void moves(Room nextPlace);
    public void sees(Object see);
    public void feels(Feelings feeling);
    public void said(Creature creature, String msg);
    public void moveAccessory(Accesories accessory);
}
