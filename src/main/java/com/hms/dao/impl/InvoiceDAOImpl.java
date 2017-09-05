package com.hms.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hms.model.Invoice;

@Repository
public class InvoiceDAOImpl {
	List<Invoice> invoiceList= new ArrayList<Invoice>();
	
	public List<Invoice> showInvoice(){
		Invoice inv = new Invoice();
		invoiceList.add(inv);
		return invoiceList;
	}
}
