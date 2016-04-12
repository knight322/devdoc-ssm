package org.devdoc.sf.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.devdoc.sf.entity.User;
import org.devdoc.sf.service.ITestService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Scope("prototype")
@RequestMapping("/testController")
public class TestController {

	public static final Logger LOGGER = Logger.getLogger(TestController.class);

	@Resource
	private ITestService testService;

	@RequestMapping("/test")
	public String test(HttpServletRequest request, Model model) {
		try {
			List<User> users = testService.testQuery();
			model.addAttribute("users",users);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "showUser";
	}
}
