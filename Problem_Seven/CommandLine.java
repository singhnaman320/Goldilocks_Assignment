public class CommandLine {

    public static void main(String[] args) {

        if (args.length > 0){

            System.out.println("command line inputs are:");

            for (String value: args){

                System.out.println(value);
            }
        }else{

            System.out.println("unable to find input");
        }
    }
}

/*
    CommandLine Input to access:
    javac CommandLine.java
    java CommandLine Hello --> Hello is argument you want to provide
*/