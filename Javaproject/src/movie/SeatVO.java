package movie;

public class SeatVO {

	public SeatVO() {
		super();
	}
	
	private int seatUid;
	private String seatName;
	private int isSeatRsv;
	private int movieUid;
	
	public SeatVO(int seatUid, String seatName, int isSeatRsv, int movieUid) {
		super();
		this.seatUid = seatUid;
		this.seatName = seatName;
		this.isSeatRsv = isSeatRsv;
		this.movieUid = movieUid;
	}
	public int getSeatUid() {
		return seatUid;
	}
	public String getSeatName() {
		return seatName;
	}
	public int getIsSeatRsv() {
		return isSeatRsv;
	}
	public int getMovieUid() {
		return movieUid;
	}
	public void setSeatUid(int seatUid) {
		this.seatUid = seatUid;
	}
	public void setSeatName(String seatName) {
		this.seatName = seatName;
	}
	public void setIsSeatRsv(int isSeatRsv) {
		this.isSeatRsv = isSeatRsv;
	}
	public void setMovieUid(int movieUid) {
		this.movieUid = movieUid;
	}
	
	
}
