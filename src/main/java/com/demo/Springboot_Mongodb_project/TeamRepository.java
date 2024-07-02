package com.demo.Springboot_Mongodb_project;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends MongoRepository<SportTeam,Integer> 
{

	List<SportTeam> findByTname(String tname);

	List<SportTeam> findBytscore(int tscore);

}
