package vn.viettuts.mvc;

public class LoginApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginView view = new LoginView();
		LoginController control = new LoginController(view);
		// goi ham login
		control.controlLogin();
	}
}
