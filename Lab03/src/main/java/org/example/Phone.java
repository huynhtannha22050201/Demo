package org.example;
import jakarta.persistence.*;

@Entity
@Table(name= "Phone")


public class Phone {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    public String ID;

    @Column (name = "name")
    public String Name;

    @Column (name = "price")
    public int Price;

    @Column (name = "color")
    public String Color;

    @Column (name = "country")
    public String Country;

    @Column (name = "quality")
    public int Quality;

    @JoinColumn (name="manufacture_id",nullable = false)
    @ManyToOne
    public Manufacture manufacture;

    public Phone(String id, String name, int price, String color, String country, int quality) {
        this.ID = id;
        this.Name = name;
        this.Color = color;
        this.Country = country;
        this.Quality = quality;
    }
}