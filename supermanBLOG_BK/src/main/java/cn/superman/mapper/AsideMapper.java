package cn.superman.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.superman.model.Aside;

public interface AsideMapper {
	@Select("select * from Aside limit #{index},#{length}")
	List<Aside> getPage(@Param("index")Integer index,@Param("length")Integer length);
}
