package customList;

import java.util.AbstractList;
import java.util.List;


public class CustomList {
	public static <T> List<T> asList(T[] a) {
	    return new MyList<T>(a);
	}

	public static class MyList<T> extends AbstractList<T> {

	    private final T[] a;

	    MyList(T[] array) {
	        a = array;
	    }

	    public T get(int index) {
	        return a[index];
	    }
private static int count=0;
	    public T set(int index, T element) {
	        T oldValue = a[index];
	        a[index] = element;
	        return oldValue;
	    }
	    public T rem(int index,T element) {
	    	for(int i=index;i<a.length-1;i++) {
	    		a[i]=a[i+1];	
	    	}
	    	count++;
	    	return element;
	    }
	    public  int size() {
	    	int length=a.length-count;
	        return length;
	    }
	    public void display() {
	    	for(int i=0;i<size();i++) {
	    		System.out.print(a[i]+" ");
	    	}
	    	System.out.println();
	    }
	}

}

