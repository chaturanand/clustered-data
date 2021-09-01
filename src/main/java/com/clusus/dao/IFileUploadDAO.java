package com.clusus.dao;

import java.util.Collection;
import java.util.List;

import com.clusus.model.AccumulativeDeal;
import com.clusus.model.InValidDeal;
import com.clusus.model.ValidDeal;

/**
 * 
 * @author chaturanand yadav
 * @since 2021-08-31
 *
 */
public interface IFileUploadDAO {
	
	    boolean fileExists(String fileName);
	    
	    public <T extends ValidDeal> Collection<T> bulkValidSave(Collection<T> entities, List<AccumulativeDeal> accumulativeDeals);
	    
	    public <T extends InValidDeal> Collection<T> bulkInvalidSave(Collection<T> entities);

}
