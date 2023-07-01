package vn.viettuts.mvc;

public class LoginController {
	private LoginView view;
	private LoginModel model;
	
	public LoginController(LoginView view) {
		super();
		this.view = view;
	}
	
	public boolean checkLogin(LoginModel user) {
		if ((user.getUserName().equals("admin"))
				&& (user.getPassword().equals("admin"))) {
				return true;
				}
				return false;
	}

	public void controlLogin() {
		while (true) {
			String user = view.getUserInfor("Nhập username: ");
			String pass = view.getUserInfor("Nhập password: ");
			this.model = new LoginModel(user, pass);
			if (checkLogin(model)) {
				view.showMessage("LOGIN SUCCESSED");
				break;}
			else {
				view.showMessage("LOGIN FAILED");
			}
		}
	}
}
