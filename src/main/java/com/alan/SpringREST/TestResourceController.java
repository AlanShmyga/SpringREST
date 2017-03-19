package com.alan.SpringREST;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResourceController {
	
	@RequestMapping("/test")
	public Testing test(@RequestParam(value="name", defaultValue="Username") String name,
						@RequestParam(value="phone", defaultValue="574696017") long phone) {
		return new Testing(1, name, phone);
	}

}
