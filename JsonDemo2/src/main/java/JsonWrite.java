import org.json.JSONArray;

import javax.json.Json;
import javax.json.stream.JsonGenerator;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class JsonWrite {
    public static void main(String[] args) throws FileNotFoundException {
        OutputStream fos = new FileOutputStream("sample.json");
        JsonGenerator jsonGenerator = Json.createGenerator(fos);
        Employee emp = JsonWrite.createEmployee();
        jsonGenerator.writeStartObject();//{

        jsonGenerator.write("id", emp.getId()); // "id":123
        jsonGenerator.write("name", emp.getName());
        jsonGenerator.write("role", emp.getRole());
        jsonGenerator.writeEnd(); // }

        jsonGenerator.close();
    }

    private static Employee createEmployee() {
        Employee emp = new Employee();
        emp.setData(new String[] {});
        emp.setId(100);
        emp.setName("David");
        emp.setRole("Manager");
        return emp;
    }
}
