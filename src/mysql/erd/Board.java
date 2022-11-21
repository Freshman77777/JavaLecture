package mysql.erd;

import java.time.LocalDateTime;

public class Board {
	private int bid;
	private String btitle;
	private String bcontent;
	private String uid;
	private LocalDateTime modTime;
	private int viewCount;
	private int replyCount;
	
	Board() {}
	Board(String btitle, String bcontent, String uid) {
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.uid = uid;
	}
	Board(int bid, String btitle, String bcontent, String uid, LocalDateTime modTime, int viewCount, int replyCount) {
		this.bid = bid;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.uid = uid;
		this.modTime = modTime;
		this.viewCount = viewCount;
		this.replyCount = replyCount;
	}
	@Override
	public String toString() {
		return "Board [" + bid + ", " + btitle + ", " + bcontent + ", " + uid + ", "
				+ modTime + ", " + viewCount + ", " + replyCount + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public LocalDateTime getModTime() {
		return modTime;
	}
	public void setModTime(LocalDateTime modTime) {
		this.modTime = modTime;
	}
	public int getViewCount() {
		return viewCount;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
}