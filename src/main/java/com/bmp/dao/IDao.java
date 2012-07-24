package com.bmp.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;



import com.bmp.entities.IEntity;


public interface IDao<E extends IEntity,K extends Serializable> {
	
	void save(E inEntity) ;

	E update(E inEntity) ;
	
	List<E> findAll(Class<E> inEntityClass, boolean deleted);
    
	<E extends IEntity, obj extends Object> List<E> getEntities(Class<E> inElementClass, String queryName, Map<String, obj> criteria) ;
	
	<E extends IEntity, obj extends Object> List<E> getEntities(Class<E> inElementClass,StringBuffer query, Map<String, obj> parameters);
    
	<E extends IEntity,K extends Serializable> E find(Class<E> inEntityClass, K pkey);
	
	<E extends IEntity, obj extends Object> List<E> getAuditEntities(Class<E> inElementClass, Long pkey);
	
	<E extends IEntity> void purge(E entity);

}
