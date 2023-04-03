package crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import crud.bean.LoginBean;
import crud.dao.LoginExDao;
import crud.model.Loginn;

@Component
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginExDao loginExDao;
	

	public boolean getLogin(LoginBean loginBean ) {
		
		System.out.println("servicr..value......"+loginBean.getName()+"  "+loginBean.getPassword());
		
		return loginExDao.getLogin(loginBean);
	}


	public int registration(Loginn loginn) {
	
		return loginExDao.registration( loginn);
	}

	
}
