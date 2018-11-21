package cn.superman.service.aside;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.superman.mapper.AsideMapper;
import cn.superman.model.Aside;
@Service
public class AsideServiceImpl implements AsideService{
	@Autowired
	private AsideMapper asideMapper;
	@Override
	public List<Aside> getPage(Integer index, Integer length) {
		return asideMapper.getPage(index,length);
	}

}
