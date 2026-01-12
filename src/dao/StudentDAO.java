package dao;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;

public class StudentDAO {
    private static final String SQL_INSERT = "Insert Into students (prenom, nom, email, username, password, age, sexe) values (?,?,?,?,?,?,?)";
    
    public static int create(Student s){
        try {
            int row = DatabaseService.executeUpdate(SQL_INSERT,
                    s.getPrenom(),
                    s.getNom(),
                    s.getEmail(),
                    s.getUsername(),
                    s.getPassword(),
                    s.getAge(),
                    s.isSexe()
                    
            );
            return row;
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }
}
