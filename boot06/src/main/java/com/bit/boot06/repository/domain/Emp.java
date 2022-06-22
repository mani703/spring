package com.bit.boot06.repository.domain;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
	
	private int sabun, pay;
	private String ename;
	private Timestamp nalja;

}
