package com.clusus.model;


import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author chaturanand yadav
 * @since 2021-08-31
 *
 */
@Entity
@Table(name = "valid_deal")
public class ValidDeal extends  DealModel implements java.io.Serializable {

	
	private static final long serialVersionUID = 1L;

}
