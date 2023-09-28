package simu.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "t1")

public class T1Tulos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "tulokset_id")
    @Column(name = "id")
    private int id;
    @Column(name = "nimi")
    private String nimi;
    @Column(name = "kayttoaste")
    private double kayttoaste;
    @Column(name = "suoritusteho")
    private double suoritusteho;
    @Column(name = "jonotusaika")
    private double jonotusaika;
    @Column(name = "jononpituus")
    private double jononpituus;


    public T1Tulos(double kayttoaste, double suoritusteho, double jonotusaika, double jononpituus) {
        this.kayttoaste = kayttoaste;
        this.suoritusteho = suoritusteho;
        this.jonotusaika = jonotusaika;
        this.jononpituus = jononpituus;
    }

    public T1Tulos() {
    }

    // Setterit
    public void setId(int id) {
        this.id = id;
    }

    public void setKayttoaste(double kayttoaste) {
        this.kayttoaste = kayttoaste;
    }

    public void setSuoritusteho(double suoritusteho) {
        this.suoritusteho = suoritusteho;
    }

    public void setJonotusaika(double jonotusaika) {
        this.jonotusaika = jonotusaika;
    }

    public void setJononpituus(double jononpituus) {
        this.jononpituus = jononpituus;
    }

    // Getterit
    public int getId() {
        return id;
    }

    public double getKayttoaste() {
        return kayttoaste;
    }

    public double getSuoritusteho() {
        return suoritusteho;
    }

    public double getJonotusaika() {
        return jonotusaika;
    }

    public double getJononpituus() {
        return jononpituus;
    }
}