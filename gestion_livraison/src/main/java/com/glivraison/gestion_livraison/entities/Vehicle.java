package com.glivraison.gestion_livraison.entities;

import jakarta.persistence.*;

@Entity
public class Vehicle {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "matricule")
    private String matricule;
    @Basic
    @Column(name = "category_id")
    private int categoryId;
    @OneToOne(mappedBy = "vehicleById")
    private Driver driverById;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", nullable = false,insertable = false,updatable = false)
    private CategorieVehicle categorieVehicleByCategoryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (id != vehicle.id) return false;
        if (categoryId != vehicle.categoryId) return false;
        if (matricule != null ? !matricule.equals(vehicle.matricule) : vehicle.matricule != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (matricule != null ? matricule.hashCode() : 0);
        result = 31 * result + categoryId;
        return result;
    }

    public Driver getDriverById() {
        return driverById;
    }

    public void setDriverById(Driver driverById) {
        this.driverById = driverById;
    }

    public CategorieVehicle getCategorieVehicleByCategoryId() {
        return categorieVehicleByCategoryId;
    }

    public void setCategorieVehicleByCategoryId(CategorieVehicle categorieVehicleByCategoryId) {
        this.categorieVehicleByCategoryId = categorieVehicleByCategoryId;
    }
}
