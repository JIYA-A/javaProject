package movie;

public class MyPageVO {

}
private int payUid;
private String payMethod;
private int totalPrice;
private String payDate;
private int userUid;
private int seatUid;
public PayVO(int payUid, String payMethod, int totalPrice, String payDate, int userUid, int seatUid) {
	super();
	this.payUid = payUid;
	this.payMethod = payMethod;
	this.totalPrice = totalPrice;
	this.payDate = payDate;
	this.userUid = userUid;
	this.seatUid = seatUid;
}
public int getPayUid() {
	return payUid;
}
public String getPayMethod() {
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
public void setPayUid(int payUid) {
	this.payUid = payUid;
}
public void setPayMethod(String payMethod) {
	this.payMethod = payMethod;
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
