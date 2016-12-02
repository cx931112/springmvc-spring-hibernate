package dao;

import java.io.Serializable;

public interface GenericDao<E extends Serializable,PK extends Serializable>  {
	public void insert(E e);
	
	public E selectById(PK id);
}
