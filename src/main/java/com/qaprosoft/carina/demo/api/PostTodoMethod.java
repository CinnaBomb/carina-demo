package com.qaprosoft.carina.demo.api;

import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/todos", methodType = HttpMethodType.POST)
@RequestTemplatePath(path = "api/todos/_post/rq.json")
@ResponseTemplatePath(path = "api/todos/_post/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PostTodoMethod extends AbstractApiMethodV2 {

	public PostTodoMethod(int userId, String title, boolean completed) {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
		setHeaders("Content-Type=application/json");
		setRequestBody(String.format("{\"userId\": %d, \"title\":\"%s\",\"completed\": %s}", userId, title,
				Boolean.toString(completed)));
	}
}