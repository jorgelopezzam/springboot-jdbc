package pe.edu.tecsup.database;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pe.edu.tecsup.database.dao.ProgramaDAO;
import pe.edu.tecsup.database.model.Programa;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProgramaDAOTests {

    @Autowired
    ProgramaDAO programaDAO;

    @Test
    public void verifyList() {

        List<Programa> programas = programaDAO.list();
        for (Programa programa : programas) {
            System.out.println(programa.getId());
            System.out.println(programa.getCodigo());
            System.out.println(programa.getNombre());
        }
        Assert.assertTrue(programas.size() > 0);
    }

    @Test
    public void verifyFind() {
        Programa programa = programaDAO.get(1l);
        System.out.println(programa.getNombre());
        Assert.assertTrue(programa.getId() == 1l);
    }

//    @Test
//    public void verifySave() {
//
//        Programa programa = new Programa();
//        programa.setCodigo("2020");
//        programa.setNombre("Nuevo Programa Jorge");
//        programa.setDescripcion("......");
//
//        programaDAO.save(programa);
//        Assert.assertTrue(programa.getId() != null);
//    }

//    @Test
//    public void verifyUpdate() {
//
//        // cambiar el código para validar
//        Programa programa = new Programa();
//        programa.setId(10l);
//        programa.setCodigo("2020");
//        programa.setNombre("Programa Modificado Jorge");
//
//        programaDAO.update(programa);
//        Assert.assertTrue(programaDAO.get(10l).getNombre().equals("Programa Modificado Jorge"));
//    }
//
//    @Test
//    public void verifyDelete() {
//
//        Programa programa = new Programa();
//        programa.setId(10l);
//        programaDAO.delete(programa);
//
//        Assert.assertTrue(programaDAO.get(10l) == null);
//    }

}
