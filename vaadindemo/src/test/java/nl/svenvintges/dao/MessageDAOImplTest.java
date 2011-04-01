package nl.svenvintges.dao;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class MessageDAOImplTest {

	@Test
	public void testGetMessageByDateRange() {
		MessageDAO testDao = new MessageDAOImpl();
		
		assertTrue(testDao.getMessageByDateRange(new Date(), new Date()).size() > 0);
	}

}
