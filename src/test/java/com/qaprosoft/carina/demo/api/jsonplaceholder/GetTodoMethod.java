package com.qaprosoft.carina.demo.api.jsonplaceholder;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.response.Response;

@Endpoint(url = "${base_url}/todo", methodType = HttpMethodType.GET)
@RequestTemplatePath(path = "api/jsonplaceholder/_get/rq.json")
@ResponseTemplatePath(path = "api/jsonplaceholder/_get/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class GetTodoMethod extends AbstractApiMethodV2 {

	private static final Logger LOGGER = LogManager.getLogger(GetTodoMethod.class);

	public GetTodoMethod() {
		super("api/jsonplaceholder/_get/rq.json", "api/jsonplaceholder/_get/rs.json");
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
	}

	public Response callAPI() {
		setURL(getEndpoint());
		setHeaders("Content-Type=application/json");
		setHttpMethod("GET");
		Response response = super.callAPI();
		LOGGER.info("API response: {}", response.getBody().prettyPrint());
		return response;
	}

	public void expectResponseStatus(int responseStatus) {
		validateResponseStatus(responseStatus);
	}

	private String getEndpoint() {
		return Configuration.getEnvArg("api_url") + "/todo";
	}

	public String getResponseBody() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

