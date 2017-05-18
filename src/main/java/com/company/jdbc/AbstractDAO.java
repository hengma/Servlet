package com.company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AbstractDAO {

	protected Connection con = null;
	protected Statement st = null;

	/**
	 * constructor.
	 **/
	public AbstractDAO() {
		super();
	}

	protected void getConnection() throws SQLException {
		if (con == null || con.isClosed()) {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Error: " + e.getMessage());
			}
			con = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/test",
							"root", "root");
		}
		st = getStatement();
	}

	private Statement getStatement() throws SQLException {
		try {
			if (con == null) {
				String msg = "AbstractDAO.getStatement() : con == null";
				throw new SQLException(msg);
			}
			return con.createStatement();
		} catch (SQLException sqlEx) {
			throw sqlEx;
		}
	}

	protected ResultSet executeSelect(String request) throws SQLException {
        ResultSet rs = null;

        try {
            rs = st.executeQuery(request);
        } catch (SQLException sqlE) {
            System.out.println("Error: " + sqlE.getMessage());
            throw sqlE;
        }
        return rs;
    }
}
