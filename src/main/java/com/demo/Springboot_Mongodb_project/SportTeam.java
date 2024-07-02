package com.demo.Springboot_Mongodb_project;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="sports")
public class SportTeam 
{
  int id;
  String tname;
  int tmember;
  int tscore;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public int getTmember() {
	return tmember;
}
public void setTmember(int tmember) {
	this.tmember = tmember;
}
public int getTscore() {
	return tscore;
}
public void setTscore(int tscore) {
	this.tscore = tscore;
}

  
}
