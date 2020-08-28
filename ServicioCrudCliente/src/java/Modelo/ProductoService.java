/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import webservice.Producto;

/**
 *
 * @author Ninguno
 */
public class ProductoService {

    public ProductoService() {
    }

    public java.util.List<webservice.Producto> listar() {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listar();
    }

    public String agregar(int id, java.lang.String nombres, float precios, java.lang.String categoria) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.agregar(id, nombres, precios, categoria);
    }

    public Producto listarID(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.listarID(id);
    }

    public String actualizar(int id, java.lang.String nombre, float precio, java.lang.String categoria) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.actualizar(id, nombre, precio, categoria);
    }

    public Producto eliminar(int id) {
        webservice.Servicios_Service service = new webservice.Servicios_Service();
        webservice.Servicios port = service.getServiciosPort();
        return port.eliminar(id);
    }

    
    
    
    
    
}
