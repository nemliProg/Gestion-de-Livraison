package com.glivraison.gestion_livraison.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "categorie_vehicle", schema = "gestion_livraison", catalog = "")
public class CategorieVehicle {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "type")
    private String type;
    @OneToMany(mappedBy = "categorieVehicleByIdCategorie")
    private Collection<Livraison> livraisonsById;
    @OneToMany(mappedBy = "categorieVehicleByCategoryId")
    private Collection<Vehicle> vehiclesById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CategorieVehicle that = (CategorieVehicle) o;

        if (id != that.id) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    public Collection<Livraison> getLivraisonsById() {
        return livraisonsById;
    }

    public void setLivraisonsById(Collection<Livraison> livraisonsById) {
        this.livraisonsById = livraisonsById;
    }

    public Collection<Vehicle> getVehiclesById() {
        return vehiclesById;
    }

    public void setVehiclesById(Collection<Vehicle> vehiclesById) {
        this.vehiclesById = vehiclesById;
    }
}
