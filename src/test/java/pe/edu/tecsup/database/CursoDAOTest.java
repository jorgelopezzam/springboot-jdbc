/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.tecsup.database;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.edu.tecsup.database.dao.CursoDAO;
import pe.edu.tecsup.database.model.Curso;

/**
 *
 * @author PCC
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CursoDAOTest {
    
    @Autowired
    CursoDAO cursoDAO;
    
    @Test
    public void verifyFind(){
        Curso curso = cursoDAO.get(27l);
        System.out.println(curso.getNombre());
        Assert.assertTrue(curso.getId() == 27l);
    }
    
    //@Test
//    public void verifySave() {
//
//        Curso curso = new Curso();
//        curso.setNombre("Nuevo Curso Jorge");
//        curso.setCodigo("2020");
//        //curso.setFechaInicio("2017/10/29");
//
//        cursoDAO.save(curso);
//        Assert.assertTrue(curso.getId() != null);
//    }
    
    @Test
    public void verifyList() {

        List<Curso> cursos = cursoDAO.list();
        for (Curso curso : cursos) {
            System.out.println(curso.getId());
            System.out.println(curso.getCodigo());
            System.out.println(curso.getNombre());
        }
        Assert.assertTrue(cursos.size() > 0);
    }
    
    @Test
    public void verifyUpdate() {

        // cambiar el código para validar
        Curso curso = new Curso();
        curso.setId(27l);
        curso.setCodigo("2020");
        curso.setNombre("Curso Modificado Jorge");

        cursoDAO.update(curso);
        Assert.assertTrue(cursoDAO.get(27l).getNombre().equals("Curso Modificado Jorge"));
    }

    @Test
    public void verifyDelete() {

        Curso curso = new Curso();
        curso.setId(29l);
        cursoDAO.delete(curso);

        Assert.assertTrue(cursoDAO.get(29l) == null);
    }
    
}
