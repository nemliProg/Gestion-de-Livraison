package com.glivraison.gestion_livraison.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Livraison {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "poids")
    private double poids;
    @Basic
    @Column(name = "prix")
    private double prix;
    @Basic
    @Column(name = "status")
    private String status;
    @Basic
    @Column(name = "from")
    private String from;
    @Basic
    @Column(name = "to")
    private String to;
    @Basic
    @Column(name = "date")
    private Timestamp date;
    @Basic
    @Column(name = "id_driver")
    private int idDriver;
    @Basic
    @Column(name = "id_categorie")
    private int idCategorie;
    @ManyToOne
    @JoinColumn(name = "id_driver", referencedColumnName = "id", nullable = false,insertable = false,updatable = false)
    private Driver driverByIdDriver;
    @ManyToOne
    @JoinColumn(name = "id_categorie", referencedColumnName = "id", nullable = false,insertable = false,updatable = false)
    private CategorieVehicle categorieVehicleByIdCategorie;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getIdDriver() {
        return idDriver;
    }

    public void setIdDriver(int idDriver) {
        this.idDriver = idDriver;
    }

    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livraison livraison = (Livraison) o;

        if (id != livraison.id) return false;
        if (Double.compare(livraison.poids, poids) != 0) return false;
        if (Double.compare(livraison.prix, prix) != 0) return false;
        if (idDriver != livraison.idDriver) return false;
        if (idCategorie != livraison.idCategorie) return false;
        if (status != null ? !status.equals(livraison.status) : livraison.status != null) return false;
        if (from != null ? !from.equals(livraison.from) : livraison.from != null) return false;
        if (to != null ? !to.equals(livraison.to) : livraison.to != null) return false;
        if (date != null ? !date.equals(livraison.date) : livraison.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(poids);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(prix);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + idDriver;
        result = 31 * result + idCategorie;
        return result;
    }

    public Driver getDriverByIdDriver() {
        return driverByIdDriver;
    }

    public void setDriverByIdDriver(Driver driverByIdDriver) {
        this.driverByIdDriver = driverByIdDriver;
    }

    public CategorieVehicle getCategorieVehicleByIdCategorie() {
        return categorieVehicleByIdCategorie;
    }

    public void setCategorieVehicleByIdCategorie(CategorieVehicle categorieVehicleByIdCategorie) {
        this.categorieVehicleByIdCategorie = categorieVehicleByIdCategorie;
    }
}
