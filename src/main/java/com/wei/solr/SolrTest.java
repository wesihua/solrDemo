package com.wei.solr;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocumentList;

public class SolrTest {

	public static void main(String[] args) throws SolrServerException {
		String url = "http://localhost:8983/solr/";
		SolrServer server = new HttpSolrServer(url);
		SolrQuery query = new SolrQuery();
		query.setQuery("name:管理");
		query.add("fq","level:1");
		query.addSort("id", ORDER.desc);
		//高亮设置
		query.setHighlight(true);
		query.addHighlightField("name");
		query.setHighlightSimplePre("<em>");
		query.setHighlightSimplePost("</em>");
		QueryResponse response = server.query(query);
		SolrDocumentList docs = response.getResults();
		
		System.out.println(docs);
		System.out.println(response.getHighlighting());
	}
}
