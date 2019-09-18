package com.fs.pojo;

import java.util.Date;

public class User_order {
	private int u_order_id;
	private String u_order_goods;
	private String u_order_name;
	private double u_order_amount;
	private Date u_order_time;
	private String u_order_status;

	public User_order() {
		super();
	}

	public User_order(int u_order_id, String u_order_goods, String u_order_name, double u_order_amount,
			Date u_order_time, String u_order_status) {
		super();
		this.u_order_id = u_order_id;
		this.u_order_goods = u_order_goods;
		this.u_order_name = u_order_name;
		this.u_order_amount = u_order_amount;
		this.u_order_time = u_order_time;
		this.u_order_status = u_order_status;
	}

	public int getU_order_id() {
		return u_order_id;
	}

	public void setU_order_id(int u_order_id) {
		this.u_order_id = u_order_id;
	}

	public String getU_order_goods() {
		return u_order_goods;
	}

	public void setU_order_goods(String u_order_goods) {
		this.u_order_goods = u_order_goods;
	}

	public String getU_order_name() {
		return u_order_name;
	}

	public void setU_order_name(String u_order_name) {
		this.u_order_name = u_order_name;
	}

	public double getU_order_amount() {
		return u_order_amount;
	}

	public void setU_order_amount(double u_order_amount) {
		this.u_order_amount = u_order_amount;
	}

	public Date getU_order_time() {
		return u_order_time;
	}

	public void setU_order_time(Date u_order_time) {
		this.u_order_time = u_order_time;
	}

	public String getU_order_status() {
		return u_order_status;
	}

	public void setU_order_status(String u_order_status) {
		this.u_order_status = u_order_status;
	}

	@Override
	public String toString() {
		return "User_order [u_order_id=" + u_order_id + ", u_order_goods=" + u_order_goods + ", u_order_name="
				+ u_order_name + ", u_order_amount=" + u_order_amount + ", u_order_time=" + u_order_time
				+ ", u_order_status=" + u_order_status + "]";
	}

}
