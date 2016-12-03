package com.gsoft.dao;

import java.util.List;

import hibernate.HibernateUtil;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gsoft.pojo.CustPojo;

public class CustDao {
	public List<CustPojo> getCust(){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Query query = session.createQuery("FROM com.gsoft.pojo.CustPojo cust WHERE cust.id=1");
		List<CustPojo> list = query.list();
		tx.commit();
		session.close();
		return list;
	}
}
