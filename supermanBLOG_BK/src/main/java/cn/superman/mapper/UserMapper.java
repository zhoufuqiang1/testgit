package cn.superman.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import cn.superman.model.User;

public interface UserMapper {
	@Select("SELECT * FROM User")
    @Results({
        @Result(property = "id",  column = "id"),
        @Result(property = "name", column = "name")
    })
    List<User> getAll();
	
	//@Select("select *,count(*) as count from message WHERE toid = #{userId} GROUP BY formid ORDER BY created_date desc limit #{offset}, #{limit}")
   // List<Message> selectConversationList(@Param("userId") String userId, @Param("offset") int offset, @Param("limit") int limit);
	
	
	@Select("SELECT * FROM User WHERE ID =#{userName} AND name = #{passWord}")
    @Results({
        @Result(property = "id",  column = "id"),
        @Result(property = "name", column = "name")
    })
    List<User> searchUser(@Param("userName") String userName,@Param("passWord") String passWord);
/*	default  boolean check(List<User> users) {
		if(users.size()>0) {
			return true;
		}
		return false;
	}*/
}
