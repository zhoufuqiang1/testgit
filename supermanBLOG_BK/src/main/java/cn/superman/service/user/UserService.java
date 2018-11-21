package cn.superman.service.user;

import java.util.List;
import cn.superman.model.User;

public interface UserService {
	public List<User> getUserList();
	public boolean searchUser(String userName,String passWord);
}
