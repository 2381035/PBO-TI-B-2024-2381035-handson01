public class TipeDataString {
    public static void main(String[] args) {
        String firstName = "Ryo";
        String lastName = "Yuangga";
        String fullName = firstName + " " + lastName;
        //System.out.println(firstName + " " + lastName);
       // System.out.println(firstName.concat( lastName));
        //System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());
       // System.out.println(fullName.charAt(6));
        System.out.println(fullName.contains("Yuangga"));
    }
}
