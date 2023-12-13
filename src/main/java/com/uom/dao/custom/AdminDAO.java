package com.uom.dao.custom;

import com.uom.model.Admin;

import java.sql.SQLException;

public interface AdminDAO {
    public Admin getAdmin(Admin admin) throws SQLException, ClassNotFoundException;
}
