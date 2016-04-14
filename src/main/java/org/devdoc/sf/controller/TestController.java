package org.devdoc.sf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.devdoc.sf.entity.User;
import org.devdoc.sf.service.ITestService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope("prototype")
@RequestMapping("/testController")
public class TestController {

	public static final Logger LOGGER = Logger.getLogger(TestController.class);

	@Resource
	private ITestService testService;

	@RequestMapping("/test")
	public ModelAndView test() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");
		try {
			List<User> users = testService.testQuery();
			mv.addObject("users", users);
		} catch (Exception e) {
			e.printStackTrace();
		}
        return mv;
	}
}
