package cn.itcast.ssm.service;

import cn.itcast.ssm.po.User;

public interface UserService {
	//根据id查询商品信息
		/**
		 * 
		 * <p>Title: findUserById</p>
		 * <p>Description: </p>
		 * @param id 查询用户的id
		 * @return
		 * @throws Exception
		 */
		public User findUserById(Integer id) throws Exception;
}
