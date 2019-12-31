package com.example.dao;

import com.example.model.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageDao extends CrudRepository<Message, Integer> {
    List<Message> findAll();

    void deleteById(int id);

    Message save(Message message);
}
