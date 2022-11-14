package exercise;

public class Q07_Inheritance {

	public static void main(String[] args) {
		ColorTV myTv = new ColorTV(32, 1024);
		myTv.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 1024);
		iptv.printProperty();
	}
}

class TV {
	private int size;
	public TV(int size) {
		this.size = size;
	}
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV {
	private int resolution;
	public ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}
	protected void printProperty() {
		System.out.println(getSize() + "인치 " + resolution + "컬러");
	}
}

class IPTV extends ColorTV {
	private String addr;
	public IPTV(String addr, int size, int resolution) {
		super(size, resolution);
		this.addr = addr;
	}
	@Override
	protected void printProperty() {
		System.out.print("나의 IPTV는 " + addr + " 주소의 ");
		super.printProperty();
	}
}