package com.project2.main.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity (name = "tickets")
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name="id_generator", sequenceName = "tickets_ticketnumber_seq", allocationSize = 1)
	private int ticketnumber;
	@Column
	private int user_id;
	@Column
	private String tickettype;
	@Column
	private float ticketvalue;
	@Column
	private String ticketcomments;
	@Column
	private Date ticketdate;
	@Column
	private String status;
	
	public Ticket() {
		super();
	}
	
	public Ticket(int user_id, String tickettype, float ticketvalue, String ticketcomments) {
		super();
		this.user_id = user_id;
		this.tickettype = tickettype;
		this.ticketvalue = ticketvalue;
		this.ticketcomments = ticketcomments;
		this.status = "Pending";
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getTicketnumber() {
		return ticketnumber;
	}
	public void setTicketnumber(int ticketnumber) {
		this.ticketnumber = ticketnumber;
	}
	public String getTickettype() {
		return tickettype;
	}
	public void setTickettype(String tickettype) {
		this.tickettype = tickettype;
	}
	public double getTicketvalue() {
		return ticketvalue;
	}
	public void setTicketvalue(float ticketvalue) {
		this.ticketvalue = ticketvalue;
	}
	public String getTicketcomments() {
		return ticketcomments;
	}
	public void setTicketcomments(String ticketcomments) {
		this.ticketcomments = ticketcomments;
	}
	public Date getTicketdate() {
		return ticketdate;
	}
	public void setTicketdate(Date ticketdate) {
		this.ticketdate = ticketdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String ticketstatus) {
		this.status = ticketstatus;
	}
	
	
}