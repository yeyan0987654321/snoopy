package com.fs.pojo;

public class Seller_order_computer {
	private int computer_id;
	private int computer_number;
	private String color;
	private String price;
	public Seller_order_computer() {
		super();
	}
	public Seller_order_computer(int computer_id, int computer_number, String color, String price) {
		super();
		this.computer_id = computer_id;
		this.computer_number = computer_number;
		this.color = color;
		this.price = price;
	}
	public int getComputer_id() {
		return computer_id;
	}
	public void setComputer_id(int computer_id) {
		this.computer_id = computer_id;
	}
	public int getComputer_number() {
		return computer_number;
	}
	public void setComputer_number(int computer_number) {
		this.computer_number = computer_number;
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
		return "Seller_order_computer [computer_id=" + computer_id + ", computer_number=" + computer_number + ", color="
				+ color + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
	
	
}
