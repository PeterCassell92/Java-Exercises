// This code will not compile as it tries to access a Friendly class from outside of the same folder. If this file were in the same directory it would compile.
//Otherwise, we'd need to make the PackagedClass public.

package src.foreign;
import src.packages.*;
public class Foreign{
	public static void main(String[] args){
		PackagedClass pc = new PackagedClass();
	}
}