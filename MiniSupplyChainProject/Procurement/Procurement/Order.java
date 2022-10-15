package Procurement;

public class Order {
	int id;
	String supplier;
	String goods;
	int quantity;
	String orderdate;
	public Order(int id, String supplier, String goods, int quantity, String orderdate) {
		this.id = id;
		this.supplier = supplier;
		this.goods = goods;
		this.quantity = quantity;
		this.orderdate = orderdate;
	}
	public String toString() {
		return "id:" + id +", supplier:" + supplier +", goods:" + goods +", quantity:" + quantity +", orderdate:" + orderdate;
	}
}
