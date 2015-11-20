import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Micha³ on 6.11.2015.
 */

enum ProgramState {
    EXIT,
    RUNNING
}

public class Kolejki {
    public static void main(String[] args) {
        ProgramState State_m = ProgramState.RUNNING;
        Queue usedQueue = null;
        int choice = 0;
        while(State_m != ProgramState.EXIT) {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Create queue (type 1 to use FIFO, 2 to use LIFO, 3 to exit)\n");
            try{
                try {
                    choice = Integer.parseInt(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }catch(NumberFormatException nfe){
                System.err.println("Invalid Format!");
            }

            if (choice == 3) {
                State_m = ProgramState.EXIT;
                break;
            }
            usedQueue = QueueFactory.createQueue(choice);

            usedQueue.addToQueue("Test PRIO Urgent", PRIORITY.P_URGENT);
            usedQueue.addToQueue("Test PRIO Low", PRIORITY.P_LOW);
            usedQueue.addToQueue("Test PRIO Normal", PRIORITY.P_NORMAL);
            usedQueue.addToQueue("Test2 PRIO Normal", PRIORITY.P_URGENT);

            MessageType testType = null;
            testType = usedQueue.getFromQueue();


            System.out.print("Pulled an element from queue \n Pulled message info: \n Contained text: " + testType.getMessage() + "\n" + " Priority: " + testType.getPrio() + "\n ID: " + testType.getID() + ".\n");
        }
    }
}
