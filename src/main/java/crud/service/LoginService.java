package crud.service;

import java.util.List;

import crud.bean.LoginBean;
import crud.model.Loginn;

public interface LoginService {
	
	public boolean getLogin(LoginBean loginBean);
	public int registration(Loginn loginn);

}
