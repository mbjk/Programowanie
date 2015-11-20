import sun.plugin2.message.Message;

/**
 * Created by Micha³ on 6.11.2015.
 */
public class MessageType {
    private String message_m;
    private PRIORITY PRIO_m;
    private int ID_m;

    public void setMessage(String newMess) {
        message_m = newMess;

    }

    public String getMessage() {
        return message_m;

    }

    public void setPriority(PRIORITY newPrio) {
        PRIO_m = newPrio;
    }

    public PRIORITY getPrio() {
        return PRIO_m;
    }

    public int getID() {
        return ID_m;

    }

    public void setID(int newID) {
        ID_m = newID;
    }

    public MessageType() {
        ID_m = 0;
    }

    public MessageType(String newMess, PRIORITY newPrio, int newID) {
        ID_m = newID;
        message_m = newMess;
        PRIO_m = newPrio;
    }
}
