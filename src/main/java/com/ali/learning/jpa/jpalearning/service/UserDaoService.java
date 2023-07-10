package com.ali.learning.jpa.jpalearning.service;

import com.ali.learning.jpa.jpalearning.entity.User;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserDaoService {
    @PersistenceContext
    private EntityManager entityManager;


    public Long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }
}
