import java.util.HashMap;
public class loginData {
    static HashMap<String, String> loginInfo;

    loginData(){
        loginInfo = new HashMap<String, String>();
        loginInfo.put("Admin","123");
        loginInfo.put("User","124");
    }
    static HashMap getLoginInfo(){
        return loginInfo;
    }

}
