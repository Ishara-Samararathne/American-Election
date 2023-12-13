package com.uom.bo.custom;

import com.uom.model.Admin;

import java.sql.SQLException;

public interface AdminBO {
    //get the all  relevent details of the passing admin's user_and password
    public Admin getAdmin(Admin admin) throws SQLException, ClassNotFoundException;
}
