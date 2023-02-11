import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {
    public static void main(String[] args) {
        //String strJson = jsonParser.getJSONFromFile("C:/Users/xxx/Desktop/myjson.json");
        System.out.println();
        String strJson = jsonParser.getJSONFromURL("https://raw.githubusercontent.com/asztam/mobile_technologies/main/myUrlJson.json");
        System.out.println("******Showing the raw json form the source******");
        System.out.println();
        System.out.println(strJson);
        System.out.println();
        System.out.println("******Printing the processed json******");
        try {
            JSONParser parser = new JSONParser();
            Object object = parser.parse(strJson);
            JSONObject mainJsonObject = (JSONObject) object;

            String firstName = (String) mainJsonObject.get("firstName");
            System.out.println("First Name : " + firstName);

            String lastName = (String) mainJsonObject.get("lastName");
            System.out.println("Last Name : " + lastName);

            long age = (long) mainJsonObject.get("age");
            System.out.println("Age : " + age);

            JSONObject jsonObjectAddress = (JSONObject) mainJsonObject.get("address");
            System.out.println("Address : ");

            String streetAddress = (String) jsonObjectAddress.get("streetAddress");
            System.out.println("      Street Address : " + streetAddress);

            String city = (String) jsonObjectAddress.get("city");
            System.out.println("      City : " + city);

            String state = (String) jsonObjectAddress.get("state");
            System.out.println("      State : " + state);

            long postalCode = (long) jsonObjectAddress.get("postalCode");
            System.out.println("      Postal Code : " + postalCode);

            JSONArray jsonArrayPhoneNumbers = (JSONArray) mainJsonObject.get("phoneNumbers");
            System.out.println("Phone Numbers : ");

            for (int i = 0; i < jsonArrayPhoneNumbers.size(); i++) {
                JSONObject jsonPhoneNumber = (JSONObject) jsonArrayPhoneNumbers.get(i); //kolejny obiekt z list
                System.out.println("      Phone Number " + (i + 1)); //numer obiektu

                String type = (String) jsonPhoneNumber.get("type"); //wartosc spod klucza
                System.out.println("      Type : " + type);

                String number = (String) jsonPhoneNumber.get("number"); //wartosc spod klucza
                System.out.println("      Number : " + number);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
