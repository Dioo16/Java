package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Request {
	
	private Integer id;
	private Date moment;
	private OrderStatus status;
	
	@Override
	public String toString() {
		return "Request [id=" + id + ", moment=" + moment + ", status=" + status + "]";
	}

	public Request() {
		
	}
	
	public Request(Integer id, Date moment, OrderStatus status) {
		this.id = id;
		this.moment = moment;
		this.status = status;
	}

	
	
}
