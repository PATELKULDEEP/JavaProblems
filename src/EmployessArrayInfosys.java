public class EmployessArrayInfosys {

    public static void main(String[] args) {
        double salary[] = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        employeeRecord(salary);
    }

    public static void employeeRecord(double[] salary){

        double avg = 0;
        double sum = 0;
        int n = salary.length;
        int aboveAvg = 0;
        int belowAvg = 0;
        for(int i=0;i<n;i++){

            sum += salary[i];

        }
        avg = sum/n;
        for(int i=0;i<n;i++){
            if(salary[i] > avg){
                aboveAvg++;
            }
        }

        belowAvg = n-aboveAvg;

        System.out.println("The average salary of the employee is : "+avg);
        System.out.println("The number of employees having salary greater than the average is : "+ aboveAvg);
        System.out.println("The number of employees having salary lesser than the average is : "+ belowAvg);


    }


}
