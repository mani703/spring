package com.bit.spring03.domain;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmpDaoTest {
//	Logger log = Logger.getLogger(getClass());
//	Logger log = LoggerFactory.getLogger(EmpDaoTest.class);
	static EmpDao empDao;
	private int cnt;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ac = new GenericXmlApplicationContext("classpath:/applicationContext.xml");
		empDao = ac.getBean(EmpDao.class);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() throws Exception {
		assertNotNull(empDao);
		assertNotNull(empDao.findAll());
		cnt = empDao.findAll().size();
		assertNotEquals(0, cnt);
		log.debug("size:" + cnt);
	}

}
