package com.company.auth.privilege;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PrivilegeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrivilegeApplication.class, args);
	}
}

//Alternative to using @Bean annotation
//@Component 
//class DummyDataCLR implements CommandLineRunner{
//
//	@Autowired 
//	private PrivilegeRepository privilegeRepository;
//
//	@Override 
//	public void run(String... args) throws Exception {	
//		this.privilegeRepository.save(new Privilege("Add User", "Adds a new User"));
//		this.privilegeRepository.save(new Privilege("Delete User", "Deletes a User"));
//		this.privilegeRepository.save(new Privilege("Modify User", "Modifies a User"));
//		this.privilegeRepository.save(new Privilege("View Users", "Shows the list of all users"));
//	}
//}


@RestController
class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")//This handles all HTTP method GET, POST, PUT. Use @RequestMapping(method=GET) to narrow this mapping.
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}

class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}