package P01;

class Order {
	
	private int orderId;
	private String productName;
	private String consumerName;
	private int price;
	private int stock;
	
	public Order(int orderId, String productName, String consumerName, int price, int stock) {
		this.orderId = orderId;
		this.productName = productName;
		this.consumerName = consumerName;
		this.price = price;
		this.stock = stock;
	}

	public static OrderBuilder builder() {
		return new OrderBuilder();
	}
	
	public void showOrderInfo() {
		System.out.println(orderId);
		System.out.println(productName);
		System.out.println(consumerName);
		System.out.println(price);
		System.out.println(stock);
	}
}
