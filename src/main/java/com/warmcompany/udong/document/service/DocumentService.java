package com.warmcompany.udong.document.service;

import java.util.List;

import com.warmcompany.udong.document.model.Document;

/**
 * 2015. 12. 25.
 * Copyright by joyhan / HUFS
 * DocumentService
 */
public interface DocumentService {
	public int createDocument(Document document);
	public List<Document> getDocumentList(Document document);
	public int deleteDocumentList(Document document);
	public Document getDocumentInfo(int id);
	public Document updateDocument(Document document);
	public int deleteDocument(int id);
}
