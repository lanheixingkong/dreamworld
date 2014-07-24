package com.dream.weixin.model.user;

import java.util.ArrayList;
import java.util.List;

import net.sf.json.JSONObject;

import org.apache.commons.lang.builder.ToStringBuilder;

public class UserList {
	//关注该公众账号的总用户数
	private int total;
	//拉取的OPENID个数，最大值为10000
	private int count;
	//列表数据，OPENID的列表
	private Data data;
	//拉取列表的后一个用户的OPENID
	private String next_openid;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Data getData() {
		return data;
	}
	public void setData(Data data) {
		this.data = data;
	}
	public String getNext_openid() {
		return next_openid;
	}
	public void setNext_openid(String next_openid) {
		this.next_openid = next_openid;
	}
	
	public String toJSON() {
		return JSONObject.fromObject(this).toString();
	}

	public static UserList fromJSON(JSONObject jso) {
		return (UserList) JSONObject.toBean(jso, UserList.class);
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
	
	public static void main(String[] args) {
		UserList userList = new UserList();
		userList.setCount(100);
		userList.setNext_openid("222222");
		userList.setTotal(1211);
		List<String> list = new ArrayList<String>();
		list.add("123123");
		list.add("54546456");
		Data data = new Data();
		data.setOpenid(list);
		userList.setData(data);
		
		userList.toJSON();
		System.out.println(userList.toJSON());
		
	}

}
