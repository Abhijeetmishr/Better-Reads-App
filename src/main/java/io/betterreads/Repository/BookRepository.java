package io.betterreads.Repository;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import io.betterreads.entity.Book;
@Repository
public interface BookRepository extends CassandraRepository<Book, String>{
    
}
