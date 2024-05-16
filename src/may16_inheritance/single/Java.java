package may16_inheritance.single;

public class Java extends Programming{


    String newFeature;
    int version;
    String author;

    public Java() {
        System.out.println("DC");
    }

    public Java(String newFeature) {
        this.newFeature = newFeature;
    }

    void printInfo() {
        System.out.println("Feature is -> " + this.newFeature);
        bhk3();

    }

}
