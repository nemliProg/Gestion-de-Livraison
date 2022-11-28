package com.glivraison.gestion_livraison.services;

import com.glivraison.gestion_livraison.dao.ManagerDao;
import com.glivraison.gestion_livraison.entities.Manager;

import java.util.List;

public class ManagerListService {


    public List<Manager> execute() {
        return new ManagerDao().findAll();
    }

}
