/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dal.DALManager;
import java.util.ArrayList;
import model.dto.EmployeeDTO;
import model.dto.Response;
import model.validators.CommonValidator;

/**
 *
 * @author Mukhtiar
 */
public class OSSController {
    DALManager objDAL;
    public OSSController(){
    objDAL = SMSFactory.getInstanceOfDALManager();
    }

    public ArrayList<EmployeeDTO> viewEmployees(String searchKey) {
        return objDAL.getEmployeesList(searchKey);
    }

    public Response addEmployee(EmployeeDTO objEmp) {
        Response objResponse = SMSFactory.getResponseInstance();
        CommonValidator.validateEmployee(objEmp,objResponse);
        if(objResponse.isSuccessfull()){
            objDAL.saveEmployee(objEmp,objResponse);
        }
        return objResponse;
    }

    public Response deleteEmployee(String selectedId) {
        Response objResponse = SMSFactory.getResponseInstance();
        objDAL.deleteEmployee(selectedId, objResponse);
        return objResponse;
    }
}
