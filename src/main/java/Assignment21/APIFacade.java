package Assignment21;

import java.io.IOException;

public class APIFacade {
    private APIClient apiClient;

    public APIFacade(APIClient apiClient) {
        this.apiClient = apiClient;
    }

    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        try {
            String json = apiClient.getJsonFromApi(urlString);
            return apiClient.extractValueFromJson(json, attributeName);
        } catch (Exception e) {
            throw new IOException("Failed to get JSON from API", e);
        }

    }
}

