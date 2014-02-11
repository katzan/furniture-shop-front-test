package com.katzan.spring.furniturefronttest.web;

import java.util.Iterator;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.request.QueryRequest;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.katzan.spring.furniturefronttest.model.DocFound;
import com.katzan.spring.furniturefronttest.model.SearchResults;

 

@RequestMapping("/search/**")
@Controller
public class SearchController implements ApplicationContextAware {
	private static ApplicationContext applicationContext = null;
	
    @RequestMapping(method = RequestMethod.POST, params = "search", produces = "text/html")
    public String post(ModelMap modelMap, @ModelAttribute("search") String search) {
    	modelMap.put("sParam", search);
    	SolrServer solServer = solrServer();
    	SolrQuery qry = new SolrQuery(search);
    	QueryRequest qryReq = new QueryRequest(qry);
    	QueryResponse resp=null;
    	try {
    		resp = qryReq.process(solServer);
    	}
    	catch ( Exception ex) {
    		System.out.println("Exception has occured in searchMethod: "+ ex);
    	} 
    		SolrDocumentList results = resp.getResults();
    		modelMap.put("searchResultsNumbers", results.getNumFound() );
    		modelMap.put("searchResults", getFormattedResults(results));
    	return "search/index";
    }

    @RequestMapping
    public String index() {
        return "search/index";
    }

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.applicationContext = applicationContext;
	}
	
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }

	public static SolrServer solrServer() {
		ApplicationContext context = getApplicationContext();
		if(context==null) {
			System.out.println("Application context is null!!!");
		}
		SolrServer _solrServer = (SolrServer) context.getBean("solrServer"); 
        if (_solrServer == null) throw new IllegalStateException("Solr server has not been injected (is the Spring Aspects JAR configured as an AJC/AJDT aspects library?)");
        return _solrServer;
    }
	
	private SearchResults getFormattedResults(SolrDocumentList results) {
		SearchResults formedResults = new SearchResults();
		Iterator<SolrDocument> docs = results.iterator();
		while (docs.hasNext()) {
			SolrDocument curDocument = (SolrDocument)docs.next();
			DocFound docFound = new DocFound();
			docFound.setCodeNumber((String)curDocument.getFieldValue("codenumber"));
			docFound.setController((String)curDocument.getFieldValue("controller"));
			docFound.setDescription((String)curDocument.getFieldValue("description"));
			docFound.setId((String)curDocument.getFieldValue("id"));
			docFound.setItem_id((Long)curDocument.getFieldValue("item_id"));
			docFound.setName((String)curDocument.getFieldValue("name"));
			docFound.setFoto((String)curDocument.getFieldValue("foto"));
			formedResults.addDocument(docFound);
		}
		return formedResults;
	}
}
