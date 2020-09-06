public class Encoding {
    private  int mKey;
    private String mInputText;

    public Encoding(String inputText, int Key) {
        mKey = Key;
        mInputText = inputText;
    }
    public String getInputText(){
        return  mInputText;
    }
    public int getKey() {
        return mKey;
    }
    public boolean isValidInputText() {
        char[] chars = mInputText.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c) && c != ' ') {
                return  false;
            }
        }
        return  true;
    }

    public boolean isNotEmpty() {
        return  !mInputText.trim().isEmpty();
    }
    public boolean isValidKey(){
        return mKey >1 && mKey <26;
    }

    String encode(){
        StringBuilder encoded = new StringBuilder();
        String[] encodedArray = mInputText.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length;i++) {
            if(mInputText.charAt(i) == ' '){
                encoded.append(" ");
            }
            else {
                int charPosition = alphabet.indexOf(mInputText.charAt(i));
                int Key = (mKey + charPosition) % 26;
                encoded.append(alphabet.charAt(Key));
            }
        }
        return encoded.toString().toUpperCase();
    }
}
