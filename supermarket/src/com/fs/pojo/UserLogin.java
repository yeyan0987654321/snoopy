package com.fs.pojo;

//用户登录表
public class UserLogin {
	private int login_id;
	private String nick_name;
	private String password;
	private int user_id;

	public UserLogin() {
		super();
	}

	public UserLogin(int login_id, String nick_name, String password, int user_id) {
		super();
		this.login_id = login_id;
		this.nick_name = nick_name;
		this.password = password;
		this.user_id = user_id;
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "UserLogin [login_id=" + login_id + ", nick_name=" + nick_name + ", password=" + password + ", user_id="
				+ user_id + "]";
	}

}
