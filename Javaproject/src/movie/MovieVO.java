package movie;

public class MovieVO {
	private int movieUid; 
	private String movieTitle; 
	private String movieTime;
	public MovieVO(int movieUid, String movieTitle, String movieTime) {
		super();
		this.movieUid = movieUid;
		this.movieTitle = movieTitle;
		this.movieTime = movieTime;
	}
	public int getMovieUid() {
		return movieUid;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public String getMovieTime() {
		return movieTime;
	}
	public void setMovieUid(int movieUid) {
		this.movieUid = movieUid;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	public void setMovieTime(String movieTime) {
		this.movieTime = movieTime;
	} 
	

}
