package com.phucle.spring.jpa.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="provinces")
public class Province {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	@Column(name="name")
	private String name;

	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    private List<Customer> customers;

	public List<Customer> getCustomers() {
		return customers;
	}

	
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	
	

}
