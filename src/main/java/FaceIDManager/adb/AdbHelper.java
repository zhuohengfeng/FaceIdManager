package FaceIDManager.adb;

public class AdbHelper {

    private static AdbHelper mInstance;

    private AdbHelper() {}

    public static AdbHelper getInstance() {
        if (mInstance == null) {
            synchronized (AdbHelper.class) {
                if (mInstance == null) {
                    mInstance = new AdbHelper();
                }
            }
        }
        return mInstance;
    }

    public String getText() {
        return "hello adb!";
    }
}
