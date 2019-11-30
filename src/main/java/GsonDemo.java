import com.google.gson.Gson; 


public class GsonDemo {

    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.setEmpId(101);
        emp.setEmpName("Bill");
        emp.setCompanyName("Google");

        Gson gson = new Gson();
        String empJson = gson.toJson(emp);

        System.out.println(empJson);  //serialized output of converted java

        Employee emp1 = gson.fromJson(empJson, Employee.class);  //deserialized output of json object


        System.out.println("Emp id: " + emp1.getEmpId() + " Emp Name: " + emp1.getEmpName() + 
        " Company Name: " + emp1.getCompanyName());  

    }

}
