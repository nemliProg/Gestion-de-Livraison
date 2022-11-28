package com.glivraison.gestion_livraison.services;

import com.glivraison.gestion_livraison.dao.ManagerDao;
import com.glivraison.gestion_livraison.entities.Manager;
import com.glivraison.gestion_livraison.util.Hash;

public class AddManagerService {


    public Manager execute(Manager manager) throws Exception {

        manager.setPassword(Hash.MD5(manager.getPassword()));
        return new ManagerDao().save(manager);
    }

}
