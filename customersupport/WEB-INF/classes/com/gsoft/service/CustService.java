package com.gsoft.service;

import java.util.List;

import com.gsoft.dao.CustDao;
import com.gsoft.pojo.CustPojo;

public class CustService {
	public List<CustPojo> getCustomers(){
		CustDao dao = new CustDao();
		return dao.getCust();
	}
}
