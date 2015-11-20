/**
 * Created by Micha³ on 6.11.2015.
 */
public class LIFOQueue extends Queue {

    public void addToQueue(String elemString, PRIORITY priority) {
        MessageType newElem = new MessageType(elemString, priority, Vec_m.size());
        Vec_m.add(newElem);
    }

    public MessageType getFromQueue() {
        return Vec_m.lastElement();
    }
}
