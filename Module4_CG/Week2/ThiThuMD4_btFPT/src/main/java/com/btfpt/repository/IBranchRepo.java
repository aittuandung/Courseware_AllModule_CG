package com.btfpt.repository;

import com.btfpt.models.Branch;
import org.springframework.data.repository.CrudRepository;

public interface IBranchRepo extends CrudRepository<Branch,Long> {
}
