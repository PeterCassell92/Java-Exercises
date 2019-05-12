// showing access of protected data with getters.
import src.Data.DataClass;
import java.util.Arrays;

public class ch5ex7 {
	public static void main(String[] args){
		DataClass h = new DataClass();
		System.out.println(Arrays.toString(h.getter())); // will get the info and modify it before output.

		System.out.println(h.x); // will throw error as trying to get protected info.
	}
}