package com.glivraison.gestion_livraison.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Driver {
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "password")
    private String password;
    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false,insertable = false,updatable = false)
    private Vehicle vehicleById;
    @OneToMany(mappedBy = "driverByIdDriver")
    private Collection<Livraison> livraisonsById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Driver driver = (Driver) o;

        if (id != driver.id) return false;
        if (name != null ? !name.equals(driver.name) : driver.name != null) return false;
        if (email != null ? !email.equals(driver.email) : driver.email != null) return false;
        if (password != null ? !password.equals(driver.password) : driver.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public Vehicle getVehicleById() {
        return vehicleById;
    }

    public void setVehicleById(Vehicle vehicleById) {
        this.vehicleById = vehicleById;
    }

    public Collection<Livraison> getLivraisonsById() {
        return livraisonsById;
    }

    public void setLivraisonsById(Collection<Livraison> livraisonsById) {
        this.livraisonsById = livraisonsById;
    }
}
