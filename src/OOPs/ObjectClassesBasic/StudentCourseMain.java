package OOPs.ObjectClassesBasic;

public class StudentCourseMain {
    public static void main(String[] args) {
        //Object 1 created
        StudentDetails student1 = new StudentDetails();
        //Using method variables are assigned
        student1.getDetails("Tan", "tan@gmail.com", 875623415);

        CourseDetails course1 = new CourseDetails();
        //using ObjectRef , variables are assigned
        course1.courseName = "Python";
        course1.durationInMonths = 6;
        course1.startDate = "1May";

        PaymentDetails paymentDetails1 = new PaymentDetails();
        //using ObjectRef , variables are assigned
        paymentDetails1.modeOfPayment = "UPI";
        paymentDetails1.amount = 10000;

        //assign payment and course to student
        student1.payment = paymentDetails1;
        student1.course = course1;
        student1.display();

        //Object 2 created
        StudentDetails student2 = new StudentDetails();
        //Using method variables are assigned
        student2.getDetails("Mark", "mark@gmail.com", 786445329);

        CourseDetails course2 = new CourseDetails();
        //using ObjectRef , variables are assigned
        course2.courseName = "ManualTesting";
        course2.durationInMonths = 3;
        course2.startDate = "15May";

        PaymentDetails paymentDetails2 = new PaymentDetails();
        //using ObjectRef , variables are assigned
        paymentDetails2.modeOfPayment = "Card";
        paymentDetails2.amount = 5000;

        //assign payment and course to student
        student2.payment = paymentDetails2;
        student2.course = course2;
        student2.display();

        //Object 3 created
        StudentDetails student3 = new StudentDetails();
        //Using method variables are assigned
        student3.getDetails("John", "john@gmail.com", 978626754);

        CourseDetails course3 = new CourseDetails();
        //using ObjectRef , variables are assigned
        course3.courseName = "Automation";
        course3.durationInMonths = 6;
        course3.startDate = "1June";

        PaymentDetails paymentDetails3 = new PaymentDetails();
        //using ObjectRef , variables are assigned
        paymentDetails3.modeOfPayment = "Cash";
        paymentDetails3.amount = 15000;

        //assign payment and course1 to student
        student3.payment = paymentDetails3;
        student3.course = course3;
        student3.display();

    }
}
/*
O/p :
Name: Tan
Email: tan@gmail.com
Phone: 875623415
Course Name: Python
Course Duration : 6 Months
Start date : 1May
Payment Amount : 10000, Mode: UPI

Name: Mark
Email: mark@gmail.com
Phone: 786445329
Course Name: ManualTesting
Course Duration : 3 Months
Start date : 15May
Payment Amount : 5000, Mode: Card

Name: John
Email: john@gmail.com
Phone: 978626754
Course Name: Automation
Course Duration : 6 Months
Start date : 1June
Payment Amount : 15000, Mode: Cash

 */