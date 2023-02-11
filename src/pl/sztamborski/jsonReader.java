package pl.sztamborski;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class jsonReader {

    public static String getJSONFromFile(String filename){
        StringBuilder jsonText = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText.append(line).append("\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonText.toString().toString();
    }

    public static String getJSONFromURL(String strUrl) {
        StringBuilder jsonText = new StringBuilder();

        try {
            URL url = new URL(strUrl); //to connect to the url
            InputStream is = url.openStream();

            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonText.append(line).append("\n");
            }

            is.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return jsonText.toString();
    }
}