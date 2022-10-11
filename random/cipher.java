class cipher {
    public static void main(String[] args) {
        System.out.print("Input Message:");
        String message = System.console().readLine();
        System.out.print("Input Key:");
        int key = Integer.parseInt(System.console().readLine());

        String result = encrypt(message,key);

        System.out.print(result);
    }
    
    public static String encrypt(String message, int key) {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result = "";
        
        message = message.toUpperCase();
        
        for (int i = 0; i <= message.length()-1; i++) {
            if (alphabet.indexOf(message.charAt(i)) == -1) {
                result = result + message.charAt(i);
                continue;
            }
            int pos = alphabet.indexOf(message.charAt(i));
            result = result + String.valueOf(alphabet.charAt(pos+key));
        }
        return result;
    }
}
