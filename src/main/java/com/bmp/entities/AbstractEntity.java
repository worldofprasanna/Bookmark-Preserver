package com.bmp.entities;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntity implements IEntity {

	
	private Long pKey;
	private Boolean deleted;
	
	@Override
	@Id
	@GeneratedValue
	@Column(name="pkey")	
	public Long getPKey() {
		// TODO Auto-generated method stub
		return this.pKey;
	}

	@Override
	public void setPKey(Long pKey) {
		// TODO Auto-generated method stub
		this.pKey = pKey;
	}

	@Override
	@Column(name="deleted")
	public Boolean getDeleted() {
		// TODO Auto-generated method stub
		return this.deleted;
	}

	@Override
	public void setDeleted(Boolean deleted) {
		// TODO Auto-generated method stub
		this.deleted = deleted;
	}

}
