package com.glivraison.gestion_livraison;

import com.glivraison.gestion_livraison.entities.CategorieVehicle;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class main {

        public static void main(String[] args) {

            EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion_livraison");
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
//            CategorieVehicle categorieVehicle = new CategorieVehicle();
//            categorieVehicle.setType("Camion");
//            em.persist(categorieVehicle);
//            em.getTransaction().commit();
//            em.close();
//            emf.close();
        }
}
