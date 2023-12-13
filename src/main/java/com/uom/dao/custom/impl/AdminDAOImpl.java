package com.uom.dao.custom.impl;

import com.uom.dao.CrudUtil;
import com.uom.dao.custom.AdminDAO;
import com.uom.model.Admin;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAOImpl implements AdminDAO {

    public Admin getAdmin(Admin admin) throws SQLException, ClassNotFoundException {
        ResultSet resultSet = CrudUtil.executeQuary("select * from admin where user_name =? and user_password = ?", admin.getUser_name(), admin.getUser_password());

        //get the results and return new admin with his details
        while (resultSet.next()){
            return new Admin(resultSet.getString("user_name") , resultSet.getString("user_password") , resultSet.getString("fullname") , resultSet.getString("email"));
        }
        return new Admin();
    }
}
