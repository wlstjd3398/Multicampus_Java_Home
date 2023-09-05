package chap07;

public class LoginBean {

	private final String ID = "longlee";
	private final String PASSWD = "6789";
	
	private String id;
	private String passwd;
	
	public LoginBean() {
		
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public boolean isLogin() {
		boolean result = false;
		
		if(this.id.equals(this.ID) && this.passwd.equals(PASSWD)) {
			result = true;
		}
		
		return result;
	}
}
