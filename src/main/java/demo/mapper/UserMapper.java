package demo.mapper;

import java.util.List;

import demo.model.User;

public interface UserMapper extends BaseMapper<User> {
	User login(String username, String password);
	
	Long exists(String username);
	
	void deleteBatch(List<Integer> dis);
	
	void addBatch(List<User> userList);

}
