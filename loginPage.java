import java.util.HashMap;

public class loginPage implements ActionListener{
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    loginPage(HashMap<String, String> realLoginInfo){
        loginInfo = realLoginInfo;        
    }
}
