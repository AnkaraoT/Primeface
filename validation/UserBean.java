package com.jsftest.java.mbean;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
 
@ManagedBean(name="user")
@ViewScoped
public class UserBean implements Serializable{
	
	private String amt;

	public String getAmt() {
		if(amt!= null){
			amt = new BigDecimal(amt).toString();
		}
		return amt;
	}

	public void setAmt(String amt) {
		this.amt = amt;
	}


}

