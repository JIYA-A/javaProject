package movie;

public class PayVO {

	private int payUid;
	private int totalPrice;
	private String payDate;
	private String cardNumber;
	private String movieName;
	
	public PayVO(String movieName, String payDate, int totalPrice) {
		super();
		this.totalPrice = totalPrice;
		this.payDate = payDate;
		this.movieName = movieName;
	}

	public PayVO(int totalPrice, String cardNumber, String movieName) {
		super();
		this.totalPrice = totalPrice;
		this.cardNumber = cardNumber;
		this.movieName = movieName;
	}

	public PayVO(int totalPrice, String payDate, String cardNumber, String movieName) {
		super();
		this.totalPrice = totalPrice;
		this.payDate = payDate;
		this.cardNumber = cardNumber;
		this.movieName = movieName;
	}
	
	public PayVO(int payUid, int totalPrice, String payDate, String cardNumber, String movieName) {
		super();
		this.payUid = payUid;
		this.totalPrice = totalPrice;
		this.payDate = payDate;
		this.cardNumber = cardNumber;
		this.movieName = movieName;
	}

	public int getPayUid() {
		return payUid;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public String getPayDate() {
		return payDate;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setPayUid(int payUid) {
		this.payUid = payUid;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	
}
	
	