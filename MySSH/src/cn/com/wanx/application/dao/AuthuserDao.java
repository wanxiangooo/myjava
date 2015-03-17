package cn.com.wanx.application.dao;

import cn.com.wanx.application.model.Authuser;

public interface AuthuserDao {
	public Authuser getByUserName(String userName);
}
