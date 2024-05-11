package OOPs;

public class StudentDetails {
    String studentName;
    String emailAddress;
    int phone;
    PaymentDetails payment;
    CourseDetails course;

    void getDetails(String stuName,String email,int ph){  //local variable within function
        studentName=stuName;
        emailAddress=email;
        phone=ph;
    }

    void display() {
        System.out.println(
                "Name: " + this.studentName + "\n" +
                "Email: "+ this.emailAddress + "\n" +
                "Phone: "+ this.phone + "\n" +
                "Course Name: "+ this.course.courseName + "\n" +
                "Course Duration : " + this.course.durationInMonths  + " Months \n" +
                "Start date : "  + this.course.startDate + " \n" +
                "Payment Amount : " + this.payment.amount + ", Mode: " + this.payment.modeOfPayment  + "\n"

        );
    }
}
