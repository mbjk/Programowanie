import java.util.Vector;

/**
 * Created by Micha³ on 6.11.2015.
 */

public abstract class Queue {

    protected Vector<MessageType> Vec_m;

    public Queue() { Vec_m = new Vector<MessageType>(); }

    public abstract void addToQueue(String element, PRIORITY priority);
    public abstract MessageType getFromQueue();
}
