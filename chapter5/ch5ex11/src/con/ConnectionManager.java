//package includes class with private constructors and demonstrates how to create new instances of these objects and access data from them.
package src.con;

class Connection{
	private Connection(){}

	public static Connection makeConnection(){
		return new Connection();
	}
	private static Connection pc1 = new Connection();
	
	public static Connection access(){
		return pc1;
	}
	public void f(){
		System.out.println("f() has been accessed.");
	}
}	


class AltConnection{
	void f() { new ConnectionManager();}

}

public class ConnectionManager{
	public static void test(){
		Connection con1 = Connection.makeConnection(); //uses a public function to call a private constructor.
		AltConnection con2 = new AltConnection(); // this class is Friendly so can be created directly (within the same file)
		Connection.access().f();
	}
}
