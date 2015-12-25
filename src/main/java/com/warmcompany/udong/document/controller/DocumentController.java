package com.warmcompany.udong.document.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Maps;
import com.warmcompany.udong.common.ResultMapGenerator;
import com.warmcompany.udong.document.model.Document;
import com.warmcompany.udong.document.service.DocumentService;

/**
 * 2015. 12. 25.
 * Copyright by joyhan / HUFS
 * DocumentController
 */
@Controller
@RequestMapping(value = "/documents")
public class DocumentController {
	@Autowired
	DocumentService documentService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> createDocument(Document param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int createdId = documentService.createDocument(param);
		
		if(createdId < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("board", param);
		}
		
		return resultMap;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseBody
	public Map<String, Object> updateDocument(@PathVariable(value="id")int id, Document param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		param.setId(id);
		documentService.updateDocument(param);
		
		ResultMapGenerator.putSuccessCode(resultMap);
		resultMap.put("document", param);

		return resultMap;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> getDocument(@PathVariable(value = "id")int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		Document document = documentService.getDocumentInfo(id);
		if(document == null)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("document", document);
		}
		
		return resultMap;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String, Object> deleteDocument(int id)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int deletedRow = documentService.deleteDocument(id);
		if(deletedRow < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("deletedRow", deletedRow);
		}
		return resultMap;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Map<String, Object> getDocumentList(Document param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		List<Document> documentList = documentService.getDocumentList(param);
		if(documentList == null)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("documentList", documentList);
		}
		
		return resultMap;
	}
	
	public Map<String, Object> deleteDocumentList(Document param)	{
		Map<String, Object> resultMap = Maps.newHashMap();
		
		int deletedRow = documentService.deleteDocumentList(param);
		if(deletedRow < 0)	{
			ResultMapGenerator.putErrorCode(resultMap);
		} else	{
			ResultMapGenerator.putSuccessCode(resultMap);
			resultMap.put("deletedRow", deletedRow);
		}
		return resultMap;
	}
	
}
