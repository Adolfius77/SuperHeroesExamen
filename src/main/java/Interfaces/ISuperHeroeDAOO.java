/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import Entity.superHeroe;
import java.util.List;

/**
 *
 * @author adoil
 */
public interface  ISuperHeroeDAOO {
   void insertar(superHeroe e); 
   
   void actualizar(superHeroe e);
   
   void eliminar(Long id);
   
   superHeroe buscar(Long id);
   
   List<superHeroe> listar();
}
