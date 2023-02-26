package com.qaprosoft.carina.demo.api;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JsonPlaceholderApiClient {

    private static final Logger LOGGER = LogManager.getLogger(JsonPlaceholderApiClient.class);
    private static final String TODO_ENDPOINT = "https://jsonplaceholder.typicode.com/todos";

    public static String getTodoListJson() throws URISyntaxException, IOException {
        URI uri = new URI(TODO_ENDPOINT);
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(uri);
        HttpResponse response = client.execute(request);
        HttpEntity entity = response.getEntity();
        String json = EntityUtils.toString(entity);
        return json;
    }

    public static void main(String[] args) throws Exception {
        String todoListJson = getTodoListJson();
        LOGGER.info(todoListJson);
    }
}

