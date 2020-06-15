package main;

public class ConexionDB {
    
    private static ConexionDB conexion;
    
    private ConexionDB(){
        
    }
    
    public static ConexionDB obtenerConexion(){
        
        if (conexion == null){ //no se ha instanciado
            conexion = new ConexionDB();
        }
        
        return conexion;
    }
    
}