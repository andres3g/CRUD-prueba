
<%@page import="java.util.List"%>
<%@page import="webservice.Producto"%>
<%@page import="Modelo.ProductoService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Editor de Articulos de la tienda</title>
    </head>
    <body>
        <div class="row justify-content-center">
        <h1><br>Tienda Virtual: Editor de Productos</h1>
        </div>
        <div class="container mt-4" >
            <div class="card">
                <div class="card-header" >
                    <a href="Controlador?accion=add" class="btn btn-primary">Nuevo Producto</a>
                </div>
                <div class="card-body">
                    <table class="table table-hover">
                        <thead>
                            <tr class="p-3 mb-2 bg-info text-white">
                                <th>ID</th>
                                <th>Nombre</th>
                                <th>Precio</th>
                                <th>Categoria</th>
                                <th>Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                            ProductoService producto = new ProductoService();
                            List<Producto> datos = producto.listar();
                            for(Producto p:datos){
                            
                            
                            
                            
                            %>
                            <tr>
                                <td><%= p.getID()%></td>
                                <td><%= p.getNombre()%></td>
                                <td><%=p.getPrecio()%></td>
                                <td><%=p.getCategoria()%></td>
                                <td>
                                    <a href="Controlador?accion=editar&ID=<%= p.getID()%>" class = "btn btn-warning">Actualizar</a>
                                    <a href="Controlador?accion=eliminar&ID=<%= p.getID()%>" class = "btn btn-danger">Eliminar</a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
                
            </div>
            
        </div>
    </body>
</html>
