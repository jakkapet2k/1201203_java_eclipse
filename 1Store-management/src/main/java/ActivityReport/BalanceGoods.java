package ActivityReport;

public class BalanceGoods {
	String name;
	int stock;
	BalanceGoods (String name,int stock ) {
		this.name = name;
		this.stock = stock;

	}
	
	public String toString() {
		return " name:" + name + ", stock:" + stock;
	}
}
