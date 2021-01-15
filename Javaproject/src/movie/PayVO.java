package movie;

public class PayVO {

	private int payUid;
	private String payMethod;
	private int totalPrice;
	private String payDate;
	private int userUid;
	private int seatUid;
	
	public PayVO(int patUid, String patMethod, int totalPrice, String payDate, int userUid, int seatUid) {
		super();
		this.payUid = patUid;
		this.payMethod = patMethod;
		this.totalPrice = totalPrice;
		this.payDate = payDate;
		this.userUid = userUid;
		this.seatUid = seatUid;
	}
	public int getPatUid() {
		return payUid;
	}
	public String getPatMethod() {
		return payMethod;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public String getPayDate() {
		return payDate;
	}
	public int getUserUid() {
		return userUid;
	}
	public int getSeatUid() {
		return seatUid;
	}
	public void setPatUid(int patUid) {
		this.payUid = patUid;
	}
	public void setPatMethod(String patMethod) {
		this.payMethod = patMethod;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public void setUserUid(int userUid) {
		this.userUid = userUid;
	}
	public void setSeatUid(int seatUid) {
		this.seatUid = seatUid;
	}
	
}
