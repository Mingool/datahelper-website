package edu.hebut.dh.dao.impl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.ResultSetHandler;


public class ListMapHandler implements ResultSetHandler<List<Map<String,Object>>> {

	public List<Map<String,Object>> handle(ResultSet rs) {
		// TODO Auto-generated method stub
		List<Map<String,Object>> list = null;
		
		try {
			list = getResultMap(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * 返回结果集的List<Map>类型,如果没结果返回null
	 * @param rs
	 * @return List
	 * @throws SQLException 
	 */
	private List<Map<String, Object>> getResultMap(ResultSet rs) throws SQLException{
		ArrayList<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
        ResultSetMetaData rsmd = rs.getMetaData();
        while(rs.next()){
        	Map<String, Object> hm = new HashMap<String, Object>();
        	for (int i=1; i<=rsmd.getColumnCount(); i++) {
                String key = rsmd.getColumnLabel(i);
                Object value = rs.getObject(i);
                hm.put(key, value);
            } 
        	list.add(hm);
        }
        if(list.size()>0){
        	return list;
        }else{
        	return null;
        }
	}
}
