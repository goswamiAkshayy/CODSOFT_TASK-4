import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;

public class CurrencyConverter {

    // Method to get the exchange rate from the API (without using org.json library)
    public static double getExchangeRate(String baseCurrency, String targetCurrency) throws Exception {
        String apiKey = "123b4a6e8a583f3f4a56623f"; // Your provided API key
        String apiUrl = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + baseCurrency;

        // Make API call
        // Convert the string URL to a URI and then to a URL
        URL url = URI.create(apiUrl).toURL();
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode == 200) {
            // Read the response from the API
            Scanner scanner = new Scanner(url.openStream());
            StringBuilder inline = new StringBuilder();

            while (scanner.hasNext()) {
                inline.append(scanner.nextLine());
            }
            scanner.close();

            // Print the raw API response for debugging
            System.out.println("API Response: " + inline.toString());

            // Extract the conversion rate for the target currency
            String response = inline.toString();
            String searchKey = "\"" + targetCurrency + "\":";
            int startIndex = response.indexOf(searchKey) + searchKey.length();
            int endIndex = response.indexOf(",", startIndex);

            // Get the conversion rate as a substring and parse it into a double
            String conversionRateStr = response.substring(startIndex, endIndex).trim();
            return Double.parseDouble(conversionRateStr);
        } else {
            throw new Exception("API call failed with response code: " + responseCode);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get base currency from the user
        System.out.println("Enter base currency (e.g., USD): ");
        String baseCurrency = scanner.next().toUpperCase();

        // Get target currency from the user
        System.out.println("Enter target currency (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();

        // Get the amount the user wants to convert
        System.out.println("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        try {
            // Get the exchange rate
            double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

            // Convert the amount using the exchange rate
            double convertedAmount = amount * exchangeRate;

            // Display the converted amount
            System.out.printf("Converted amount: %.2f %s\n", convertedAmount, targetCurrency);
        } catch (Exception e) {
            // Handle any exceptions (such as API errors)
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
