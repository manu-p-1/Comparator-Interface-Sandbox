package sandbox.streams;
import java.util.Comparator;

public class ArrayUtil {

	public static <T> T[] sort(T[] t, Comparator<T> c) { //My own sort method
		for(int j = 0; j < t.length; j++) {
			for(int i = 0; i < t.length - 1; i++) {
				if(c.compare(t[i],t[i+1]) > 0) {
					T temp = t[i];
					t[i] = t[i + 1];
					t[i + 1] = temp;
				}
			}
		}
		return t;
	}
}
