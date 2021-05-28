package com.mvnp.mvnp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MvnpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvnpApplication.class, args);
	}


@RequestMapping(value = "/hiii")
	public String hiii(){
		return "hiii anirud whats up";
}
@RequestMapping(value = "/msg")
		public String getMsg(){
		return "wlc to java";


}
}

