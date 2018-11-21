package cn.superman.service.aside;

import java.util.List;

import cn.superman.model.Aside;

public interface AsideService {
	List<Aside> getPage(Integer index,Integer length);
}
