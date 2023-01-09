import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/// якщо  метод не реалізований на 100%
//то повертати помилку



public class ThreadSafeList implements Set {

    /// +++
    @Override
    public boolean add(Object o) {
        return false;
    }
    ///+++
    @Override
    public boolean remove(Object o) {
        return false;
    }
    ///----
    public boolean get (Object o) {
        return false;
    }




    /////////////////////////////////////////////////
    @Override
    public int size() {
        throw new IllegalArgumentException();
        //return 0;
    }

    @Override
    public boolean isEmpty() {

        throw new IllegalArgumentException();
        //return false;
    }
    @Override
    public boolean contains(Object o) {
        throw new IllegalArgumentException();
        // return false;
    }

    @Override
    public Iterator iterator() {

        throw new IllegalArgumentException();
        // return null;
    }
    @Override
    public Object[] toArray() {

        throw new IllegalArgumentException();
        // return new Object[0];
    }
    @Override
    public boolean addAll(Collection c) {
        throw new IllegalArgumentException();
        //return false;
    }
    @Override
    public void clear() {
        throw new IllegalArgumentException();
    }

    @Override
    public boolean removeAll(Collection c)
    {
        throw new IllegalArgumentException();
        //return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new IllegalArgumentException();
       // return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new IllegalArgumentException();
        // return false;
    }

    @Override
    public Object[] toArray(Object[] a) {

        throw new IllegalArgumentException();
        // return new Object[0];
    }
}
