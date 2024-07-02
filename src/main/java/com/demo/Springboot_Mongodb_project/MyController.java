package com.demo.Springboot_Mongodb_project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController
{
	
 @Autowired
 TeamRepository srepo;
 @RequestMapping("/test")
 public String test()
 {
	 return "Test is completed";
 }
 @RequestMapping("/save")
 public String savaData(@RequestBody SportTeam s)
 {
	 srepo.save(s);
	 return "Data is saved";
 }
 @RequestMapping("/all")
 public List<SportTeam> allData()
 {
	return srepo.findAll();
 }
 @RequestMapping("/{id}")
 public Optional<SportTeam> byId(@PathVariable int id)
 {
	 return srepo.findById(id);
 }
 @RequestMapping("upd/{id}")
 public String update(@RequestBody SportTeam sp,@PathVariable int id)
 {
	 SportTeam s=srepo.findById(id).get();
	 s.setTname(sp.getTname());
	 s.setTmember(sp.getTmember());
	 s.setTscore(sp.getTscore());
	 srepo.save(s);
	 return "Data is update";
 }
 @RequestMapping("del/{id}")
 public String delete(@PathVariable int id)
 {
	 SportTeam s=srepo.findById(id).get();
	 srepo.deleteById(id);
	 return "Data is deleted";
 }
 @RequestMapping("/tname/{tname}")
 public List<SportTeam> byTname(@PathVariable String tname)
 {
	 return srepo.findByTname(tname);
 }
 
}
