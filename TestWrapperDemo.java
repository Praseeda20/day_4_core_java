
public class TestWrapperDemo {

	public static void main(String[] args) {
		int i=10;
		Integer i1=new Integer(i); //boxing
		int k=i1.intValue(); //unboxing
		
		Integer i2=70; //Auto boxing
		int z=i2; //Auto unboxing
	}

}
