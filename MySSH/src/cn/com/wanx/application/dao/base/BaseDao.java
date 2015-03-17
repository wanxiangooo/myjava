package cn.com.wanx.application.dao.base;
import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class BaseDao {
	@Resource
	private SessionFactory sessionFactory;
	protected Session getSession(){
		if(sessionFactory.getCurrentSession()!=null)
			return sessionFactory.getCurrentSession();
		else
			return sessionFactory.openSession();
	}
}
