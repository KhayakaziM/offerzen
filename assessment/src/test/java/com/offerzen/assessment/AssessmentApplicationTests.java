package com.offerzen.assessment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class AssessmentApplicationTests {
	@Autowired
	SortingService sortingService;

	@Test
	void contextLoads() {
	}

	@Test
	public void sortData() {
		int []arr = {3, 60, 35, 2, 45, 320, 5};
		int [] axpectedArr = { 2,3,5,35,45,60,320};
		int [] resultsArr=sortingService.sortData(arr);
		assertArrayEquals(axpectedArr , resultsArr);
	}

}
