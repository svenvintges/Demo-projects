package nl.svenvintges.demo.frontend.container;

import java.io.Serializable;
import java.util.List;

import nl.svenvintges.model.Message;

import com.vaadin.data.util.BeanItemContainer;

public class MessageContainer extends BeanItemContainer<Message> implements
Serializable{

	public MessageContainer()
			throws IllegalArgumentException {
		super(Message.class);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4606463452129736939L;
	
	/**
	 * Populates the container based on a given list. Going to find out how it works with hibernate controlled lists ;)
	 * @param messages
	 */
	public void populateContainer(List<Message> messages)
	{
		for (Message message : messages) {
			this.addItem(message);
		}
		
	}
	
	

}
