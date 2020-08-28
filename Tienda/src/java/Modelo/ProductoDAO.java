/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ninguno
 */
public class ProductoDAO implements CRUD {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    String msj;
    Producto producto = new Producto();

    @Override
    public List listar() {
        List<Producto> datos = new ArrayList<>();
        String sql = "select * from Productos";
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                Producto p = new Producto();
                p.setID(rs.getInt("ID"));
                p.setNombre(rs.getString("nombre"));
                p.setPrecio(rs.getFloat("precio"));
                p.setCategoria(rs.getString("categoria"));
                datos.add(p);

            }
        } catch (Exception e) {
        }
        return datos;
    }

    @Override
    public Producto listarID(int ID) {

        String sql = "select * from Productos where ID =" + ID;

        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                producto.setID(rs.getInt("ID"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getFloat("precio"));
                producto.setCategoria(rs.getString("categoria"));
            }

        } catch (Exception e) {
        }
        return producto;
    }

    @Override
    public String add(int ID, String nombre, float precio, String categoria) {
        String sql = "insert into Productos(ID, nombre, precio, categoria)values(?,?,?,?)";
        // INSERT INTO `Productos` (`ID`, `nombre`, `precio`, `categoria`) VALUES ('1122', 'Secador de Cabello', '50000', 'Electrodomesticos');
        try {
            con = conex.getConnection();
            ps = con.prepareCall(sql);
            ps.setInt(1, ID);
            ps.setString(2, nombre);
            ps.setFloat(3, precio);
            ps.setString(4, categoria);
            res = ps.executeUpdate();
            if (res == 1) {
                msj = "Producto Agregado";
            } else {
                msj = "Error, no se pudo agregar";
            }
        } catch (Exception e) {
        }
        return msj;
    }

    @Override
    public String edit(int ID, String nombre, float precio, String categoria) {
        String sql = "update Productos set nombre= ?,precio= ?,categoria= ? where id =" + ID;

        try {
            msj = "OJO NO ESTA ACTUALIZANDO";
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setFloat(2, precio);
            ps.setString(3, categoria);
            msj = String.valueOf(res);
            res = ps.executeUpdate();

            if (res == 1) {
                msj = "Producto Actulizado!";
            } else {
                msj = "Error, el producto no se pudo actualizar";
            }
        } catch (Exception e) {
        }
        return msj;
    }

    @Override
    public Producto delete(int ID) {

        String sql = "delete from Productos where ID=" + ID;
        try {
            con = conex.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();

        } catch (Exception e) {
        }
        return producto;
    }

}
