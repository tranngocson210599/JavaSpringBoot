package com.springboot.Javaspringboot.model;

import java.util.UUID;

public class Person {
 private  UUID id;
 private  String name;
 public Person(UUID id,String name)
 {
	 this.name=name;
	 this.id=id;
 }
public UUID getId() {
	return id;
}
public String getName() {
	return name;
}
}
