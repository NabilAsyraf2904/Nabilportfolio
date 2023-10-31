package com.nabil.nabilasyraf.controller;

import java.io.IOException;

import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DownloadResume {

	
	@GetMapping("/download")
    public ResponseEntity<FileSystemResource> downloadFile() throws IOException {
        // Replace with the actual path to your file
        String filePath = "NabilCV.pdf";
        FileSystemResource file = new FileSystemResource(filePath);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment; filename=" + file.getFilename());

        return ResponseEntity.ok()
                .headers(headers)
                .contentLength(file.contentLength())
                .body(file);
    }
}
