package com.example.demo.repository;

import com.example.demo.model.Branch;
import org.springframework.data.repository.CrudRepository;

public interface IBranchRepo extends CrudRepository<Branch,Long> {
    Branch findBranchById(Long id);
}
