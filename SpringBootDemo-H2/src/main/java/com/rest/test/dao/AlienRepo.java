package com.rest.test.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.test.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> 
{

}
