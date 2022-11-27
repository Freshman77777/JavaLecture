package mysql.SoccerPlayer;

import java.time.LocalDate;
import java.util.Date;

public class Player {
	private String name;
	private int backNumber;
	private String position;
	private LocalDate birDate;
	private int height;
	private int isDeleted;
	
	
	Player() {}
	Player(String name, int backNumber, String position, LocalDate birDate, int height, int isDeleted) {
		super();
		this.name = name;
		this.backNumber = backNumber;
		this.position = position;
		this.birDate = birDate;
		this.height = height;
		this.isDeleted = isDeleted;
		}
	@Override
	public String toString() {
		return "Player [name=" + name + ", backNumber=" + backNumber + ", position=" + position + ", birDate=" + birDate
				+ ", height=" + height + ", isDeleted=" + isDeleted + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBackNumber() {
		return backNumber;
	}
	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public LocalDate getBirDate() {
		return birDate;
	}
	public void setBirDate(LocalDate birDate) {
		this.birDate = birDate;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
}	
	
	
	
	
	
	

	