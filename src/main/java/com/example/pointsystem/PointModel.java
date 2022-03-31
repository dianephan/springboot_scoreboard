package com.example.pointsystem;

import javax.persistence.*;

@Entity
@Table(name = "point_system")
public class PointModel {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)       // copypaste
    @Basic                                                  // PK doesnt have to be just int ID. other data types
    public int id;
    @Column(name = "Field1")
    public int point;

    public PointModel(int i1) {
        this.point = i1;
    }

    public PointModel() {
//        no arguments constructor
    }
}
