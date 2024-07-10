
import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<>();

    IDandPasswords() {
        logininfo.put("admin", "abcde");
        logininfo.put("user", "wxyz");
        logininfo.put("Rupercht", "deutch");
    }

    protected HashMap<String, String> getLogininfo() { //protected is used to restrict visiblity of a class, method or variable
        return logininfo;
    }

}
