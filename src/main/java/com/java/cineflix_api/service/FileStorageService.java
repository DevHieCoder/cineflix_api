package com.java.cineflix_api.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.java.cineflix_api.serviceImp.FileStorageServiceImp;

@Service
public class FileStorageService implements FileStorageServiceImp{

	private final Path root = Paths.get("uploads");
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		if (!Files.exists(root)) {
			try {
				Files.createDirectories(root);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public boolean saveFile(MultipartFile multipartFile) {
		// TODO Auto-generated method stub
		try {
			Files.copy(multipartFile.getInputStream(), this.root.resolve(multipartFile.getOriginalFilename()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Resource loadFile(String fileName) {
		// TODO Auto-generated method stub
		try {
			Path path = this.root.resolve(fileName);
			Resource resource = new UrlResource(path.toUri());
			if (resource.exists() || resource.isReadable()) {
				
				return resource;
			} else {
				throw new RuntimeException("Can't found file");
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Can't found file");
		}
	}
	
}
