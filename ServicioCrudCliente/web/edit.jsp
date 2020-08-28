

<%@page import="webservice.Producto"%>
<%@page import="Modelo.ProductoService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Actualizar Producto</title>
    </head>
    <body>
          <div class="container mt-4" >
            <div class="card">
                <div class="card-header">
                    <h5>Actualizar Producto</h5>
                </div>
                <%
                 int ID=Integer.parseInt((String)request.getAttribute("IDproducto"));
                    
                ProductoService producto = new ProductoService();
                Producto p = producto.listarID(ID);
                
                %>
                <div class="card-body">
                    <form accion="Controlador">
                        
                            <label>ID</label>
                            <input type ="text" value="<%=p.getID()%>" name ="txtID" readonly="" class="from-control" value="">
                            
                            <label>Nombre</label>
                            <input type ="text" value="<%=p.getNombre()%>" name ="txtnom" class="from-control" value="">
                        
                    
                            <label>Precio</label>
                            <input type ="text" value="<%=p.getPrecio()%>" name ="txtprecio" class="from-control" value="">
                        
                        
                            <label>Categoria</label>
                            <input type ="text" value="<%=p.getCategoria()%>" name ="txtcateg" class="from-control" value="">
                        
                        <input class ="btn btn-success" type ="submit" name="accion" value="Actualizar">
                        <a href="Controlador?accion=index">Regresar</a>
                    </form>
                </div>
                
            </div>
        </div>
    </body>
</html>
