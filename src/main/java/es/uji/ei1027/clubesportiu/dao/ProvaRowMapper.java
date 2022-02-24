package es.uji.ei1027.clubesportiu.dao;

import es.uji.ei1027.clubesportiu.model.Prova;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class ProvaRowMapper implements RowMapper<Prova> {
    public Prova mapRow(ResultSet rs, int rowNum) throws SQLException {
        Prova prova = new Prova();
        prova.setNom(rs.getString("nom"));
        prova.setDescripcio(rs.getString("descripcio"));
        prova.setTipus(rs.getString("tipus"));
        prova.setData(rs.getObject("data", LocalDate.class));
        return prova;
    }
}
