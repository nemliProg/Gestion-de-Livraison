package com.glivraison.gestion_livraison.services;

import com.glivraison.gestion_livraison.dao.AdminDao;
import com.glivraison.gestion_livraison.dao.DeliveryResponsibleDao;
import com.glivraison.gestion_livraison.dao.DriverDao;
import com.glivraison.gestion_livraison.dao.ManagerDao;
import com.glivraison.gestion_livraison.entities.Admin;
import com.glivraison.gestion_livraison.entities.DeliveryResponsible;
import com.glivraison.gestion_livraison.entities.Driver;
import com.glivraison.gestion_livraison.entities.Manager;

public class AuthService {
    AdminDao adminDao;
    ManagerDao managerDao;
    DriverDao driverDao;
    DeliveryResponsibleDao deliveryResponsibleDao;


    public boolean authAdmin(Admin admin) throws Exception {
        adminDao = new AdminDao();
        return adminDao.login(admin) != null;
    }

    public boolean authManager(Manager manager) throws Exception {
        managerDao = new ManagerDao();
        return managerDao.login(manager) != null;
    }

    public boolean authDriver(Driver driver) throws Exception {
        driverDao=new DriverDao();
        return driverDao.login(driver) != null;
    }

    public boolean authDeliveryResponsable(DeliveryResponsible deliveryResponsible) throws Exception {
        deliveryResponsibleDao=new DeliveryResponsibleDao();
        return deliveryResponsibleDao.login(deliveryResponsible) != null;
    }

}

