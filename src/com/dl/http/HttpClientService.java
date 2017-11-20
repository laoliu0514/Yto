package com.dl.http;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.sun.org.apache.regexp.internal.RE;




public class HttpClientService {


  
    private static CloseableHttpClient httpClient=HttpClients.createDefault();

 
    private static RequestConfig requestConfig = RequestConfig.custom()
            .setSocketTimeout(5000)  
            .setConnectTimeout(5000)  
            .setConnectionRequestTimeout(500)
            .setStaleConnectionCheckEnabled(true)
            .build();  

    /**
     * 执行get请求
     * 
     * @param url
     * @return
     * @throws Exception
     */
    public static String doGet(String url,Map<String, String> params,String encode) throws Exception {
        if(null != params){
            URIBuilder builder = new URIBuilder(url);
            for (Map.Entry<String, String> entry : params.entrySet()) {
                builder.setParameter(entry.getKey(), entry.getValue());
            }
            url = builder.build().toString();
        }
        // 创建http GET请求
        HttpGet httpGet = new HttpGet(url);
        httpGet.setConfig(requestConfig);
        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpClient.execute(httpGet);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                if(encode == null){
                    encode = "UTF-8";
                }
                return EntityUtils.toString(response.getEntity(), encode);
            }
        } finally {
            if (response != null) {
                response.close();
            }
            // 此处不能关闭httpClient，如果关闭httpClient，连接池也会销毁
        }
        return null;
    }
    
    public static String doGet(String url, String encode) throws Exception{
        return doGet(url, null, encode);
    }
    
    public static String doGet(String url) throws Exception{
        return doGet(url, null, null);
    }

    /**
     * 带参数的get请求
     * 
     * @param url
     * @param params
     * @return
     * @throws Exception
     */
    public static String doGet(String url, Map<String, String> params) throws Exception {
        return doGet(url, params, null);
    }

    /**
     * 执行POST请求
     * 
     * @param url
     * @param params
     * @return
     * @throws Exception
     */
    public static String doPost(String url, Map<String, String> params,String encode) throws Exception {
        // 创建http POST请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.setConfig(requestConfig);
        if (null != params) {
            // 设置2个post参数，一个是scope、一个是q
            List<NameValuePair> parameters = new ArrayList<NameValuePair>(0);
            for (Map.Entry<String, String> entry : params.entrySet()) {
                parameters.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }

            // 构造一个form表单式的实体
            UrlEncodedFormEntity formEntity = null;
            
            
            if(encode!=null){
                formEntity = new UrlEncodedFormEntity(parameters,encode);
            }else{
                formEntity = new UrlEncodedFormEntity(parameters);
                
            }
            // 将请求实体设置到httpPost对象中
            
            httpPost.setEntity(formEntity);
        }

        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpClient.execute(httpPost);
           
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
            	String responseStr=EntityUtils.toString(response.getEntity(), "UTF-8");
            	System.out.println("===="+responseStr);
                return responseStr;
            }
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return null;
    }


    /**
     * 执行POST请求
     * 
     * @param url
     * @param params
     * @return
     * @throws Exception
     */
    public static String doPost(String url, Map<String, String> params) throws Exception {
        // 创建http POST请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.setConfig(requestConfig);

        if (null != params) {
            // 设置2个post参数，一个是scope、一个是q
            List<NameValuePair> parameters = new ArrayList<NameValuePair>(0);
            for (Map.Entry<String, String> entry : params.entrySet()) {
                parameters.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
            }

            // 构造一个form表单式的实体
            UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(parameters);
            // 将请求实体设置到httpPost对象中
            httpPost.setEntity(formEntity);
        }

        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpClient.execute(httpPost);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                return EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return null;
    }

    public static String doPostJson(String url, String json) throws Exception {
        // 创建http POST请求
        HttpPost httpPost = new HttpPost(url);
        httpPost.setConfig(requestConfig);
        
        if(null != json){
            //设置请求体为 字符串
            StringEntity stringEntity = new StringEntity(json,"UTF-8");
            httpPost.setEntity(stringEntity);
        }

        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpClient.execute(httpPost);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                return EntityUtils.toString(response.getEntity(), "UTF-8");
            }
        } finally {
            if (response != null) {
                response.close();
            }
        }
        return null;
    }

	

}
