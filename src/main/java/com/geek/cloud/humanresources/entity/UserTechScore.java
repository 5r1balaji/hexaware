package com.geek.cloud.humanresources.entity;

import javax.persistence.*;
@Entity
public class UserTechScore {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long scoreId;



    @ManyToOne
    @JoinColumn(name="EMPLOYEE_ID")
    UserMaster user;



    @ManyToOne
    @JoinColumn(name="TECHNOLOGY_ID")
    TechnologyArea area;


    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Column
    Double score;

    public Long getScoreId() {
        return scoreId;
    }

    public void setScoreId(Long scoreId) {
        this.scoreId = scoreId;
    }

    public UserMaster getUser() {
        return user;
    }

    public void setUser(UserMaster user) {
        this.user = user;
    }

    public TechnologyArea getArea() {
        return area;
    }

    public void setArea(TechnologyArea area) {
        this.area = area;
    }


}
