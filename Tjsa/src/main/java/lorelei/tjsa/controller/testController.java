package lorelei.tjsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lorelei.tjsa.model.lori_course;
import lorelei.tjsa.service.lori_courseMapper;
import lorelei.tjsa.service.impl.lori_courseMapperIm;

@Controller
@RequestMapping("/user")
public class testController {

	public static void main(String args[])
	{
		lori_courseMapperIm lcm = new lori_courseMapperIm();
		lori_course crs = lcm.selectByPrimaryKey(90001);
		System.out.println(crs.getCname());
	}
}
