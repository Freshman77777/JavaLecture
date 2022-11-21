package mysql.erd;

import java.time.LocalDateTime;

public class Reply {
	private int rid;
	private String rcontent;
	private LocalDateTime regTime;
	private int isMine;
	private String uid;
	private int bid;
	
	Reply() {}
	Reply(String rcontent, String uid, int bid) {
		this.rcontent = rcontent;
		this.uid = uid;
		this.bid = bid;
	}
	Reply(int rid, String rcontent, LocalDateTime regTime, int isMine, String uid, int bid) {
		this.rid = rid;
		this.rcontent = rcontent;
		this.regTime = regTime;
		this.isMine = isMine;
		this.uid = uid;
		this.bid = bid;
	}
	@Override
	public String toString() {
		return "Reply [" + rid + ", " + rcontent + ", " + regTime + ", " + isMine + ", "
				+ uid + ", " + bid + "]";
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public LocalDateTime getRegTime() {
		return regTime;
	}
	public void setRegTime(LocalDateTime regTime) {
		this.regTime = regTime;
	}
	public int getIsMine() {
		return isMine;
	}
	public void setIsMine(int isMine) {
		this.isMine = isMine;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
}
