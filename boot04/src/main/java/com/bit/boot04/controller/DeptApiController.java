package com.bit.boot04.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.boot04.mapper.domain.Dept;
import com.bit.boot04.service.RestServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class DeptApiController {

	@Autowired
	RestServiceImpl restService;
	
	@GetMapping("/dept")
	public ResponseEntity<?> getList() {
		return ResponseEntity.ok(restService.selectAll());
	}
	
	@GetMapping("/dept/{deptno}")
	public ResponseEntity<?> getDept(@PathVariable int deptno) {
		return ResponseEntity.ok(restService.selectOne(deptno));
	}
	
	@PostMapping("/dept")
	public ResponseEntity<?> addDept(@RequestBody Dept dept) {
		Map<String, Object> map = new LinkedHashMap<>();
		if(restService.insertOne(dept) > 0 ) {
			map.put("result", true);
			return ResponseEntity.ok(map);
		}
		map.put("result", false);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
	}
	
	@PutMapping("/dept/{deptno}")
	public ResponseEntity<?> editDept(@PathVariable int deptno, @RequestBody Dept bean){
		Map<String, Object> map = new LinkedHashMap<>();
		if(restService.updateOne(bean) > 0) {
			map.put("result", true);
			map.put("dept", bean);
			return ResponseEntity.status(HttpStatus.OK).body(map);
		}
		map.put("result", false);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(map);
	}
	
	@DeleteMapping("/dept/{deptno}")
	public ResponseEntity<?> deleteDept(@PathVariable int deptno){
		return ResponseEntity.status(
				restService.deleteOne(deptno) > 0 ? HttpStatus.OK : HttpStatus.BAD_REQUEST
				).build();
	}

}
