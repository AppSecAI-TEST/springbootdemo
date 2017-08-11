package com.demo.springbootdemo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.demo.springbootdemo.entity.User;

public interface IUserDao extends CrudRepository<User, Integer> {

	@Query("select t from User t ")
	List<User> getList();
	
	@Query("select t from User t where t.username = :name")
	User findByName(@Param("name") String name);
}
