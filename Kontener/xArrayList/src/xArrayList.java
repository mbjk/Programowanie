/**
 * Created by Micha³ on 7.11.2015.
 */
public class xArrayList<T> {
    private T[] storedData_m;
    private int size_m;

    xArrayList() {

        storedData_m = null;
        size_m = 0;
    }
    public void addElement(T object) {
        if(size_m == 0) {
            size_m++;
            T[] newItems = (T[])new Object[size_m];
            newItems[size_m-1] = object;
            storedData_m = newItems;

        } else {
            size_m++;
            T[] oldItems = storedData_m;
            T[] newItems = (T[])new Object[size_m];

            for (int i = 0; i < size_m-1 ; i++) {
                newItems[i] = oldItems[i];
            }
            newItems[size_m-1] = object;
            storedData_m = newItems;
        }
    }

    public void ChangeAt(int index, T object) {
        storedData_m[index] = index <= size_m ? object : null;
    }


    public T getFromIndex(int index) {
        for(int i = 0; i < storedData_m.length; i++) {
            if(index == i) {
                return storedData_m[i];
            }
        }
        return null;
    }

    public boolean isEmpty() {
        if (size_m > 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean contains(T object) {
        for (int i = 0; i < size_m; i++) {
            if(storedData_m[i] == object) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < size_m; i++) {
            storedData_m[i] = null;
        }
        size_m = 0;
    }

    public int getSize() {
        return size_m;
    }

}
