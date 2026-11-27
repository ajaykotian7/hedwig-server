package dev.ajaykotian.hedwig;

import org.springframework.boot.SpringApplication;

public class TestHedwigServerApplication {

	public static void main(String[] args) {
		SpringApplication.from(HedwigServerApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
