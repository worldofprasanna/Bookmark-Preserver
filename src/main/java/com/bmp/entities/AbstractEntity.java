package com.bmp.entities;

public class AbstractEntity implements IEntity {

	private Long pKey;
	private Boolean deleted;
	@Override
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
