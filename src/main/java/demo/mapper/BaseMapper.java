package demo.mapper;

import java.util.List;

public interface BaseMapper<T> {
	/**
	 * 根据主键查询记录
	 * @param id 主键ID
	 * @return 查询的记录并封装到一个对象里
	 */
	T findById(int id);
	/**
	 * 查询所有记录
	 * @return 所有记录的列表对象
	 */
	List<T> find();
	/**
	 * 分页查询
	 * @param pageIndex 查询的起始索引位置
	 * @param pageSize 查询的记录的数量
	 * @return 查询的记录列表对象
	 */
	List<T> findByPage(int pageIndex, int pageSize, T t);
	/**
	 * 保存一个对象
	 * @param t 保存的对象
	 */
	void save(T t);
	/**
	 * 根据主键进行删除
	 * @param id 删除的主键
	 */
	void delete(int id);
	/**
	 * 更新一个对象
	 * @param t 更新的对象
	 */
	void update(T t);
	/**
	 * 统计当前的表的记录数量
	 * @return 记录数量
	 */
	Long count(T t);
}
