package cn.com.wanx.application.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.com.wanx.application.dao.AuthuserDao;
import cn.com.wanx.application.model.Authuser;
import cn.com.wanx.application.service.AuthuserService;

@Service
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class AuthuserServiceImpl implements AuthuserService {
	@Resource
	private AuthuserDao authuserDao;
	
	@Override
	public Authuser getByUserName(String userName) {
		return authuserDao.getByUserName(userName);
	}

}
