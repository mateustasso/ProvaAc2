package br.com.drummond.resources;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Ac2Resources {
	
	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public String test() {

		return "Sistema Drummond API ativo - " + new SimpleDateFormat("yyyyMM-dd HH:mm:ss").format(new Date());

	}
	
	
	@RequestMapping(value = "/api4/{numero}", method = RequestMethod.GET)
	public Integer api4(@PathVariable Integer numero) {
		
		Integer resultado = null;
		
		if(numero % 4 == 0) {
			resultado = numero + 4;
			System.out.println(resultado);
			
		} else {
			resultado = -1;
					
		}
		return resultado;
		
		
		
		
		
	}

}