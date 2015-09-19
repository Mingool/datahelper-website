package edu.hebut.dh.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONUtils {

	/**
	 * form the List<Map<String,Object>> to String and return;
	 * 
	 * @param list
	 * @return
	 */
	public static String makeJson(List<Map<String, Object>> list) {
		if (list == null)
			return null;
		if (!(list.size() > 0))
			return null;
		JSONArray array = new JSONArray();
		for (Map<String, Object> map : list) {
			Set<String> set = map.keySet();
			Iterator it = set.iterator();
			/* make a JSONObject */
			JSONObject object = new JSONObject();
			while (it.hasNext()) {
				String key = (String) it.next();
				Object value = map.get(key);
				try {
					object.put(key, value);
				} catch (JSONException e) {
					e.printStackTrace();
					return null;
				}
			}
			/* add the JSONObject to JSONArray */
			array.put(object);
		}
		return array.toString();
	}
}
