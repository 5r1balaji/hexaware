package com.geek.cloud.humanresources.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class TechnologyArea implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long technologyId;


    @Column
    String technologyArea;

    public Long getTechnologyId() {
        return technologyId;
    }

    public void setTechnologyId(Long technologyId) {
        this.technologyId = technologyId;
    }

    public String getTechnologyArea() {
        return technologyArea;
    }

    public void setTechnologyArea(String technologyArea) {
        this.technologyArea = technologyArea;
    }
}
