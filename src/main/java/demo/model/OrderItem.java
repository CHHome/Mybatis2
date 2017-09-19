package demo.model;

public class OrderItem {
	private Integer id;
	private Integer oId;
	private String item;
	private int quantity;
	private double price;
	private Order order = new Order();
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getoId() {
		return oId;
	}
	public void setoId(Integer oId) {
		this.oId = oId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", oId=" + oId + ", item=" + item + ", quantity=" + quantity + ", price=" + price
				+ "]" + order.getOrderNo();
	}
}
