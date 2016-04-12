package org.devdoc.sf.dao;

import java.util.List;

import org.devdoc.sf.entity.User;

public interface ITestDao {

	public List<User> testQuery() throws Exception;
}
