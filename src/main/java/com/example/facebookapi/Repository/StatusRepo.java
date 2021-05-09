package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.facebookapi.Entity.Status;

public interface StatusRepo extends CassandraRepository<Status, UUID> {

	Status save(Status status);
	ArrayList<Status> findAll();
}
