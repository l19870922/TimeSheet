package com.mercury.timesheet.daos.impl;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.mercury.timesheet.beans.User;
import com.mercury.timesheet.daos.UserDao;

public class UserDaoImpl implements UserDao {
	private HibernateTemplate template;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		template = new HibernateTemplate(sessionFactory);
	}
	@Override
	public void save(User user) {
		template.save(user);
	}

	@Override
	public User get(String empno) {
		return template.get(User.class, empno);
	}
	
	@Override
	public User getByUsername(String username) {
		DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		dc.add(Restrictions.eq("username", username));
		return (User)template.findByCriteria(dc).get(0);
	}

	@Override
	public void update(User user) {
		template.update(user);
	}

	@Override
	public void delete(User user) {
		template.delete(user);
	}
	
}
