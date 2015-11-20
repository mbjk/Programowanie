/**
 * Created by Micha³ on 7.11.2015.
 */
public class Kontener {

    public static void main(String[] args) {
        xArrayList<String> myArray = new xArrayList();


        myArray.addElement("asdf");
        myArray.addElement("asdf1");
        myArray.addElement("asdf2");
        myArray.addElement("asdf3");
        myArray.addElement("asdf4");
        myArray.addElement("asdf5");
        myArray.addElement("asdf6");
        myArray.addElement("asdf7");
        myArray.addElement("asdf8");
        myArray.addElement("asdf9");
        myArray.addElement("asdf10");

        System.out.println("Is array empty?: " + String.valueOf(myArray.isEmpty()) + "\n");
        System.out.println("1 element is: " + myArray.getFromIndex(1) + "\n");
        System.out.println("6 element is: " + myArray.getFromIndex(6) + "\n");
        System.out.println("size of an array is: " + myArray.getSize() + "\n");
        System.out.println("An array contains \"asdf9\": " + myArray.contains("asdf9")+ "\n");

        System.out.println("Changing element at 7\n");
        myArray.ChangeAt(7, "changed seven");

        System.out.println("1 element is: " + myArray.getFromIndex(7) + "\n");
        System.out.println("Clearing array\n");
        myArray.clear();

        System.out.println("Is array empty?: " + myArray.isEmpty() + "\n");
    }
}
