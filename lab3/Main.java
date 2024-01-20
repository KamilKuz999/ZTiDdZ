import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Your password : " + password());
    }

    public static String password(){
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specials = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
        String password = "";
        Random random = new Random();

        password += (upper.charAt(random.nextInt(upper.length())));
        password += (lower.charAt(random.nextInt(lower.length())));
        password += (digits.charAt(random.nextInt(digits.length())));
        password += (specials.charAt(random.nextInt(specials.length())));

        for(int i = password.length(); i < 8; i++){
            String all = upper + lower + digits + specials;
            password += (all.charAt(random.nextInt(all.length())));
        }

        // mixing array elements
        char[] passwordChars = password.toCharArray();
        for(int i = passwordChars.length - 1; i > 0; i--){

            int index = random.nextInt(i + 1);

            char temp = passwordChars[index];
            passwordChars[index] = passwordChars[i];
            passwordChars[i] = temp;
        }

        return new String(passwordChars);
    }
}

