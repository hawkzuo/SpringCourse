package edu.tamu.amos.spring.firstspringproject;

import edu.tamu.amos.spring.firstspringproject.level1.BinarySearchExample;
import edu.tamu.amos.spring.componentscan.dao.PersonDao;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "edu.tamu.amos.spring")
public class FirstSpringApplication {


	private static final Logger logger = LoggerFactory.getLogger(FirstSpringApplication.class);

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}

	public static void main(String[] args) {

		// Easily deal with different types of SortingAlgorithms

//		BinarySearchExample instanceClassExample = new BinarySearchExample(new QuickSortAlgorithm());

		// Two 'new' usages just for creating the Instance
		// What if the instances can be pre-determined so that those codes are not needed
		// Spring helps with introducing "beans"

//		BinarySearchExample instanceClassExample2 = new BinarySearchExample(new BubbleSortAlgorithm());
//
//		int dummyResult = instanceClassExample.binarySearch(new int[] {5,4,3,2,1}, 3, null);
//
//		System.out.println(dummyResult);
//		SpringApplication.run(FirstSpringProjectApplication.class, args);

		// Access Spring configured objects [via AppContext] :
//		ConfigurableApplicationContext applicationContext = SpringApplication.run(FirstSpringProjectApplication.class, args);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FirstSpringApplication.class);

        BinarySearchExample binarySearch = applicationContext.getBean(BinarySearchExample.class);
		BinarySearchExample binarySearch2 = applicationContext.getBean(BinarySearchExample.class);
		int dummyResult = binarySearch.binarySearch(new int[]{5,4,3,2,1}, 3);
        System.out.println(dummyResult);
        System.out.println(binarySearch);
        System.out.println(binarySearch2);

        PersonDao personDao = applicationContext.getBean(PersonDao.class);
        PersonDao personDao1 = applicationContext.getBean(PersonDao.class);

		logger.info("PersionDao: {}, JDBC: {}", personDao, personDao.getJdbcConnection());
		logger.info("PersonDao1: {}, JDBC: {}", personDao1, personDao1.getJdbcConnection());



	}
}
