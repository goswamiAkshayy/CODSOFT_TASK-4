#                                  CurrencyConverter
<br/>

**Task-4: CURRENCY CONVERTER**
<br/>

**Language: Java**
<br/>

**IDE: vsCode**
<br/>

**The CurrencyConverter.java file is a Java program that provides functionality to convert currency using an external exchange rate API. Here is a summary of the key components:**
<br/>

Imports: The file imports java.net.URL and java.util.Scanner.
<br/>
Class Definition: The main class is CurrencyConverter.
<br/>
Method getExchangeRate:
<br/>
Takes baseCurrency and targetCurrency as parameters.
<br/>
Constructs an API URL using a provided API key.
Makes a GET request to the API and reads the response.
Extracts and prints the exchange rate for the target currency.
Handles API call failures by throwing exceptions.
<br/>
Main Method:
Uses Scanner to get input from the user.
Prompts user for base currency.

<br/>

**DECRIPTION**
<br/>

The CurrencyConverter program is a Java application designed to convert an amount from one currency to another using real-time exchange rates obtained from an external API.
<br/>

***Key Features:***
<br/>

API Integration: Connects to the Exchange Rate API to fetch the latest exchange rates.
<br/>
User Input: Prompts the user to input the base currency, target currency, and the amount to be converted.
<br/>
Exchange Rate Calculation: Fetches and parses the exchange rate for the target currency from the API response.
<br/>
Conversion Calculation: Multiplies the input amount by the obtained exchange rate to compute the converted amount.
<br/>
Error Handling: Handles potential exceptions, such as API call failures, and informs the user of any errors.
<br/>


***Usage:***
<br/>

The user is prompted to enter the base currency (e.g., USD).
<br/>
The user is then prompted to enter the target currency (e.g., EUR).
<br/>
The user enters the amount to be converted.
<br/>
The program fetches the exchange rate, performs the conversion, and displays the converted amount.
<br/>
The program provides a simple way to perform currency conversions using real-time data from an exchange rate API.
<br/>

# PROJECT VIDEO
