package demo.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisSessionFactory {
	
	private static String path = "configuration.xml";
	private static SqlSessionFactory factory = null;
	
	static {
		try {
			Reader reader = Resources.getResourceAsReader(path);
			factory = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSession getSession(){
		if(factory != null){
			return factory.openSession();			
		} else {
			return null;
		}
	}
}
