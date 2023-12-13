package com.uom.bo.custom.impl;

import com.uom.bo.custom.AdminBO;
import com.uom.dao.custom.impl.AdminDAOImpl;
import com.uom.model.Admin;

import java.sql.SQLException;

public class AdminBOImpl implements AdminBO {

    public Admin getAdmin(Admin admin) throws SQLException, ClassNotFoundException {
        return new AdminDAOImpl().getAdmin(admin);
    }
}
