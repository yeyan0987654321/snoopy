package com.fs.pojo;

public class Seller {
	private int seller_id;
	private String seller_name;
	private String seller_password;
	private int seller_phone_num;
	
	
	public Seller() {
		super();
	}
	public Seller(int seller_id, String seller_name, String seller_password, int seller_phone_num) {
		super();
		this.seller_id = seller_id;
		this.seller_name = seller_name;
		this.seller_password = seller_password;
		this.seller_phone_num = seller_phone_num;
	}
	public int getSeller_id() {
		return seller_id;
	}
	public void setSeller_id(int seller_id) {
		this.seller_id = seller_id;
	}
	public String getSeller_name() {
		return seller_name;
	}
	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}
	public String getSeller_password() {
		return seller_password;
	}
	public void setSeller_password(String seller_password) {
		this.seller_password = seller_password;
	}
	public int getseller_phone_num() {
		return seller_phone_num;
	}
	public void setseller_phone_num(int seller_phone_num) {
		this.seller_phone_num = seller_phone_num;
	}
	@Override
	public String toString() {
		return "Seller [seller_id=" + seller_id + ", seller_name=" + seller_name + ", seller_password="
				+ seller_password + ", seller_phone_num=" + seller_phone_num + ", toString()=" + super.toString() + "]";
	}
	
}
