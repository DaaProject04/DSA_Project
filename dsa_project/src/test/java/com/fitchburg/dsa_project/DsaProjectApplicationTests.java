package com.fitchburg.dsa_project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.fitchburg.dsa_project.Model.Person;
import com.fitchburg.dsa_project.service.PersonService;

@SpringBootTest
class DsaProjectApplicationTests {

	public static PersonService personService=new PersonService();
	public static TestData testData=new TestData();

	public static void comparing(List<Person> testList,List<Person> dataList){
		for(int i=0;i<15;i++){
            assertEquals(testList.get(i).getId(),dataList.get(i).getId());
            assertEquals(testList.get(i).getName(),dataList.get(i).getName());
            assertEquals(testList.get(i).getEmail(),dataList.get(i).getEmail());
            assertEquals(testList.get(i).getSalery(),dataList.get(i).getSalery());
        }
	}
	
	@Test
	void testHeapSortById(){
		comparing(personService.heapSortById().getPersons(), testData.sortById());
	}

	@Test
	void testMergeSortById(){
		comparing(personService.mergeSortById().getPersons(), testData.sortById());
	}

	@Test
	void testMergeSortByName(){
		comparing(personService.mergeSortByName().getPersons(), testData.sortByName());
	}

	@Test
	void testMergeSortBySalery(){
		comparing(personService.mergeSortBySalery().getPersons(), testData.sortBySalery());
	}

	@Test
	void testInsertionSortById(){
		comparing(personService.insertionSortById().getPersons(), testData.sortById());
	}

	@Test
	void testInsertionSortByName(){
		comparing(personService.insertionSortByName().getPersons(), testData.sortByName());
	}

	@Test
	void testInsertionSortBySalery(){
		comparing(personService.insertionSortBySalery().getPersons(), testData.sortBySalery());
	}
}
