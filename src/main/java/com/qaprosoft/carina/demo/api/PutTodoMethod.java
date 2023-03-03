package com.qaprosoft.carina.demo.api;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.qaprosoft.carina.core.foundation.api.AbstractApiMethodV2;
import com.qaprosoft.carina.core.foundation.api.annotation.Endpoint;
import com.qaprosoft.carina.core.foundation.api.annotation.RequestTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.ResponseTemplatePath;
import com.qaprosoft.carina.core.foundation.api.annotation.SuccessfulHttpStatus;
import com.qaprosoft.carina.core.foundation.api.http.HttpMethodType;
import com.qaprosoft.carina.core.foundation.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.Configuration;

@Endpoint(url = "${base_url}/todos/${todo_id}", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/todos/_put/rq.json")
@ResponseTemplatePath(path = "api/todos/_put/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutTodoMethod extends AbstractApiMethodV2  {

	public PutTodoMethod(int todoId, String title, String body, boolean completed) {
		replaceUrlPlaceholder("base_url", Configuration.getEnvArg("api_url"));
		replaceUrlPlaceholder("todo_id", Integer.toString(todoId));
		setHeaders("Content-Type=application/json");
		setRequestBody(String.format("{\"id\": %d, \"title\":\"%s\",\"completed\": %s, \"body\":\"%s\"}", todoId, title,
				Boolean.toString(completed), body));
	}
}