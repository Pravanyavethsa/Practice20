package ass20;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidity {
    String fname;
    String lname;
    String email;
    String mobile;

    public UserValidity(String fname, String lname, String email, String mobile) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.mobile = mobile;
    }

    public boolean checkFname() {
        Pattern fnamePattern = Pattern.compile("^[A-Z][A-za-z]{3,}");
        Matcher fnameMatcher = fnamePattern.matcher("" + fname + "");
        boolean fnameOk = fnameMatcher.matches();
        return fnameOk;
    }

    public boolean checkLname() {
        Pattern lnamePattern = Pattern.compile("^[A-Z][A-za-z]{3,}");
        Matcher lnameMatcher = lnamePattern.matcher("" + fname + "");
        boolean lnameOk = lnameMatcher.matches();
        return lnameOk;
    }

    public boolean checkEmail() {
        Pattern emailPattern = Pattern.compile("^abc([.]xyz)*@gmail[.]com");
        Matcher emailMatcher = emailPattern.matcher("" + email + "");
        boolean emailOk = emailMatcher.matches();
        return emailOk;
    }

    public boolean checkMobile(){
        Pattern mobilePattern=Pattern.compile("91 [0-9]{10}");
        Matcher mobileMatcher= mobilePattern.matcher(""+ mobile + "");
        boolean mobileOk=mobileMatcher.matches();
        return mobileOk;
    }
}




