package com.testweb.jenrique.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testweb.jenrique.model.People;

public interface IPeopleRepo extends JpaRepository<People, Integer> {
}
