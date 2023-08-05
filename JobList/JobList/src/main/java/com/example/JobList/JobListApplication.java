package com.example.JobList;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.URL;

@SpringBootApplication
public class JobListApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobListApplication.class, args);
		ObjectMapper mapper=new ObjectMapper();
		try {
			Jobs jobs=mapper.readValue(new URL("http://dev3.dansmultipro.co.id/api/recruitment/positions.json"), Jobs.class);
			System.out.println(jobs);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
