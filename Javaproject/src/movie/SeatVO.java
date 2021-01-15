package movie;

public class SeatVO {

	private int seatUid;
	private String seatName;
	private char isSeatRsv;
	private int movidUid;
	public SeatVO(int seatUid, String seatName, char isSeatRsv, int movidUid) {
		super();
		this.seatUid = seatUid;
		this.seatName = seatName;
		this.isSeatRsv = isSeatRsv;
		this.movidUid = movidUid;
	}
	public int getSeatUid() {
		return seatUid;
	}
	public String getSeatName() {
		return seatName;
	}
	public char getIsSeatRsv() {
		return isSeatRsv;
	}
	public int getMovidUid() {
		return movidUid;
	}
	public void setSeatUid(int seatUid) {
		this.seatUid = seatUid;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	public void setIsSeatRsv(char isSeatRsv) {
		this.isSeatRsv = isSeatRsv;
	}
	public void setMovidUid(int movidUid) {
		this.movidUid = movidUid;
	}
	
}
