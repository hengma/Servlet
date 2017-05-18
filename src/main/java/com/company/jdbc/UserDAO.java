package com.company.jdbc;

import java.sql.SQLException;
import java.util.List;

import com.company.model.User;

public interface UserDAO {
	public List<User> loaduser() throws SQLException;
}
