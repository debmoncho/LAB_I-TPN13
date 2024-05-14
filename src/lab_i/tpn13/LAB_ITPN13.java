
package lab_i.tpn13;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LAB_ITPN13 {


    public static void main(String[] args) {
       
        Connection con = Conexion.getConexion();
        
        // INSERTANDO ALUMNOS ****************
        
//        String sql = "INSERT INTO alumno ( dni, apellido, nombre, fechaDeNacimiento, estado) "
//                + "VALUES (31594876 , 'Tobares', 'Blas', '1991-05-22', true), "
//                + "(52684522 , 'Jeriko', 'Daniel', '1985-05-1', true), "
//                + "(4512358 , 'Lopez', 'Jose', '2002-10-19', true)";
//        
//        PreparedStatement ps;
//        
//        try {
//            
//            ps = con.prepareStatement(sql);
//            int filas = ps.executeUpdate();
//            
//        }
//        
//        catch (SQLException ex) {
//            
//            JOptionPane.showMessageDialog(null,
//                    "Error al cargar los alumnos"+ ex.getMessage());
//            
//        }
        
        
        // AGREGAR MATERIAS **************
        
        
//        String sql2 = "INSERT INTO materia(nombre, año, estado) "
//                + "VALUES ('Matematica',1,1), ('Lengua',2,1), "
//                + "('Musica',1,1), ('Geografia',3,1)";
//        
//        
//        try {
//            
//            PreparedStatement ps = con.prepareStatement(sql2);
//            int filas = ps.executeUpdate();
//            
//        }
//        
//        catch (SQLException ex) {
//            
//            JOptionPane.showMessageDialog(null,
//                    "Error al cargar las materias"+ ex.getMessage());
//            
//        }
        


         // INSCRIBIR A 3 ALUMNOS EN 2 MATERIAS C/U ***********
            
         
//         String sql3 = "INSERT INTO inscripcion( nota, idAlumno, idMateria)"
//                 + "VALUES (5,2,1), (8,2,2), (9,3,1), (10,3,2), (4,4,3), (2,4,4) ";
//        
//        
//         
//                 try {
//            
//            PreparedStatement ps = con.prepareStatement(sql3);
//            int filas = ps.executeUpdate();
//            
//        }
//        
//        catch (SQLException ex) {
//            
//            JOptionPane.showMessageDialog(null,
//                    "Error al cargar la carga de informacion"+ ex.getMessage());
//            
//        }





        // LISTAR DATOS DE ALUMNOS CON CALIFICACIONES > 8 **********
        
        
        
        
//        String sql4 = "SELECT dni, apellido, nombre, fechaDeNacimiento "
//                + "FROM alumno "
//                + "JOIN inscripcion "
//                + "ON (alumno.idAlumno = inscripcion.idInscripcion) "
//                + "WHERE nota > 8";
//         
//        
//        try {
//
//            PreparedStatement ps = con.prepareStatement(sql4);
//            ResultSet datos = ps.executeQuery();
//
//            int filas = ps.executeUpdate();
//            
//            while (datos.next()) {
//
//                String apellido = datos.getString("apellido");
//                String nombre = datos.getString("nombre");
//                int dni = datos.getInt("dni");
//                Date fechan = datos.getDate("fechaDeNacimiento");
//                System.out.println(" ");
//                
//
//                System.out.println("Apellido: " + apellido);
//                System.out.println("Nombre: " + nombre);
//                System.out.println("DNI: " + dni);
//                System.out.println("Fecha de Nacimiento: " + fechan);
//                System.out.println(" ");
//            }
//
//        }
//        
//        catch (SQLException ex) {
//
//            JOptionPane.showMessageDialog(null,
//                    "Error al cargar los datos" + ex.getMessage());
//
//        }
        

        // DESENSCRIBIR UN ALUMNO ******************

         String sql5 = "DELETE FROM inscripcion "
                + "WHERE idInscripcion = 6";

        try {

            PreparedStatement ps = con.prepareStatement(sql5);
            int filas = ps.executeUpdate();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null,
                    "Error al cargar la carga de informacion" + ex.getMessage());

        }
        
         
    }
    
}
