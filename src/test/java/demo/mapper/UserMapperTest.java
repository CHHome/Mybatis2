package demo.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import demo.model.User;
import demo.util.MyBatisSessionFactory;

public class UserMapperTest {
	private SqlSession session = MyBatisSessionFactory.getSession();
	private UserMapper mapper = session.getMapper(UserMapper.class);
	
	@Test
	public void testLogin(){
		System.out.println(mapper.login("萧十一", "6"));
	}
	
	@Test
	public void testExists(){
		System.out.println(mapper.exists("张三"));
	}
	
	@Test
	public void testFindByPage(){
		int pageNumber = 2; //页码
		int pageSize = 2;
		User user = new User();
		user.setPassword("2");
		System.out.println(mapper.findByPage((pageNumber-1)*pageSize, pageSize, user));
	}
	
	@Test
	public void testCount(){
		User user = new User();
		//user.setUsername("张三");
		user.setPassword("4");
		System.out.println(mapper.count(user));
	}
	
	@Test
	public void testUpdate(){
		User user = new User();
		user.setId(1);
		//user.setUsername("王七");
		user.setPassword("6");
		mapper.update(user);
		session.commit();
	}
	
	@Test
	public void testUpdate1(){
		User user = new User();
		user.setId(1);
		user.setUsername("萧十一");
		//user.setPassword("6");
		mapper.update(user);
		session.commit();
	}
	
	@Test
	public void testDeleteBatch(){
		List<Integer> list = new ArrayList<Integer>();
		for (int i=7;i<25;i++){
			list.add(i);
		}
		mapper.deleteBatch(list);
		session.commit();
	}
	
	@Test
	public void testAddBatch(){
		List<User> list = new ArrayList<User>();
		for (int i=0;i<5;i++){
			User user = new User();
			user.setPassword("12312");
			user.setUsername("abc" + i);
			list.add(user);
		}
		mapper.addBatch(list);
		session.commit();
	}
	
	@Test
	public void testSave(){
		User user = new User();
		user.setPassword("12312");
		user.setUsername("abccccc");
		mapper.save(user);
		session.commit();
	}
}
