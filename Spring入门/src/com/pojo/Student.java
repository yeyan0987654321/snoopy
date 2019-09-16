package com.pojo;


import java.util.Arrays;
import java.util.List;

public class Student {
   private int id;
   private String name;
   private boolean bool;
   Card card2;
   private double dou;
   private String[] arrs;
   private List<String> list;
public Student(int id, String name, boolean bool, Card card2, double dou, String[] arrs, List list) {
	super();
	this.id = id;
	this.name = name;
	this.bool = bool;
	this.card2 = card2;
	this.dou = dou;
	this.arrs = arrs;
	this.list = list;
}
public List getList() {
	return list;
}
public void setList(List list) {
	this.list = list;
}
public Student(int id, String name, boolean bool, Card card2, double dou, String[] arrs) {
	super();
	this.id = id;
	this.name = name;
	this.bool = bool;
	this.card2 = card2;
	this.dou = dou;
	this.arrs = arrs;
}
public String[] getArrs() {
	return arrs;
}
public void setArrs(String[] arrs) {
	this.arrs = arrs;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isBool() {
	return bool;
}
public void setBool(boolean bool) {
	this.bool = bool;
}
public Card getCard2() {
	return card2;
}
public void setCard2(Card card2) {
	this.card2 = card2;
}
public double getDou() {
	return dou;
}
public void setDou(double dou) {
	this.dou = dou;
}
public Student(int id, String name, boolean bool, Card card2, double dou) {
	super();
	this.id = id;
	this.name = name;
	this.bool = bool;
	this.card2 = card2;
	this.dou = dou;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", bool=" + bool + ", card2=" + card2 + ", dou=" + dou + ", arrs="
			+ Arrays.toString(arrs) + ", list=" + list + "]";
}

}
