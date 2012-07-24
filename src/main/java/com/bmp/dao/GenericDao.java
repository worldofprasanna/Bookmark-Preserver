package com.bmp.dao;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.bmp.entities.IEntity;


public class GenericDao <E extends IEntity, K extends Serializable>
implements IDao<E, K>  {

	private EntityManager entityManager;
	
	@Override
	public void save(E inEntity) {
		// TODO Auto-generated method stub
		if (inEntity.getDeleted() == null){
			inEntity.setDeleted(false);
		}
		entityManager.persist(inEntity);
	}

	@Override
	public IEntity update(IEntity inEntity) {
		// TODO Auto-generated method stub
		if (inEntity.getDeleted() == null){
			inEntity.setDeleted(false);
		}
		entityManager.merge(inEntity);
		return null;
	}

	@Override
	public List findAll(Class inEntityClass, boolean deleted) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getEntities(Class inElementClass, String queryName, Map criteria) {
		// TODO Auto-generated method stub
		Query qry = entityManager.createNamedQuery(queryName);
		Set<Entry<String, Object>> keys = criteria.entrySet();
		Iterator<Entry<String, Object>> iterator = keys.iterator();
		while (iterator.hasNext()){
			Entry<String, Object> entry = iterator.next();
			qry.setParameter(entry.getKey(), entry.getValue());
		}
		Object result ;
		result = qry.getResultList();
		return (List<E>)result;
	}

	@Override
	public List getEntities(Class inElementClass, StringBuffer query,
			Map parameters) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IEntity find(Class inEntityClass, Serializable pkey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getAuditEntities(Class inElementClass, Long pkey) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void purge(IEntity entity) {
		// TODO Auto-generated method stub
		
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}
	
}
