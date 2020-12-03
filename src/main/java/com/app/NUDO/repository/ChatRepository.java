package com.app.NUDO.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.NUDO.model.Chat;

@Repository
public interface ChatRepository extends  CrudRepository<Chat, Long>{

}
