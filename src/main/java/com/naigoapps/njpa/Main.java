/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naigoapps.njpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Lorenzo
 */
public class Main {
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("NJPA_PU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(new AbstractEntity());
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
