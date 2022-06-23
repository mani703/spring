package com.bit.boot07.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bit.boot07.domain.Emp;
import com.bit.boot07.service.EmpServiceImpl;

@CrossOrigin
@RestController
public class MainController {
	
	@Autowired
	EmpServiceImpl empService;

	@GetMapping("/")
	public String index() {
		return "API Service는 담당자에게서 문의";
	}
	
	@GetMapping("/api/emp")
	public ResponseEntity<?> list() {
		return ResponseEntity.ok(empService.getList());
	}
	
	@PostMapping("/api/emp")
	public ResponseEntity<?> add(@RequestBody Emp bean) {
		return ResponseEntity.ok(bean);
	}
}
