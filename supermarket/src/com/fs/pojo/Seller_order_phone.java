package com.fs.pojo;

public class Seller_order_phone {
	private int phone_id;
	private int phone_number;
	private String color;
	private String price;
	public Seller_order_phone() {
		super();
	}
	public Seller_order_phone(int phone_id, int phone_number, String color, String price) {
		super();
		this.phone_id = phone_id;
		this.phone_number = phone_number;
		this.color = color;
		this.price = price;
	}
	public int getPhone_id() {
		return phone_id;
	}
	public void setPhone_id(int phone_id) {
		this.phone_id = phone_id;
	}
	public int getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Seller_order_phone [phone_id=" + phone_id + ", phone_number=" + phone_number + ", color=" + color
				+ ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
}
