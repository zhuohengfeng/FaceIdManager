package FaceIDManager.sdk;

public class FaceSDKHelp {

    private static FaceSDKHelp mInstance;

    private FaceSDKHelp() {}

    public static FaceSDKHelp getInstance() {
        if (mInstance == null) {
            synchronized (FaceSDKHelp.class) {
                if (mInstance == null) {
                    mInstance = new FaceSDKHelp();
                }
            }
        }
        return mInstance;
    }

    public String getText() {
        return "hello Ryan!";
    }
}
