package fr.christophetd.log4shell.vulnerableapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Properties;

@SpringBootApplication
public class VulnerableAppApplication {

	public static void main(String[] args) {

		Properties props = System.getProperties();
		props.setProperty("formatMsgNoLookups","true");


		SpringApplication.run(VulnerableAppApplication.class, args);
	}

}
