package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Person;

@Repository
public interface PersonDao extends JpaRepository<Person,Integer>{



}
