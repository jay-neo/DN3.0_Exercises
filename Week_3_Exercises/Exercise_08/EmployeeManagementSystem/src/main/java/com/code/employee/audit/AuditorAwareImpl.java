package com.code.employee.audit;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<String>{
	
	@Override
	public Optional<String> getCurrentAuditor(){
		return Optional.of("MyTest"); // just for testing
	}
}
