package com.kubraevren.model;

import jakarta.persistence.Table;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer extends BaseEntity{

@Column(name="first_name")    
private String firstName;

@Column(name="last_name")    
private String lastName;

@Column(name="tckn")    
private String tckn;

@Column(name="birth_of_date")    
private Date birthOfDate;

@OneToOne
private Address address; //her müşterinin 1 adresi var

@OneToOne
private Account account; //her müşterinin 1 hesabı var


}
