package org.example;
import jakarta.persistence.*;

import java.util.*;

@Entity
@Table (name = "manufacture")
public class Manufacture {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    public String ID;

    @Column (name = "name")
    public String Name;

    @Column (name = "location")
    public String Location;

    @Column (name = "employee")
    public int Employee;

    @OneToMany(mappedBy = "manufacture", fetch = FetchType.EAGER)
    private List<Phone> list;

    public Manufacture (String id, String name, String location, int employee) {
        this.ID = id;
        this.Name = name;
        this.Location = location;
        this.Employee = employee;
    }
}
