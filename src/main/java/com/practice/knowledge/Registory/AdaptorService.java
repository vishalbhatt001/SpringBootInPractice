package com.practice.knowledge.Registory;

public interface AdaptorService<T> {

	public void process(T request);
}
