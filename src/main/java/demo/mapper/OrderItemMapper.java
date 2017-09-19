package demo.mapper;

import java.util.List;

import demo.model.OrderItem;

public interface OrderItemMapper extends BaseMapper<OrderItem> {
	
	void addBatch(List<OrderItem> orderItemList);
	
	OrderItem selectOne(int id);
}
