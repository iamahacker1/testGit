package entity;

public abstract class SinhVien {
	public static String Truong = "JavaBasic";
	private String Ten;
	private String Khoa;
	private Double DTB;
	public static String getTruong() {
		return Truong;
	}
	public static void setTruong(String truong) {
		Truong = truong;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getKhoa() {
		return Khoa;
	}
	public void setKhoa(String khoa) {
		Khoa = khoa;
	}
	public Double getDTB() {
		return DTB;
	}
	public void setDTB(Double dTB) {
		DTB = dTB;
	}
	public void outputParent() {
		System.out.println("{ Truong : "+ Truong + ", "+
						    " Ten : "+ this.getTen() + ", "+
						    " Khoa : "+ this.getKhoa() + ", "+
						    " DTB : "+ this.getDTB() +"}"
				);
	}
	
	public void output() {
	}
	
	
	
	
	
}
