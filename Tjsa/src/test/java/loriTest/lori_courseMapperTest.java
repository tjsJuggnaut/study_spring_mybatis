package loriTest;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import lorelei.tjsa.service.lori_courseMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml", "classpath:spring-mybatis.xml" })
@Transactional()

public class lori_courseMapperTest {

	private static final Logger LOGGER = Logger.getLogger(lori_courseMapper.class);

	@Autowired
	private lori_courseMapper lcm;

	@Test
	public void testdeleteByPrimaryKey() {
		
		int courseno = 90001;
		lcm.selectByPrimaryKey(courseno);
	}

}
