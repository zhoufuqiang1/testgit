package cn.superman.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.superman.model.Aside;
import cn.superman.service.aside.AsideService;

@RestController
@RequestMapping("/aside")
public class AsideController {
	
	@Autowired
	private AsideService asideService;
	
	@RequestMapping(value="/page",method = RequestMethod.POST)
	public List<Aside> getPage(Integer index,Integer length){
		return asideService.getPage(index, length);
	}
}
