package com.example.demo;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static HazelcastInstance hazelcastInstance;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		hazelcastInstance = Hazelcast.newHazelcastInstance();
	}

}
