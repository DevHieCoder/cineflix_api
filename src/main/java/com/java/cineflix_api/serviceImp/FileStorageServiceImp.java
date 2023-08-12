package com.java.cineflix_api.serviceImp;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FileStorageServiceImp {
	public void init();
	public boolean saveFile(MultipartFile multipartFile);
	public Resource loadFile(String fileName);
}
