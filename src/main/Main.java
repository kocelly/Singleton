package main;

public class Main {
    
    public static void main(String[] args) {
        
        ConexionDB conexion = ConexionDB.obtenerConexion();
        ConexionDB conexion1 = ConexionDB.obtenerConexion();

        System.out.println(conexion.hashCode());
        System.out.println(conexion1.hashCode());
        
    }
}
