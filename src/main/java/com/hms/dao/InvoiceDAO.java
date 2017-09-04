package com.hms.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.hms.model.Invoice;

@Repository
public class InvoiceDAO {
	List<Invoice> invoiceList= new ArrayList<Invoice>();
	
	public List<Invoice> showInvoice(){
		Invoice inv = new Invoice();
		invoiceList.add(inv);
		return invoiceList;
	}
}
