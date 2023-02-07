package main;

import java.util.ArrayList;
import java.util.Scanner;

import entity.SinhVien;
import entity.SinhVienTuNhen;
import entity.SinhVienXaHoi;

public class main1 {
	public static void main (String arg []) {
		SinhVienTuNhen tn1=new SinhVienTuNhen("Nam", "Khoa Tu Nhien", 9.5, 10.0, 8.5);
		SinhVienTuNhen tn2=new SinhVienTuNhen("Nữ", "Khoa Tu Nhien", 8.5, 9.2, 9.5);
		SinhVienTuNhen tn3=new SinhVienTuNhen("Song", "Khoa Tu Nhien", 2.9, 5.8, 3.0);
		SinhVienXaHoi xh1=new SinhVienXaHoi("Hai", "Khoa Xa Hoi", 9.5, 8.8, 9.3);
		SinhVienXaHoi xh2=new SinhVienXaHoi("Ba", "Khoa Xa Hoi", 7.8, 8.3, 7.8);
		//System.out.println(">> Truong "+ SinhVien.Truong);
		//System.out.println(">> Ten "+ svtn2.getTen());
		
		//Cách 1 khai báo mảng
		//SinhVienTuNhen arr[]= new SinhVienTuNhen[2];
		//arr[0]=svtn1;
		//arr[1]=svtn2;
		
		//Cách 2 khai báo mảng
		//SinhVienTuNhen[] arr2 = {svtn1, svtn2};
		
		ArrayList<SinhVien> arrLstSV = new ArrayList<>();
		arrLstSV.add(tn1);
		arrLstSV.add(tn2);
		arrLstSV.add(tn3);
		arrLstSV.add(xh1);
		arrLstSV.add(xh2);
		
		ArrayList<SinhVienTuNhen> arrLstSVKTN = new ArrayList<>();
		arrLstSVKTN.add(tn1);
		arrLstSVKTN.add(tn2);
		arrLstSVKTN.add(tn3);
		System.out.println("Số sinh viên khoa tự nhiên là: "+ arrLstSVKTN.size());
		
//		for(SinhVienTuNhen e : arrLstSVKTN) {
//			e.output();
//		}
		
		//arrLstSVKTN.forEach(e -> {
		//	e.output();
		//});
		
		
		//////Bài tập1/////
		
		ArrayList<SinhVienXaHoi> arrLstSVKXH = new ArrayList<>();
		arrLstSVKXH.add(xh1);
		arrLstSVKXH.add(xh2);
		System.out.println("Số sinh viên khoa xã hội là: "+ arrLstSVKXH.size());
		
		
		//////Bài tập2/////
		arrLstSVKTN.forEach(e -> {
			if(e.DTBTN()>=5.) {
				System.out.println("Sinh viên "+e.getTen()+"có điểm: "+e.DTBTN()+" và trên trung bình");
			}else{
				System.out.println("Sinh viên "+e.getTen()+"có điểm: "+e.DTBTN()+" và dưới trung bình");
			}
		});
		
		
		
		//////Bài tập3/////
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhập tên sinh viên cần tìm: ");
		String timten=sc.nextLine();
		sc.close();
		arrLstSVKXH.forEach(e ->{
			if(timten.equalsIgnoreCase(e.getTen()) ){
				e.output();
			}
		});
		
		
		}
}