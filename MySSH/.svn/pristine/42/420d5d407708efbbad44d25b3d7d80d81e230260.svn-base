package cn.com.wanx.application.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import cn.com.wanx.application.dao.AuthuserDao;
import cn.com.wanx.application.dao.base.BaseDao;
import cn.com.wanx.application.model.Authuser;

@Repository
public class AuthuserDaoImpl extends BaseDao implements AuthuserDao {

	@SuppressWarnings("unchecked")
	@Override
	public Authuser getByUserName(String userName) {
		Session session = getSession();
		Criteria c = session.createCriteria(Authuser.class);
		c.add(Restrictions.eq("userName", userName));
		List<Authuser> list = new ArrayList<Authuser>();
		try{
			list=c.list();
		}catch(Exception e){
			e.printStackTrace();
		}
		if(list.size()==0){
			return null;
		}
		return list.get(0);
	}
	
}
