package com.clusus.service;

import java.util.List;

import com.clusus.model.CSVRecord;
import com.clusus.model.DealModel;
import com.clusus.model.ValidDeal;
/**
 * @author chaturanand yadav
 * @since 2021-08-31
 *
 */
public interface IFileUploadService {

	void saveValidData(List<CSVRecord> dealDetails);
	
	void saveInValidData(List<CSVRecord> dealDetails);
	
	boolean checkFileExist(String fileName);

}
