package crud.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import crud.bean.LoginBean;
import crud.model.Loginn;
import crud.model.Product;


@Component
public class LoginExDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	private static final String Product = null;
	
	@Autowired
   private	SessionFactory sessionFactory;
	
	Loginn loginn=new Loginn();
   
	public boolean getLogin(LoginBean loginBean) {
		boolean loginStatus=false;
		System.out.println("DAO,,,,,,,,,,,,value.."+loginBean.getName()+""+loginBean.getPassword());
		
		Session session=sessionFactory.openSession();
		
		 String sql1 = "from Loginn s where s.name=?0 and s.password=?1";
         Query<Loginn> query = session.createQuery(sql1);
         query.setParameter(0,loginBean.getName());
         query.setParameter(1,loginBean.getPassword());
		
		List userList=query.list();
		
		if((userList!=null)&&(userList.size()>0)){
			
			loginStatus=true;
			System.out.println("!!!!!!!!!!!!valid user!!!!!!!");	
		}
		else {
			System.out.println("!!!!!!!!not valid user!!!!!!!!");
		}
		return loginStatus;
	}
	
    @Transactional
	public int registration(Loginn loginn2) {
		
	return (Integer) this.hibernateTemplate.save(loginn2);
	}
	
	
	

}
