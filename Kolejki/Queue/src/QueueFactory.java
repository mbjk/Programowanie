/**
 * Created by Micha³ on 6.11.2015.
 */
public class QueueFactory {
    public static Queue createQueue(int var) {
        switch(var) {
            case 1:
                System.out.print("Created FIFO queue\n");
                return new FIFOQueue();

            case 2:
                System.out.print("Created LIFO queue\n");
                return new LIFOQueue();

            default:
                return null;
        }
    }
}
