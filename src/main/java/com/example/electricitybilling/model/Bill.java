  package com.example.electricitybilling.model;

	import jakarta.persistence.*;

	@Entity
	public class Bill {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String meterNumber;
	    private String customer_id;
	    private int units;
	    private double amount;
	    private String status;
	    @ManyToOne
	    @JoinColumn(name = "customer_id")
	    private Customer customer;


	    public Bill() {}

	    public Long getId() { return id; }

	    public String getMeterNumber() { return meterNumber; }
	    public void setMeterNumber(String meterNumber) { this.meterNumber = meterNumber; }

	    public int getUnits() { return units; }
	    public void setUnits(int units) { this.units = units; }

	    public double getAmount() { return amount; }
	    public void setAmount(double amount) { this.amount = amount; }

	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }
	    
	    public Customer getCustomer() {
	        return customer;
	    }

	    public void setCustomer(Customer customer) {
	        this.customer = customer;
	    }

		public String getCustomer_id() {
			return customer_id;
		}

		public void setCustomer_id(String customer_id) {this.customer_id = customer_id; 
			this.customer_id = customer_id;
			
		}

	}


