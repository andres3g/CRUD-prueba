/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Modelo.Producto;
import Modelo.ProductoDAO;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ninguno
 */
@WebService(serviceName = "Servicios")
public class Servicios {

    ProductoDAO dao = new ProductoDAO();
    
    @WebMethod(operationName = "listar")
    public List<Producto> listar() {
        List datos = dao.listar();
        
        return datos;
    }

    @WebMethod(operationName = "agregar")
    public String agregar(@WebParam(name = "ID") int ID, @WebParam(name = "nombres") String nombres, @WebParam(name = "precios") float precios, @WebParam(name = "categoria") String categoria) {
        
        String datos = dao.add(ID, nombres, precios, categoria);
        
        return datos;
    }

    @WebMethod(operationName = "listarID")
    public Producto listarID(@WebParam(name = "ID") int ID) {
        
        Producto producto = dao.listarID(ID);
        
        return producto;
    }

    @WebMethod(operationName = "Actualizar")
    public String Actualizar(@WebParam(name = "ID") int ID, @WebParam(name = "nombre") String nombre, @WebParam(name = "precio") float precio, @WebParam(name = "categoria") String categoria) {
        
        String datos = dao.edit(ID, nombre, precio, categoria);
        
        return datos;
    }

    @WebMethod(operationName = "Eliminar")
    public Producto Eliminar(@WebParam(name = "ID") int ID) {
        
        Producto p = dao.delete(ID);
        
        return p;
    }

}
