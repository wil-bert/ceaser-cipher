public class Decoding {
    private int mKey;
    private String mInputText;

    public  Decoding(int Key, String inputText) {
        mKey = Key;
        mInputText = inputText;
    }
    public String getInputText() {
        return  mInputText;
    }

    public int getKey() {
        return mKey;
    }
}
