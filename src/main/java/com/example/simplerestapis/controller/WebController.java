package com.example.simplerestapis.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.simplerestapis.models.SampleResponse;
import com.example.simplerestapis.models.OneItemResponse;
import com.example.simplerestapis.models.PostRequest;
import com.example.simplerestapis.models.PostSearchRequestByYearAndCategory;
import com.example.simplerestapis.models.PostResponse;
import com.example.simplerestapis.models.RequestOneItemFromDatabase;


@RestController
public class WebController {

	@RequestMapping("/item")
	public OneItemResponse Sample(@RequestParam(value = "idx", defaultValue = "0") int idx) {
		RequestOneItemFromDatabase reuquestoneitem = new RequestOneItemFromDatabase();
		JSONObject oneitem = reuquestoneitem.getDataByIdx(idx);
		
		OneItemResponse response = new OneItemResponse();
		response.setCategory((String)oneitem.get("category"));
		response.setEntity((String)oneitem.get("entity"));
		response.setWinner((boolean)oneitem.get("winner"));
		response.setYear((int)oneitem.get("year"));
		return response;
	}
	
	@RequestMapping("/sample")
	public SampleResponse Sample(@RequestParam(value = "name",
	defaultValue = "Robot") String name) {
		SampleResponse response = new SampleResponse();
		response.setId(1);
		response.setMessage("Your name is "+name);
		return response;
	}
	
//	@RequestMapping(value = "/search", method = RequestMethod.POST)
//	public OneItemResponse Test(@RequestBody SearchPostRequest inputPayload) {
//		PostResponse response = new PostResponse();
//		response.setId(inputPayload.getId()*100);
//		response.setMessage("Hello " + inputPayload.getName());
//		response.setExtra("Some text");
//		return response;
//	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public OneCategoryResponse Test(@RequestBody PostSearchRequestByYearAndCategory inputPayload) {
		
		OneCategoryResponse full_response = new OneCategoryResponse();
		response.setCategory((String)oneitem.get("category"));
		full_response.setEntity((String)oneitem.get("entity"));
		response.setWinner((boolean)oneitem.get("winner"));
		full_response.setYear((int)oneitem.get("year"))ADEDDDEE;
		
		ADEDDDEEPostResponse response = new PostResponse();
		response.setId(inputPayload.getId()*100);
		response.setMessage("Hello " + inputPayload.getName());
		response.setExtra("Some text");
		return responseADEDDDEE;
	}
}















