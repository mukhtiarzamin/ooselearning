/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.validators;

import model.dto.EmployeeDTO;
import model.dto.Message;
import model.dto.MessageType;
import model.dto.Response;

/**
 *
 * @author Mukhtiar-HPC
 */
public class CommonValidator {

    public static void validateEmployee(EmployeeDTO objEmp, Response objResponse) {
        isValidName(objEmp.FirstName, objResponse);
        isValidName(objEmp.LastName, objResponse);
        
    }

    private static void isValidName(String nameToValidate, Response objResponse) {
        if(nameToValidate == null || nameToValidate.length() < 3){
            objResponse.messagesList.add(new Message("FIrst Name is not valid, Provide valid first name with at least 3 characters.",MessageType.Error));
        }
        
        // Todo validate the rest
    }
    
    
    
}
