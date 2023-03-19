package io.betterreads.Repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import io.betterreads.entity.UserBooks;
import io.betterreads.entity.UserBooksPrimaryKey;

public interface UserBooksRepository extends CassandraRepository<UserBooks, UserBooksPrimaryKey>{
    
}
