package model;

import base.CreatedBase;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "job_position")
public class JobPosition extends CreatedBase {
    private String id;
    private String tittle;
    private double salary;
}
