package demo.mapper;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import demo.model.Order;
import demo.model.OrderItem;
import demo.util.MyBatisSessionFactory;

public class OrderMapperTest {
	private SqlSession session = MyBatisSessionFactory.getSession();
	private OrderMapper mapper = session.getMapper(OrderMapper.class);
	private OrderItemMapper oiMapper = session.getMapper(OrderItemMapper.class);
	
	@Test
	public void testSave(){
		Order order = new Order();
		order.setOrderNo("2412341");
		order.setTotal(2343.33);
		mapper.save(order);
		System.out.println(order);
		List<OrderItem> list = new ArrayList<OrderItem>();
		for (int i=0;i<5;i++){
			OrderItem oi = new OrderItem();
			oi.setoId(order.getId());
			oi.setItem("abc" + i);
			oi.setPrice(21312);
			oi.setQuantity(10);
			list.add(oi);
		}
		oiMapper.addBatch(list);
		session.commit();
	}
	
	@Test
	public void testSelectAll(){
		System.out.println(mapper.selectAll());
	}
	
	@Test
	public void testSelectOne(){
		System.out.println(oiMapper.selectOne(8));
	}
}
