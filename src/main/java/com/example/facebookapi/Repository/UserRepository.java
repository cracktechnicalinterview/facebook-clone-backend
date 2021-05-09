package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.facebookapi.Entity.User;

public interface UserRepository extends CassandraRepository<User, String> {

	User save(User user);
	ArrayList<User> findAll();
	User findAllByuserID(String userID);
	
}
