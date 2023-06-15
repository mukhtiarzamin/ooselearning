/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.ResultSet;
import java.util.ArrayList;
import model.dto.EmployeeDTO;

/**
 *
 * @author Mukhtiar
 */
public class RecordsMapper {

    ArrayList<EmployeeDTO> getEmployees(ResultSet rs) {
        ArrayList<EmployeeDTO> emplist = new ArrayList<>();
        try{
        while (rs.next())
            {
                EmployeeDTO objEmp=new EmployeeDTO();                
                objEmp.Id=rs.getString(1);
                objEmp.FirstName= rs.getString(3);
                objEmp.LastName =rs.getString(2);
                objEmp.Address=rs.getString(8);                  
                emplist.add(objEmp);
            }
        }catch (Exception e){
        }
        return emplist;
    }
    
}
