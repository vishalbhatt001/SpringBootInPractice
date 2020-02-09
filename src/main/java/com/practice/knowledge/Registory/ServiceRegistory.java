package com.practice.knowledge.Registory;

public interface ServiceRegistory {

	public <T> AdaptorService<T> getService(String serviceName);
}
