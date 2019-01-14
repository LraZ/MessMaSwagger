package io.swagger.client;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

import io.swagger.client.api.AdminsApi;
import io.swagger.client.api.DevelopersApi;
import io.swagger.client.model.AccessPoint;

public class AdminsApiExample {
    public static void main(String[] args) {
        AdminsApi apiInstance = new AdminsApi();
        AccessPoint accessPoint = new AccessPoint(); // AccessPoint | AccessPoint to add
        try {
            List<AccessPoint> result = apiInstance.addNewAccessPoint(accessPoint);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdminsApi#addNewAccessPoint");
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
