package cn.superman.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.superman.mapper.UserMapper;
import cn.superman.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> getUserList() {
		return userMapper.getAll();
	}
	@Override
	public boolean searchUser(String userName,String passWord) {
		List<User> ss = userMapper.searchUser(userName, passWord);
		if(ss.size()>0) {
			return true;
		}else {
			return false;
		}
			//return userMapper.check(userMapper.searchUser(userName, passWord));
		
				
	}
}
