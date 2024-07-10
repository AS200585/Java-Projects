public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        IDandPasswords idandpasswords = new IDandPasswords();

        // Create a new LoginPage object using the login information retrieved from the idandpasswords object
        LoginPage loginPage = new LoginPage(idandpasswords.getLogininfo());
    }
}
