/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import DAO.superHeroeDAO;
import Entity.IdentidadSecreta;
import Entity.Universo;
import Entity.superHeroe;
import Interfaces.ISuperHeroeDAOO;

/**
 *
 * @author adoil
 */
public class SuperHeroesJPA {

    public static void main(String[] args) {
        ISuperHeroeDAOO dao = new superHeroeDAO();

        superHeroe spiderman = new superHeroe(0, "Spider man",
                Universo.MARVEL,
                new IdentidadSecreta("peter parker","new york","fotografo")
                , "un gran poder lleva una gran resposabildad");
    }
}
