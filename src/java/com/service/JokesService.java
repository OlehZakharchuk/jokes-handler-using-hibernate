/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.HibernateUtil;
import com.dao.Joke;
import java.util.Random;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

/**
 *
 * @author zakhar
 */
@Service
public class JokesService implements JokesServiseInter {

    Session session = null;
    Transaction tx = null;

    public Long amountOfJokes() {
        Long amount = Long.valueOf("-1");
        session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        Query q = session.createQuery("select count(j.id) from Joke j");
        if (q.list().isEmpty() == false) {
            amount = (Long) q.list().get(0);
        }
        tx.commit();
        session.close();

        return amount;

    }

    @Override
    public Joke getRandJoke() {
        int amount= Integer.valueOf(String.valueOf(amountOfJokes()));
        Joke randJoke = null;
        Random rand = new Random();
        int numberOfJoke = rand.nextInt(amount )+1;
        if (numberOfJoke > 0) {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            randJoke = (Joke) session.get(Joke.class, numberOfJoke);
            tx.commit();
            session.close();
        }
        return randJoke;
    }

}
