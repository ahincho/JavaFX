
package com.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;

// Conexion Singleton a Base de Datos

public class DBConnection {
    
    // Puntero hacia la Instancia Singleton, inicialmente vacio
    private static Connection instance = null;
    // Driver que vamos a utilizar
    // https://stackoverflow.com/questions/52032739/loading-class-com-mysql-jdbc-driver-this-is-deprecated-the-new-driver-class
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    // Usuario de la Base de Datos
    private static final String user = "root";
    // Contrasenia de la Base de Datos
    private static final String password = "ahincho";
    // Tipo de Base de Datos, Host, Puerto y Nombre
    private static final String url = "jdbc:mysql://localhost:3306/test";

    // Constructor Privado de DBConnection
    private static void setInstance()
    {
        try
        {
            Class.forName(driver);
            instance = DriverManager.getConnection(url, user, password);
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

    // Metodo para controlar el acceso a la Instancia
    public static Connection getInstance()
    {
        if(DBConnection.instance == null)
        {
            // Si aun no se ha utilizado, se inicializa
            setInstance();
        }
        // Si ya se inicializo previamente devolver puntero
        return DBConnection.instance;
    }

    // Metodo para eliminar la conexion con la Base de Datos
    public static int closeInstance()
    {
        if (DBConnection.instance != null)
        {
            DBConnection.instance = null;
            return 0;
        }
        else {
            return -1;
        }
    }

}
