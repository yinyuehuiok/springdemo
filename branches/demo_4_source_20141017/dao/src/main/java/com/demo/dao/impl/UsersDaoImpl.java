package com.demo.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.dao.UsersDao;
import com.demo.model.UsersModel;

@Repository
public class UsersDaoImpl implements UsersDao {
	
	private static final String TABLE_NAME = "users";
	
	@Autowired
	private SimpleJdbcTemplate jdbc;
	
	private Class<UsersModel> getEntityClass() {
		return UsersModel.class;
	}

	private RowMapper<UsersModel> getEntityRowMapper() {
		return new BeanPropertyRowMapper<UsersModel>(getEntityClass());
	}

	@Override
	public int add(UsersModel users) {
		String sql = "insert into "+TABLE_NAME+"(username,password) values(:username,:password)";
		return jdbc.update(sql, new BeanPropertySqlParameterSource(users));
	}

	@Override
	public int delete(int id) {
		String sql = "delete from "+TABLE_NAME+" where id=?";
		return jdbc.update(sql, id);
	}

	@Override
	public UsersModel find(String username) {
		String sql = "select * from "+TABLE_NAME+" where username=?";
		return DataAccessUtils.singleResult(jdbc.query(sql, getEntityRowMapper(), username));
	}

}
