package com.btfpt.service.impl;

import com.btfpt.models.Branch;

import java.util.List;

public interface IBranchService {

    public List<Branch> findAll();
    public Branch findById(long id);
}