
public class Customer extends DomainObject {
	
	private String name;
	
	private Customer(String name, Long id) {
		super(id);
		this.name = name;
	}
	
	// creating new Customer in DB method 
	public Customer create (String name) {
		
		Long newObjId = IdGenerator.INSTANCE.nextId(); // id of new customer
		
		Customer obj = new Customer(name, newObjId);   // new customer
		obj.markNew(); // some action with new customer
		return obj;
	}
	
}
