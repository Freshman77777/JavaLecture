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
	Player(String name, int backNumber, String position, String birDate, int height, int isDeleted) {	
	this.name = name;
	this.backNumber = backNumber;
	this.position = position;
	this.birDate = LocalDate.parse(birDate);
	this.height = height;
	this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		return "Player [" + backNumber + ", " + name + ", " + position + ", " + birDate
				+ ", " + height+ ", " + isDeleted + "]";
	}


	public String getName(String name) {
		return name;
	}


	public int getBackNumber(int backNumber) {
		return backNumber;
	}


	public String getPosition(String position) {
		return position;
	}


	public void setBirDate(LocalDate birDate) {
		this.birDate= birDate ;
	}


	public int getHeight(int height) {
		return height;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
}