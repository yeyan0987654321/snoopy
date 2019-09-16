package com.pojo;

public class JavaBean {
private String say;

public String getSay() {
	return say;
}

public void setSay(String say) {
	this.say = say;
}

public JavaBean(String say) {
	super();
	this.say = say;
}

public JavaBean() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "JavaBean [say=" + say + "]";
}
}
