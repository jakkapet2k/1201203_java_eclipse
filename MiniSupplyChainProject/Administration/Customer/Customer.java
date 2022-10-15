package Customer;

public class Customer {
	int id;
	String user;
	String pass;
	String name;
	public Customer(int id, String user, String pass, String name) {
		this.id = id;
		this.user = name;
		this.pass = pass;
		this.name = name;
	}
	public String toString() {
		return "id:" + id +", user:" + user +", pass:" + pass +", name:" + name ;
	}
}
