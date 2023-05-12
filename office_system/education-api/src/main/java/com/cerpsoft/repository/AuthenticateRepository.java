package com.cerpsoft.repository;

import com.cerpsoft.model.CustomerDBDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthenticateRepository extends JpaRepository<CustomerDBDetails, Integer> {
    List<CustomerDBDetails> findByAppName(String domainName);

}
