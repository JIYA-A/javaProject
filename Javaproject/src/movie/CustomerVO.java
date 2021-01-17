package movie;

public class CustomerVO {
	private int userUid; 
	private String userName;
	private String userId; 
	private String userPw; 
	private String userPhoneNum;
	
	public CustomerVO(String userName, String userId, String userPw, String userPhoneNum) {
		super();
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		this.userPhoneNum = userPhoneNum;
	}
	public int getUserUid() {
		return userUid;
	}
	public String getUserName() {
		return userName;
	}
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserPhoneNum() {
		return userPhoneNum;
	}
	public void setUserUid(int userUid) {
		this.userUid = userUid;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setUserPhoneNum(String userPhoneNum) {
		this.userPhoneNum = userPhoneNum;
	}
	
	
}
