
public class TestInterfaceDemo {

	public static void main(String[] args) {
	/*	Printable pArr[]=new Printable[2];
		pArr[0]=new Customer(111,"Sid");
		pArr[1]=new Customer(222,"Deepak");
		
		pArr[0].print();
		pArr[1].print();
	*/
		
		Printable p1=new Customer(111,"Sid");
		//Customer c1=new Customer(222,"B");
		p1.print();
		System.out.println(((Customer)p1).sayHi());
		}

}
