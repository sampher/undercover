package com.family.zone.core;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:resource/APPLICATION-CONFIG.xml" })
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback = true)
public abstract class SpringTestBase extends
		AbstractTransactionalJUnit4SpringContextTests {

	@BeforeClass
	public static void init() {
	}

}
