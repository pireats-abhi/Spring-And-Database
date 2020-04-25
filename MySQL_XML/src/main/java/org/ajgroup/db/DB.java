package org.ajgroup.db;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

@Component
public class DB {
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
}
