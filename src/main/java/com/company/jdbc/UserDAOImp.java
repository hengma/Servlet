package com.company.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.company.model.User;

public class UserDAOImp extends AbstractDAO implements UserDAO {

	public UserDAOImp() {
		
	}
	@Override
	public List<User> loaduser() throws SQLException {
		List<User> userList = new ArrayList<User>();
		String userReq = "SELECT id, name FROM user";
		getConnection();
		ResultSet rs = executeSelect(userReq);
		while(rs.next()) {
			User user = new User();
			user.setId(rs.getString("id"));
			user.setName(rs.getString("name"));
			userList.add(user);
		}
		return userList;
	}

}
