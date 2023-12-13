package com.uom.dao.custom;

import com.uom.dao.CRUDDAO;
import com.uom.model.Candidate;

import java.sql.SQLException;

public interface CandidateDAO extends CRUDDAO<Candidate , Integer> {
    public int getCount() throws SQLException, ClassNotFoundException;
    public boolean increseCandidate(String party) throws SQLException, ClassNotFoundException;
}
