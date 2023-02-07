package main;

import java.util.ArrayList;
import java.util.Scanner;

import entity.SinhVien;
import entity.SinhVienTuNhen;
import entity.SinhVienXaHoi;

public class main {
	public static void main (String arg []) {
		SinhVienTuNhen tn1=new SinhVienTuNhen("Nam", "Khoa Tu Nhien", 9.5, 10.0, 8.5);
		SinhVienTuNhen tn2=new SinhVienTuNhen("Nữ", "Khoa Tu Nhien", 8.5, 9.2, 9.5);
		SinhVienTuNhen tn3=new SinhVienTuNhen("Song", "Khoa Tu Nhien", 2.9, 5.8, 3.0);
		SinhVienXaHoi xh1=new SinhVienXaHoi("Hai", "Khoa Xa Hoi", 9.5, 8.8, 9.3);
		SinhVienXaHoi xh2=new SinhVienXaHoi("Ba", "Khoa Xa Hoi", 7.8, 8.3, 7.8);
		
		
		ArrayList<SinhVien> arrLstSV = new ArrayList<>();
		arrLstSV.add(tn1);
		arrLstSV.add(tn2);
		arrLstSV.add(tn3);
		arrLstSV.add(xh1);
		arrLstSV.add(xh2);
		CountNumberSV(arrLstSV);
		
		
		
		}
	
	public static void CountNumberSV(ArrayList<SinhVien> lst) {
		int demSVTN=0;
		int demSVXH=0;
		for(SinhVien e : lst) {
			
			if(e.getKhoa().equalsIgnoreCase("khoa tu nhien")) {
				demSVTN+=1;
			}else {
				demSVXH++;
			}
		}

		System.out.println("Có "+demSVTN+" sinh viên khoa tự nhiên");
		System.out.println("Có "+demSVXH+" sinh viên khoa xã hội");
		
	}
	
	
}