package edu.tamu.amos.spring.firstspringproject;

import edu.tamu.amos.spring.firstspringproject.level1.BinarySearchExample;
import edu.tamu.amos.spring.xml.XmlPersonDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class XmlSpringApplication {


	private static final Logger logger = LoggerFactory.getLogger(XmlSpringApplication.class);

	@PostConstruct
	public void postConstruct() {
		logger.info("postConstruct");
	}
	@PreDestroy
	public void preDestroy() {
		logger.info("preDestroy");
	}

	public static void main(String[] args) {

//		ConfigurableApplicationContext applicationContext = SpringApplication.run(FirstSpringProjectApplication.class, args);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("XmlBeans.xml");


        BinarySearchExample binarySearch = applicationContext.getBean(BinarySearchExample.class);
		BinarySearchExample binarySearch2 = applicationContext.getBean(BinarySearchExample.class);
		int dummyResult = binarySearch.binarySearch(new int[]{5,4,3,2,1}, 3);
        System.out.println(dummyResult);
        System.out.println(binarySearch);
        System.out.println(binarySearch2);

		XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);
		XmlPersonDao personDao1 = applicationContext.getBean(XmlPersonDao.class);

		logger.info("PersonDao: {}, JDBC: {}", personDao, personDao.getXmlJdbcConnection());
		logger.info("PersonDao1: {}, JDBC: {}", personDao1, personDao1.getXmlJdbcConnection());



	}
}
