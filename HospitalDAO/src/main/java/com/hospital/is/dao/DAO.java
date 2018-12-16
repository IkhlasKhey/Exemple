package com.hospital.is.dao;

import java.util.Map;

public interface DAO<T> {
	
	T create(T t);

	Map<Integer ,T> getAll();

	T getById(long id);

	T update(T t, Long id);

	boolean delete(long id);
}
