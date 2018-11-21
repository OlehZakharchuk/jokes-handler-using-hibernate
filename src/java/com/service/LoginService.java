package com.service;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.dao.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author zakhar
 */
@Service
public class LoginService implements LoginServInter{    
    Session session = null;
    @Override
    public boolean checkIfLoged(String name, String pass) {
        session=HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("From Profile where name=:n AND password=:p").setParameter("n", name)
                .setParameter("p", pass);
        Boolean zalogowany=  q.list().isEmpty();
        session.close();
        if(zalogowany)
            return false;
        return true;
    }
}
