package uz.asakabank;


public class History {
    public static void main(String[] args) {
        String agility = "\"Agility\" in the context of Java development refers to the capability of Java teams to " +
                "respond rapidly to changing business needs, technological shifts, and user feedback through flexible, " +
                "iterative development";


        System.out.println(agility);

        String java = "Java is a blend of the best elements of its rich heritage combined with the\n" +
                "innovative concepts required by its unique mission.";


        System.out.println(java);

        /**
         * Java's linage
         */
        String predecessors = "Java is related to C++, which is a direct descendant of C. Much of the character of Java is" +
                "inherited from these two languages. From C, Java derives its syntax. Many of Java’s object-" +
                "oriented features were influenced by C++.";

        String  impetus = "the original impetus for Java was  the need for a platform-independent";

        String why_c_is_not = "https://stackoverflow.com/questions/41834492/why-was-c-not-made-a-platform-independent-language";


        System.out.println(predecessors);

        System.out.println(impetus);
        System.out.println(why_c_is_not);

        String reason_to_lang_to_exist = "to adapt to changes in environment and to implement advances in the art of programming";


        System.out.println(reason_to_lang_to_exist);

        String java_solved_internet_issues = "ava also addressed some of the thorniest issues\n" +
                "associated with the Internet: portability and security.";

        String applet = "An applet is a special kind of Java program that is designed to be transmitted over the Internet\n" +
                "and automatically executed by a Java-compatible web browse";


        System.out.println(java_solved_internet_issues);

        System.out.println(applet);

        String applet_in_essence = "the applet allows some functionality to\n" +
                "be moved from the server to the client.";

        System.out.println(applet_in_essence);


        String malcious_program = "malicious code can cause its damage because\n" +
                "it has gained unauthorized access to system resources.";

        String secure = " In order for Java to\n" +
                "enable applets to be downloaded and executed on the client computer safely, it was necessary\n" +
                "to prevent an applet from launching such an attack.\n" +
                "Java achieved this protection by confining an applet to the Java execution environment\n" +
                "and not allowing it access to other parts of the computer.";


        System.out.println(malcious_program);

        System.out.println(secure);


        String bytcode = "Java compiler is not executable code. Rather, it is bytecode. Bytecode is\n" +
                "a highly optimized set of instructions designed to be executed by the Java run-time system,\n" +
                "which is called the Java Virtual Machine ";


        System.out.println(bytcode);


        String rmi = "Java also supports Remote Method Invocation (RMI). This feature enables a program to\n" +
                "invoke methods across a network.\n";

        System.out.println(rmi);

    }
}