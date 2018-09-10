package com.talk2amareswaran.projects.springboot2authserver.entity;

import javax.persistence.Entity;

@Entity
public class Permission extends BaseIdEntity {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
