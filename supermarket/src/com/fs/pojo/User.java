package com.fs.pojo;
/**
 * 
 *     用户详情表
 *
 */
public class User {
	private int user_id;
	private String nick_name;
	private String password;
	private String gender;
	private int age;
	private String email;
	private String phone_num;
	private int login_nums;

	public User() {
		super();
	}

	public User(int user_id, String nick_name, String password, String gender, int age, String email, String phone_num,
			int login_nums) {
		super();
		this.user_id = user_id;
		this.nick_name = nick_name;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phone_num = phone_num;
		this.login_nums = login_nums;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}

	public int getLogin_nums() {
		return login_nums;
	}

	public void setLogin_nums(int login_nums) {
		this.login_nums = login_nums;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", nick_name=" + nick_name + ", password=" + password + ", gender=" + gender
				+ ", age=" + age + ", email=" + email + ", phone_num=" + phone_num + ", login_nums=" + login_nums + "]";
	}

}
