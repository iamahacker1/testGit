package entity;

public class SinhVienTuNhen extends SinhVien {
	private Double Toan;
	private Double Ly;
	private Double Hoa;
	
	
	public Double getToan() {
		return Toan;
	}
	public void setToan(Double toan) {
		Toan = toan;
	}
	public Double getLy() {
		return Ly;
	}
	public void setLy(Double ly) {
		Ly = ly;
	}
	public Double getHoa() {
		return Hoa;
	}
	public void setHoa(Double hoa) {
		Hoa = hoa;
	}
	
	public SinhVienTuNhen(String Ten, String Khoa, Double Toan, Double Ly, Double Hoa){
		super();
		this.Toan=Toan;
		this.Ly=Ly;
		this.Hoa=Hoa;
	}
	public void output() {
		System.out.println("{Trường: " + super.getTruong() + ", " +
				"Tên: " + super.getTen() + ", " +
				"Khoa: " + super.getKhoa() + ", " +
				"Toán: " + this.getToan() + ", " +
				"Lý: " + this.getLy() + ", " +
				"Hóa: " + this.getHoa() + "}");
	}
	
	public double DTBTN() {
		return (this.Toan+this.Toan+this.Ly+this.Hoa)/4;
		
	}
	
}
