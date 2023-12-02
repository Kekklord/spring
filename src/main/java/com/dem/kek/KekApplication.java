package com.dem.kek;

import com.dem.kek.model.DataCode;
import com.dem.kek.model.Quiz;
import com.dem.kek.repository.DataRepository;
import com.dem.kek.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.util.Pair;

import java.util.List;

@SpringBootApplication
@EnableMongoRepositories
public class KekApplication implements CommandLineRunner {

	@Autowired
	private DataRepository dataRepository;

	@Autowired
	private QuizRepository quizRepository;


	public static void main(String[] args) {
		SpringApplication.run(KekApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("-----CREATE GROCERY ITEMS-----\n");

		createDataCodes();
		createQuizData();

//		System.out.println("\n-----SHOW ALL GROCERY ITEMS-----\n");
//
//		showAllDataCodes();
//
//		System.out.println("\n-----GET ITEM BY NAME-----\n");
//
//		getDataById("mongo repo");
//
//		System.out.println("\n-----GET ITEMS BY Status-----\n");
//
//		getDataByStatus(false);
//
//		System.out.println("\n-----UPDATE CATEGORY NAME OF SNACKS CATEGORY-----\n");
//
//		updateStatus(false);
//
//		System.out.println("\n-----DELETE A GROCERY ITEM-----\n");
//
//		deleteData("quad connect");
//
//		System.out.println("\n-----FINAL COUNT OF GROCERY ITEMS-----\n");
//
//		getDataCount();
//
//		System.out.println("\n-----THANK YOU-----");

//			deleteAllData();
	}

	public void createQuizData() {
		quizRepository.save(new Quiz(
				"largestPopulation",
				"Which country has the largest population in the world?",
				List.of(
						Pair.of("United States", 1),
						Pair.of("India", 2),
						Pair.of("China", 3),
						Pair.of("Japan", 4)
				),
				1
				));

		quizRepository.save(new Quiz(
				"tallestMountain",
				"What is the name of the tallest mountain in the world?",
				List.of(
						Pair.of("Mount Chimborazo's", 1),
						Pair.of("Mount Everest's", 2),
						Pair.of("Mount Kilimanjaro", 3),
						Pair.of("Mauna Kea", 4)
				),
				2
		));
		quizRepository.save(new Quiz(
				"longestRiver",
				"What is the name of the longest river in the world?",
				List.of(
						Pair.of("Nile River", 1),
						Pair.of("Amazon–Ucayali–Apurímac", 2),
						Pair.of("Yangtze", 3),
						Pair.of("Mississippi–Missouri–Red Rock", 4)
				),
				1
		));
		quizRepository.save(new Quiz(
				"locationGoldenBridge",
				"What American city is the Golden Gate Bridge located in?",
				List.of(
						Pair.of("New York", 1),
						Pair.of("San Francisco", 2),
						Pair.of("Chicago", 3),
						Pair.of("Los Angeles", 4)
				),
				2
		));
		quizRepository.save(new Quiz(
				"largestCountry",
				"What is the name of the largest country in the world?",
				List.of(
						Pair.of("United States of America", 1),
						Pair.of("Canada", 2),
						Pair.of("China", 3),
						Pair.of("Russia", 4)
				),
				4
		));
	}

	public void createDataCodes() {
		System.out.println("Data Creation Started");
		dataRepository.save(new DataCode("quad connect", "https://google.com", false));
		dataRepository.save(new DataCode("mongo repo", "https://www.mongodb.com/compatibility/spring-boot", true));
		dataRepository.save(new DataCode("src code", "https://github.com/mongodb-developer/mongodb-springboot/blob/main/mdb-spring-boot/src/main/java/com/example/mdbspringboot/MdbSpringBootApplication.java", false));
		dataRepository.save(new DataCode("dragons", "https://play.famobi.com/dragons-trail", false));
		dataRepository.save(new DataCode("cannons", "https://play.famobi.com/cannons-and-soldiers", true));
		dataRepository.save(new DataCode("animalines", "https://play.famobi.com/animalines", false));
		dataRepository.save(new DataCode("math", "https://play.famobi.com/freaking-math", true));
		dataRepository.save(new DataCode("glow", "https://play.famobi.com/glow-lines", false));
		dataRepository.save(new DataCode("quick", "https://play.famobi.com/fit-it-quick", true));

	}


	public void updateStatus(boolean status) {
		List<DataCode> list = dataRepository.findByStatus(status);

		list.forEach(dataCode -> dataCode.setStatus(!status));

		List<DataCode> updatedList = dataRepository.saveAll(list);

		if (updatedList != null) {
			System.out.println("Successfully updated " + updatedList.size() + " items.");
		}
	}

	public void deleteData(String id) {
		dataRepository.deleteById(id);
		System.out.println("The data with id of: " + id + " has been deleted!");
	}

	public void deleteAllData() {
		dataRepository.deleteAll();
		System.out.println("Deleting all data from the database...");
	}


	/**************** Printing Method ****************/
	public String showDetails(DataCode dataCode) {
		System.out.println(
				"Id: " + dataCode.getId() +
				", \nLink: " + dataCode.getLink() +
				", \nStatus: " + dataCode.isStatus()
		);
		return "";
	}
}
