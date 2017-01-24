package com;

import java.io.Serializable;

//we have to make object eligible for serialization by implementing  Serializable.
//Serializable interface is empty. this type of interfaces are known marker or tag interface.
// 
public class Class33Customer implements Serializable {

	int id;
	String name;

	public Class33Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

	}

}
