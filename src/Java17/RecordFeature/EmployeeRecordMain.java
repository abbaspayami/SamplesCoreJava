package Java17.RecordFeature;

public class EmployeeRecordMain {
    public static void main(String[] args) {
        EmployeeRecord record = new EmployeeRecord.Builder()
                .setName("Riaz")
                .setFamily("farhanian")
                .setAge(40)
                .build();
        System.out.println(record);
    }
}
