package dao;

import java.util.Date;
import java.util.List;

import entities.Salle;

public interface IDao<T> {

	boolean create(T o);
	
	List<T> selectbet(Date a ,Date b);
	
	List<T> selectmachinebysalle(Salle o);

	boolean delete(T o);

	boolean update(T o);

	T findById(int id);

	List<T> findAll();
}
