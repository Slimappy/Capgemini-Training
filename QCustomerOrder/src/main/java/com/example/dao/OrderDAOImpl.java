package com.example.dao;

import com.example.entity.Order;
import com.example.util.JPAUtil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class OrderDAOImpl {

    public void updateOrder(Order order){

        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        em.merge(order);
        tx.commit();

        em.close();
    }

    public Order getOrderById(int id){

        EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();

        Order order = em.find(Order.class,id);

        em.close();

        return order;
    }
}
