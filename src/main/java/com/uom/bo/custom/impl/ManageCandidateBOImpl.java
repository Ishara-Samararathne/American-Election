package com.uom.bo.custom.impl;

import com.uom.bo.custom.ManageCandidateBO;
import com.uom.dao.custom.impl.CandidateDAOImpl;
import com.uom.model.Candidate;
import javafx.collections.ObservableList;

import java.sql.SQLException;

public class ManageCandidateBOImpl implements ManageCandidateBO{
    @Override
    public boolean registerCandidate(Candidate candidate) throws SQLException, ClassNotFoundException {
        return new CandidateDAOImpl().add(candidate);
    }

    @Override
    public boolean removeCandidate(int id) throws SQLException, ClassNotFoundException {
        return new CandidateDAOImpl().delete(id);
    }

    @Override
    public boolean updateCandidate(Candidate candidate) throws SQLException, ClassNotFoundException {
        return new CandidateDAOImpl().update(candidate);
    }

    @Override
    public ObservableList<Candidate> getAllCandidates() throws SQLException, ClassNotFoundException {
        return new CandidateDAOImpl().getAll();
    }

    @Override
    public int getCandidateCount() throws SQLException, ClassNotFoundException {
        return new CandidateDAOImpl().getCount();
    }
}
