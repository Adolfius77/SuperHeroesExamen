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

        superHeroe spiderman = new superHeroe("spider man",
                Universo.MARVEL,
                new IdentidadSecreta("peter parker", "new york", "fotografo"),
                "hola papus");

        superHeroe batman = new superHeroe("batman",
                Universo.DC,
                new IdentidadSecreta("bruce banner", "gothan city", "millonario"),
                "viva cristo rey");
        superHeroe goku = new superHeroe("goku",
                Universo.INDEPENDIENTE,
                new IdentidadSecreta("kakaroto", "pepe", "millonario"),
                "volver pronto kame kame haaaaa");
        dao.insertar(goku);
        dao.insertar(spiderman);
        dao.insertar(batman);

        System.out.println("listar inicial de superHeroos : ");
        dao.listar().forEach(h -> System.out.println(h.getId() + "-" + h.getNombre() + h.getUniverso()));

        System.out.println("modificar un super heroe");

        superHeroe batmanBD = dao.buscar(batman.getId());
        batmanBD.getIdentidadSecreta().setCiudad("obregon");
        dao.actualizar(batmanBD);

        System.out.println("listar despues de modificar: ");
        dao.listar().forEach(h -> System.out.println(h.getId() + "-" + h.getNombre() + h.getIdentidadSecreta() + h.getIdentidadSecreta().getCiudad()));

        dao.eliminar(spiderman.getId());

        System.out.println("lista despues de eliminar spiderman");
        dao.listar().forEach(h -> System.out.println(h.getId() + "-" + h.getNombre()));

    }

}
