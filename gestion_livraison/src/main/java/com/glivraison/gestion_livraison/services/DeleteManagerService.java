package com.glivraison.gestion_livraison.services;

import com.glivraison.gestion_livraison.dao.ManagerDao;
import com.glivraison.gestion_livraison.entities.Manager;
import com.glivraison.gestion_livraison.util.Hash;

public class DeleteManagerService {


    public Manager execute(Long id) throws Exception {

        return new ManagerDao().delete(id);
    }

}
