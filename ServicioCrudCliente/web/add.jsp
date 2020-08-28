 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <title>Agregar Producto</title>
    </head>
    <body>
        <div class="container mt-4" >
            <div class="card">
                <div class="card-header">
                    <h5>Agregar Nuevo Producto</h5>
                </div>
                <div class="card-body">
                    <form accion="Controlador">
                        
                            <label>ID</label>
                            <input type ="text" name ="txtID" class="from-control">
                        
                            <label>Nombre</label>
                            <input type ="text" name ="txtnom" class="from-control">
                        
                    
                            <label>Precio</label>
                            <input type ="text" name ="txtprecio" class="from-control">
                        
                        
                            <label>Categoria</label>
                            <input type ="text" name ="txtcateg" class="from-control">
                        
                        <input class ="btn-primary" type ="submit" name="accion" value="Guardar">
                        <a href="Controlador?accion=index">Regresar</a>
                    </form>
                </div>
                
            </div>
        </div>
    </body>
</html>
