public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        //LoginTest loginTest1 = new LoginTest();
       // loginTest1.login();
//        WishListTest wishList  = new WishListTest();
//        wishList.addWishList();
        RegisterTest reg = new RegisterTest();
        reg.register();



    }
}
