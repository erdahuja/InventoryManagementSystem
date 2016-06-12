package IMSLogic;

import java.io.Serializable;

public class ReadWriteUser implements Serializable  {
	
	
	private static final long serialVersionUID = 1L;
	private String name;
	private  String pwd;
	private String email;
	private String phoneNumber;
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", pwd=" + pwd + ", email="
				+ email + ", phone=" + phoneNumber + "]";
	}
	

}
