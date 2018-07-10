package com.johnsison.document.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="document")
public class Document {

	@Id
	private Long id;
	private String name;
	@Lob
	private byte[] data;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public byte[] getData() {
		return data;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

}
