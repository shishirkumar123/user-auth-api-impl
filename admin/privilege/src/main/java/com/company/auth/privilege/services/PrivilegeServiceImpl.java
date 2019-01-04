package com.company.auth.privilege.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.auth.privilege.Privilege;
import com.company.auth.privilege.repositories.PrivilegeRepository;

@Service
public class PrivilegeServiceImpl implements PrivilegeService{
	private final PrivilegeRepository privilegeRepository;
	
	public PrivilegeServiceImpl(PrivilegeRepository privilegeRepository) {
		super();
		this.privilegeRepository = privilegeRepository;
	}

	@Override
	public Privilege findPrivilegeById(Long id) {
		return privilegeRepository.getOne(id);
	}

	@Override
	public List<Privilege> findAllPrivileges() {
		return privilegeRepository.findAll();
	}
}