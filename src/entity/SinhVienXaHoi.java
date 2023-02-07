package entity;

public class SinhVienXaHoi extends SinhVien {
	private Double Van;
	private Double Su;
	private Double Dia;
	
	public Double getVan() {
		return Van;
	}
	public void setVan(Double van) {
		Van = van;
	}
	public Double getSu() {
		return Su;
	}
	public void setSu(Double su) {
		Su = su;
	}
	public Double getDia() {
		return Dia;
	}
	public void setDia(Double dia) {
		Dia = dia;
	}
	public SinhVienXaHoi(String Ten, String Khoa, Double van, Double su, Double dia) {
		super();
		Van = van;
		Su = su;
		Dia = dia;
	}
	
	public void output() {
		System.out.println("{Trường: " + super.getTruong() + ", " +
				"Tên: " + super.getTen() + ", " +
				"Khoa: " + super.getKhoa() + ", " +
				"Văn: " + this.getVan() + ", " +
				"Sử: " + this.getSu() + ", " +
				"Địa: " + this.getDia() + ", " +
				"Điểm trung bình: "+ this.DTBXH()+"}");
	}
	
	public void timsv(String tensv) {
		if(tensv==this.getTen()) {
			System.out.println("Sinh viên cần tìm là: "+this.getTen());
		}
	}
	public double DTBXH() {
		return (this.Dia+this.Su+this.Van)/3;
	}
	
}
