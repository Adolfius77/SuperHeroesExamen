/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.superHeroe;
import Interfaces.ISuperHeroeDAOO;
import jakarta.persistence.EntityManager;
import java.util.List;
import util.JpaUtil;

/**
 *
 * @author adoil
 */
public class superHeroeDAO implements ISuperHeroeDAOO {

    @Override
    public void insertar(superHeroe e) {
        EntityManager em = JpaUtil.getEntityManger();
        try {
            em.getTransaction().begin();

            em.persist(e);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw ex;
        } finally {
            em.close();
        }

    }

    @Override
    public void actualizar(superHeroe e) {
        EntityManager em = JpaUtil.getEntityManger();
        try {
            em.getTransaction().begin();
            em.merge(e);
            em.getTransaction().commit();

        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw ex;
        } finally {
            em.close();
        }
    }

    @Override
    public void eliminar(Long id) {
        EntityManager em = JpaUtil.getEntityManger();
        try {
            em.getTransaction().begin();
            superHeroe heroe = em.find(superHeroe.class, id);

            if (heroe != null) {
                em.remove(heroe);
            }
            em.getTransaction().commit();

        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw ex;
        } finally {
            em.close();
        }
    }

    @Override
    public superHeroe buscar(Long id) {
        EntityManager em = JpaUtil.getEntityManger();
        try {
            return em.find(superHeroe.class, id);
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw ex;

        } finally {
            em.close();
        }

    }

    @Override
    public List<superHeroe> listar() {
        EntityManager em = JpaUtil.getEntityManger();
        try {
            return em.createNamedQuery("SELECT s FROM superHeroe s", superHeroe.class).getResultList();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            throw ex;

        } finally {
            em.close();
        }
    }

}
