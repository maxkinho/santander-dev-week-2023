package com.dio;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}


//Java RESTful API criada para a conclusão do Bootcamp Santander - Backend (Java) em parceria com a DIO.

//santander-dev-week-2023

//{
//  "name": "Antonio",
//  "account": {
//    "number": "00000000-0",
//    "agency": "0000",
//    "balance": 1234.64,
//    "limit": 1000.00
//  },
//  "features": [
//    {
//      "icon": "URL",
//      "description": "Descrição da feature"
//    }
//  ],
//  "card": {
//    "number": "xxxx xxxx xxxx xxxx",
//    "limit": 1000.00
//  },
//  "news": [
//    {
//      "icon": "URL",
//      "description": "Descrição da novidade"
//    }
//  ]
//}