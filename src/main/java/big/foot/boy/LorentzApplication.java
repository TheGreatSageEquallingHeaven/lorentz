package big.foot.boy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class LorentzApplication {

	public static void main(String[] args) {
		SpringApplication.run(LorentzApplication.class, args);
	}
}
