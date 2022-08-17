package com.btfpt.repository;

import com.btfpt.models.Staff;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IStaffRepo extends PagingAndSortingRepository<Staff, String> {
}
