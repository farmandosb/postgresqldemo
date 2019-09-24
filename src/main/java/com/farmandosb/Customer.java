package com.farmandosb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer implements Serializable {
private static final long serialVersionUID = -2343243243242432341L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@Column(name = "firstname")
private String firstName;
@Column(name = "lastname")
private String lastName;
//Setters, getters and constructors
public Customer(long id, String firstName, String lastName) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
}
public Customer(long id) {
	super();
	this.id = id;
}
public Customer(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}

}