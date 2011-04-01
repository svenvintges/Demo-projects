package nl.svenvintges.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import nl.svenvintges.model.Message;

public class MessageDAOImpl implements MessageDAO {

	public List<Message> getMessageByDateRange(Date startDate, Date endDate) {
		List<Message> myList = new ArrayList<Message>();
		
		Message msg = new Message();
		msg.setContent("Test");
		msg.setRegisteredOn(new Date());
		msg.setHandledByUser("Sven");
		
		myList.add(msg);
		
		return myList;
	}

}
