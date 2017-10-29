/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.tecsup.database.helper.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import pe.edu.tecsup.database.model.Curso;

/**
 *
 * @author PCC
 */
public class CursoRowMapper implements RowMapper<Curso> {

    @Override
    public Curso mapRow(ResultSet rs, int i) throws SQLException {
        Curso curso = new Curso();
        curso.setId(rs.getLong(1));
        curso.setNombre(rs.getString(2));
        curso.setCodigo(rs.getString(3));
        curso.setFechaInicio(rs.getDate(4));
        
        return curso;
    }
    
}
