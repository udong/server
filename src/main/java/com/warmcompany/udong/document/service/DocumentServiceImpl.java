package com.warmcompany.udong.document.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.warmcompany.udong.common.CommonDAO;
import com.warmcompany.udong.document.model.Document;

/**
 * 2015. 12. 25.
 * Copyright by joyhan / HUFS
 * DocumentServiceImpl
 */
@Service
public class DocumentServiceImpl implements DocumentService	{

	@Autowired
	CommonDAO commonDAO;
	
	private Class clazz = Document.class;
	
	@Override
	public int createDocument(Document document) {
		commonDAO.save(document);
		return document.getId();
	}

	@Override
	public List<Document> getDocumentList(Document document) {
		String queryString = "select * from document where title = ? and author_id = ?";
		List<Document> documentList = commonDAO.getListWithQuery(queryString, document.getTitle(), document.getAuthorId());
		return documentList;
	}

	@Override
	public int deleteDocumentList(Document document) {
		String queryString = "delete from document where title = ? and author_id = ?";
		commonDAO.excuteQuery(queryString, document.getTitle(), document.getAuthorId());
		return 0;
	}

	@Override
	public Document getDocumentInfo(int id) {
		return commonDAO.get(clazz, id);
	}

	@Override
	public Document updateDocument(Document document) {
		commonDAO.update(document);
		return document;
	}

	@Override
	public int deleteDocument(int id) {
		Document document = new Document();
		document.setId(id);
		commonDAO.delete(document);
		return 1;
	}
}
