package com.ironhack.labjavaintermediatejpa.entity.division;

import jakarta.persistence.*;

@Entity
@Table(name = "divisions")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, name = "name")
    private String name;

    @Column(length = 100, name = "district")
    private String district;

    @Column(length = 100, name = "president")
    private String president;

    public Division() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }
}
