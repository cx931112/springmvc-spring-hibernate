package dao.impl;

import org.springframework.stereotype.Repository;

import dao.UserDao;

import entity.User;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {

	public User selectByUsername(String username) {
		String hql=new StringBuffer()
			.append("from entity.User u ")
			.append("where u.username=? ")
			.toString();
		return (User) sessionFactory.getCurrentSession()
								    .createQuery(hql)
								    .setString(0, username)
								    .uniqueResult();
	}

}
