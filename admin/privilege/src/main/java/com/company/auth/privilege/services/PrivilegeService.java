package com.company.auth.privilege.services;

import java.util.List;

import com.company.auth.privilege.Privilege;

public interface PrivilegeService {

	Privilege findPrivilegeById(Long id);
	List<Privilege> findAllPrivileges();
}
