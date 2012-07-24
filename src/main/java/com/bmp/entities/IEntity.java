package com.bmp.entities;

public interface IEntity {

	Long getPKey();
	void setPKey(Long pKey);
	Boolean getDeleted();
	void setDeleted(Boolean deleted);
}
