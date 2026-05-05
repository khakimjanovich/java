package uz.asakabank;


public class B_Overview {
    public static void main(String[] args) {
        String twoParadigms = "Some programs  are written around “what is happening” and others are written around"
                + "“who is being affected.”";

        String whatIsHappening = "The first way is called the process-oriented model";

        String processOrientedModel = "This approach characterizes a program as a series of\n" +
                "linear steps (that is, code). The process-oriented model can be thought of as code acting on\n" +
                "data. Procedural languages such as C employ this model to considerable success.";

        System.out.println(twoParadigms);
        System.out.println(whatIsHappening);
        System.out.println(processOrientedModel);

        String whoIsBeingAffected = "To manage increasing complexity, the second approach, called object-oriented programming,\n" +
                "was conceived";


        System.out.println(whoIsBeingAffected);

        String oop = "Object-oriented programming organizes a program around its data (that is,\n" +
                "objects) and a set of well-defined interfaces to that data. An object-oriented program can\n" +
                "be characterized as data controlling access to code. ";

        System.out.println(oop);


        String threePrincipleOfOOP = "All object-oriented programming languages provide mechanisms that help you implement\n" +
                "the object-oriented model. They are encapsulation, inheritance, and polymorphism. Let’s\n" +
                "take a look at these concepts now.";

        String encapsulation = "Encapsulation is the mechanism that binds together code and the data it manipulates, and\n" +
                "keeps both safe from outside interference and misuse.";

        String basisOfEnc = "In Java, the basis of encapsulation is the class \n" +
                "A class defines the structure and behavior (data and code) that will be shared by a set of objects.";

        System.out.println(threePrincipleOfOOP);
        System.out.println(encapsulation);
        System.out.println(basisOfEnc);


        String accessModifier = "When a class member is preceded by public, then that member\n" +
                "may be accessed by code outside the class in which it is declared  (The opposite of public is \n" +
                "private, which prevents a member from being used by code defined outside of its class.)";

        String publicMain = "main( ) must be declared as public, since it must be called by code outside of its\n" +
                "class when the program is started";

        String staticKeyword = "The keyword static allows main( ) to be called without\n" +
                "having to instantiate a particular instance of the class. This is necessary since main( ) is\n" +
                "called by the Java Virtual Machine before any objects are made";

        String voidKeyword = "The keyword void simply\n" +
                "tells the compiler that main( ) does not return a value. ";


    }
}