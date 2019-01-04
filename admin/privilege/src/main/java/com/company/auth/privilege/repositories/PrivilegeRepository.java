package com.company.auth.privilege.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.auth.privilege.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long>{

}
