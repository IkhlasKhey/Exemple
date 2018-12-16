package com.hospital.is.dao.impl;

import java.util.Map;

import com.hospital.is.dao.DAO;

public class DAOImpl<T> implements DAO<T> {

	@Override
	public T create(T t) {
		return null;
	}

	@Override
	public Map<Integer, T> getAll() {
//		return (Map<Integer, T>) StaticDatabase.getGenericMap(t.getClass().getName());
		return null;
	}

	@Override
	public T getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T update(T t, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
