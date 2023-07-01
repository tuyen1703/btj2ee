package vn.viettuts.mvc;

import java.util.Scanner;

public class LoginView {
	public static Scanner sc = new Scanner(System.in);
	//ham hien thi thong diep dang nhap
		public void showMessage(String smg) {
			System.out.println(smg);
		}
		// gd user
		public String getUsername(){
			System.out.print("Nhập username: ");
			String u = sc.next();
			return u;
		}
		public String getPassword(){
			System.out.print("Nhập password:");
			String p = sc.next();
			return p;
		}
		public String getUserInfor(String msg) {
			System.out.print(msg);
			String s = sc.next();
			return s;
		}
}
