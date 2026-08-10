class Login {
    private String password;

    Login(String password) {
        this.password = password;
    }

    public boolean checkPassword(String enteredPassword) {
        return password.equals(enteredPassword);
    }

    public static void main(String[] args) {
        Login user = new Login("Amit123");

        System.out.println(user.checkPassword("Amit123"));
        System.out.println(user.checkPassword("12345"));
    }
}