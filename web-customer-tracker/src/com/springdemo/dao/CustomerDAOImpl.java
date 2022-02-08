package com.springdemo.dao;

import com.springdemo.entity.Customer;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

    //    need to inject session factory
    @Autowired
    private SessionFactory sessionFactory;


    @Override
    @Transactional
    public List<Customer> getCustomer() {

//    get current hibernate session
        Session session = sessionFactory.getCurrentSession();

//    creat query
        Query <Customer> query = session.createQuery("FROM Customer order by lastName", Customer.class);


//    execute query and get result list
        List<Customer> customers = query.getResultList();

        return customers;
    }

    @Override
    public void saveCustomer(Customer customer) {

//get current hibernate session
        Session session = sessionFactory.getCurrentSession();
//        save/update customer
        session.saveOrUpdate(customer);
    }

    @Override
    public Customer getCustomer(int id) {

        Session session = sessionFactory.getCurrentSession();

//        read from database using primary key
Customer customer = session.get(Customer.class, id);
return customer;

    }

    @Override
    public void deleteCustomer(int id) {
        Session session = sessionFactory.getCurrentSession();
//        delete obj with primary key

        Query query = session.createQuery("DELETE FROM Customer WHERE id=:customerId");
        query.setParameter("customerId", id);
        query.executeUpdate();
    }
}
