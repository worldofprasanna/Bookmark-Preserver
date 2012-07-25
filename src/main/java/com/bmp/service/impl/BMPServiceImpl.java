package com.bmp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.bmp.dao.IDao;
import com.bmp.entities.Bookmark;
import com.bmp.entities.IEntity;
import com.bmp.service.BMPService;

public class BMPServiceImpl implements BMPService {

	@Autowired
	private IDao<IEntity, Long> daoService;
	@Override
	@Transactional
	public Long saveBookmark(Bookmark bookmark) {
		// TODO Auto-generated method stub
		daoService.save(bookmark);
		return bookmark.getPKey();
	}

	@Override
	public Bookmark findBookmark(Long pkey) {
		// TODO Auto-generated method stub
		return daoService.find(Bookmark.class, pkey);		
	}

	@Override
	public Boolean deleteBookmark(Long pkey) {
		// TODO Auto-generated method stub
		Bookmark bookmark = this.findBookmark(pkey);
		daoService.purge(bookmark);
		return true;
	}

	public void setDaoService(IDao<IEntity, Long> daoService) {
		this.daoService = daoService;
	}

	public IDao<IEntity, Long> getDaoService() {
		return daoService;
	}

}
