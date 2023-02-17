package app;

import app.services.PeopleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {
    @Bean
    public PeopleService getPeopleService(){
        return new PeopleService();
    }
}
