public class DataTypes {
    public static void main(String[] args) {

        int n = 1234567890;

        long nL = 12345617890L;

        double nD = 123.4568128953;
        float nF = 123.456F;

        var salary = 1000; //int
        //pension 3%
        var pension = salary*0.03; //double
        var totalsalary = salary - pension;
        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalsalary);

        var employeeName = "Sergio Lozano";
        System.out.println("employee: " + employeeName + " salary: " + totalsalary);
    }
}
