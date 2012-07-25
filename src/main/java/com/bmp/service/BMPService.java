package com.bmp.service;

import com.bmp.entities.Bookmark;

public interface BMPService {
	
	public Long saveBookmark(Bookmark bookmark);
	public Bookmark findBookmark(Long pkey);
	public Boolean deleteBookmark(Long pkey);
	
}
