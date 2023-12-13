package com.uom.dao.custom;

import com.uom.dao.CRUDDAO;
import com.uom.model.Voter;

import java.sql.SQLException;

public interface VoterDAO extends CRUDDAO<Voter , String> {
    public int getCount() throws SQLException, ClassNotFoundException;
    public int[] getCountByGender() throws SQLException, ClassNotFoundException;
    public boolean setVote(int voter_id) throws SQLException, ClassNotFoundException;;
}
