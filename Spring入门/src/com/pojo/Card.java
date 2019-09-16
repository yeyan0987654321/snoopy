package com.pojo;

public class Card {
   private String cId;

public String getcId() {
	return cId;
}

public void setcId(String cId) {
	this.cId = cId;
}

public Card() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Card [cId=" + cId + "]";
}
}
