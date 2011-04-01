package nl.svenvintges.dao;

import java.util.Date;
import java.util.List;

import nl.svenvintges.model.Message;

public interface MessageDAO {
	
	public List<Message> getMessageByDateRange(Date startDate, Date endDate);
	
	

}
