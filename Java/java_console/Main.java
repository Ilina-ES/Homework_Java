import java.util.Scanner;
import org.json.*;

public class Main {
    public static void main(String[] args) {
            System.out.println("java in console");
            jsonParser();
        }

    public static void jsonParser() {
        var jsonStr = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "  {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "  {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";


        var jsonArray = new JSONArray(jsonStr);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);

            var rowStr = String.format("Студент %s получил %s по предмету %s.",
                    jsonObject.getString("фамилия"),
                    jsonObject.getString("оценка"),
                    jsonObject.getString("предмет")
            );

            System.out.println(rowStr);
        }
    }
}
