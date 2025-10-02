/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author adoil
 */
@Entity
@Table(name = "supeHeroes")
public class superHeroe implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(unique = true, nullable = false)
    private String nombre;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)

    private Universo universo;

    @Embedded
    private String fraseIconica;

    public superHeroe() {
    }

    public superHeroe(long id, String nombre, Universo universo, String fraseIconica) {
        this.id = id;
        this.nombre = nombre;
        this.universo = universo;
        this.fraseIconica = fraseIconica;
    }

    @Override
    public String toString() {
        return "superHeroe{" + "id=" + id + ", nombre=" + nombre + ", universo=" + universo + ", fraseIconica=" + fraseIconica + '}';
    }
    

}
