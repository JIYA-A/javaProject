package movie;

public class SeatVO {

	private int seatUid;
	private String seatName;
	private String isSeatRsv;
	private int movieUid;
	public SeatVO(int seatUid, String seatName, String isSeatRsv, int movieUid) {
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
	public String getIsSeatRsv() {
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
	public void setIsSeatRsv(String isSeatRsv) {
		this.isSeatRsv = isSeatRsv;
	}
	public void setMovieUid(int movieUid) {
		this.movieUid = movieUid;
	}
	
	
}
