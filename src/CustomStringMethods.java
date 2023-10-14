public class CustomStringMethods {
    public CustomStringMethods() {
    }

    // first method
    public boolean foundIn(String searchFor, String searchIn) {
        if (searchIn.indexOf(searchFor) >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // second Method
    public boolean longerThan(String myString, int maxLength) {
        if (myString.length() > maxLength) {
            return true;
        } else {
            return false;
        }
    }

    // third method
    public String funnyString(String str, int idx) {
        String c = str.substring(idx, idx + 1);
        String newStr = c + str + c;
        return newStr;
    }

    // fourth Method
    public String pigLatin(String orig) {
        String substring1 = orig.substring(0, 1);
        String substring2 = orig.substring(1);
        String substring3 = substring2 + substring1 + "ay";
        return substring3;
    }

    // bonus challenge!
    public String starBetween(String str) {
        int len = str.length();
        String newStr = "";
        for (int inx = 0; inx < str.length(); inx += 1) {
            newStr += str.substring(inx, inx + 1) + "*";
        }
        newStr = newStr.substring(0, newStr.length() - 1);
        return newStr;
    }
}
