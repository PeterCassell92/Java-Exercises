// showing use of protected method. Cannot be called from outside of class. Can be called from derived class.
import src.objects.PictureFrame;
public class ch6ex15{
	public static void main(String[] args){
		PictureFrame p = new PictureFrame();
		//p.openhiddensafe(); 
	}
}
