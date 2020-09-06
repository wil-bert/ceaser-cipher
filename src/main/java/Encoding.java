public class Encoding {
    private int mKey;
    private String mInputText;

    public Encoding(String inputText, int Key) {
        mKey = Key;
        mInputText = inputText;
    }

    public String getInputText() {
        return mInputText;
    }

    public int getKey() {
        return mKey;
    }
}
//    public boolean isValidInputText() {
//        char[] chars = mInputText.toCharArray();
//
//        for (char c : chars) {
//    }
//}
