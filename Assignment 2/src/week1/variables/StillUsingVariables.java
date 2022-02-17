package week1.variables;

public class StillUsingVariables {
    String name;
    int gradYear;

    public String StillUsingVariables(String myName, int graduationYear){
        name = myName;
        gradYear = graduationYear;
        String result = String.format("My name is %s and I'll graduate in %d", myName, graduationYear);
        return result;

    // My name is Juan Valdez and I'll graduate in 2010.
    }

    public static void main(String[] args){
        StillUsingVariables myself = new StillUsingVariables();
        System.out.println(myself.StillUsingVariables("Helena", 2023));

    }
}
