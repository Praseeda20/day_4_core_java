
public class Customer implements Printable, Sortable{
	private int custId;
	private String custName;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	@Override
	public void print() {
		System.out.println("Customer Id: "+custId);
		System.out.println("Customer Name: "+custName);
	}
	@Override
	public Sortable sort(Sortable[] list) {
		return null;
	}
	public String sayHi()
	{
		return "Welcome All";
	}
}
