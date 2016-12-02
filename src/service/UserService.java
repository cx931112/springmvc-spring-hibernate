package service;

import entity.User;
import exception.DuplicateUsernameException;

public interface UserService {
	public void regist(User user)throws DuplicateUsernameException;
	public User findById(Integer id);
}
