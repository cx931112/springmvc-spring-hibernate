package service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dao.UserDao;

import entity.User;
import exception.DuplicateUsernameException;
import service.UserService;

@Service
@Transactional(propagation=Propagation.REQUIRED,rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void regist(User user) throws DuplicateUsernameException {
		User u=userDao.selectByUsername(user.getUsername());
		if(u!=null){
			throw new DuplicateUsernameException("用户名已存在");
		}
		userDao.insert(user);
	}

	@Transactional(readOnly=true)
	public User findById(Integer id) {
		return userDao.selectById(id);
	}

}
