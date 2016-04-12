package org.devdoc.sf.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.devdoc.sf.dao.ITestDao;
import org.devdoc.sf.entity.User;
import org.devdoc.sf.service.ITestService;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements ITestService {

	@Resource
    private ITestDao testDao;

	public List<User> testQuery() throws Exception {
		List<User> users = testDao.testQuery();
        return users;
	}
}
