package com.proyectocuy.dao;

import com.proyectocuy.conexion.Conexion;
import com.proyectocuy.model.Cuy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CuyDAO {

    public List<Cuy> listar() {
        List<Cuy> lista = new ArrayList<>();
        String sql = "SELECT * FROM cuyes";

        try (Connection conn = Conexion.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Cuy c = new Cuy();
                c.setIdCuy(rs.getInt("id_cuy"));
                c.setRaza(rs.getString("raza"));
                c.setSexo(rs.getString("sexo"));
                c.setPesoKg(rs.getDouble("peso_kg"));
                c.setEstado(rs.getString("estado"));
                lista.add(c);
            }
        } catch (SQLException e) {
            System.err.println("Error al listar cuyes: " + e.getMessage());
        }
        return lista;
    }
}