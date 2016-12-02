package dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.GenericDao;

@Repository
public abstract class GenericDaoImpl<E extends Serializable,PK extends Serializable> implements GenericDao<E, PK> {
	@Autowired
	protected SessionFactory sessionFactory;
	protected Class<E> entityClass;
	
	public GenericDaoImpl() {
		entityClass=(Class<E>) ((ParameterizedType)(this.getClass()
											 .getGenericSuperclass()))
										.getActualTypeArguments()[0];
	}
	
	public Class<E> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<E> entityClass) {
		this.entityClass = entityClass;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}



	public void insert(E e) {
		sessionFactory.getCurrentSession().save(e);
	}

	public E selectById(PK id) {
		return (E) sessionFactory.getCurrentSession().get(entityClass, id);
	}

}
