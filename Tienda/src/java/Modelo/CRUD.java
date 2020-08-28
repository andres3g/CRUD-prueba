package Modelo;

import java.util.List;

public interface CRUD {

    public List listar();

    public Producto listarID(int ID);

    public String add( int ID,String nombre, float precio, String categoria);

    public String edit(int ID, String nombre, float precio, String categoria);

    public Producto delete(int ID);
}
