package com.ironhack.labjavaintermediatejpa.entity.association;

import com.ironhack.labjavaintermediatejpa.entity.division.Division;
import com.ironhack.labjavaintermediatejpa.entity.name.Name;
import jakarta.persistence.*;

import java.util.ArrayList;

@Entity
@Table(name = "associations")
public class Association {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private ArrayList<Division> divisions;

    public Association() {
    }

    public ArrayList<Division> getDivisions() {
        return divisions;
    }

    public void setDivisions(ArrayList<Division> divisions) {
        this.divisions = divisions;
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
}
