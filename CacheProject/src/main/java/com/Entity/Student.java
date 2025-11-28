package com.Entity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(
    usage = CacheConcurrencyStrategy.READ_WRITE,
    region = "student_cache"
)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private Long mob;
    private String city;

    // ✔ Default constructor (MANDATORY)
    public Student() {
    }

    // Parameterized constructor
    public Student(int id, String name, Long mob, String city) {
        super();
        this.id = id;
       	this.name = name;
        this.mob = mob;
        this.city = city;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Long getMob() { return mob; }
    public void setMob(Long mob) { this.mob = mob; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", mob=" + mob + ", city=" + city + "]";
    }
}
