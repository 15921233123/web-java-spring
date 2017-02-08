/**
 * 
 */
package com.emar.yiqifa.demo.dao;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.emar.yiqifa.demo.dao.entity.Campaign;


/**
 * 
 * 测试、了解缓存机制。
 * @author houyefeng
 *
 */
public class CacheTest {
	@Test
	public void testSelect() throws Exception {
		String config = "mybatis-config.xml";
		String namespace = "com.emar.yiqifa.demo.dao.mapper.TestMapper";
		String method = ".getCampaign";
		InputStream is = Resources.getResourceAsStream(config);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		
		String statement = namespace + method;
		
		Campaign campaign = (Campaign)session.selectOne(namespace + method, 99);
		campaign = (Campaign)session.selectOne(statement, 99);
		
		campaign = (Campaign)session.selectOne(statement, 101);
	}
	
	@Test
	public void testUpdate() throws Exception {
		String config = "mybatis-config.xml";
		String namespace = "com.emar.yiqifa.demo.dao.mapper.TestMapper";
		String method = ".updateCampaign";
		String statement = namespace + method;
		
		InputStream is = Resources.getResourceAsStream(config);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession();
		
		Campaign campaign = new Campaign();
		campaign.setId(99);
		campaign.setCampaignName("yiqifa活动1");
		
		session.update(statement, campaign);
		
		session.commit();
		session.close();
	}
}
