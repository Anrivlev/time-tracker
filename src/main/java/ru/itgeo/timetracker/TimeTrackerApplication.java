package ru.itgeo.timetracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import ru.itgeo.user.UserRepository;

@SpringBootApplication
@EnableMongoRepositories
public class TimeTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimeTrackerApplication.class, args);
	}

}
