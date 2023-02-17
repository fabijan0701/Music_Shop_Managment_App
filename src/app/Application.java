package app;

enum Mode{
    ADMIN,
    STORE_MANAGER,
    EMPLOYEE
}

public final class Application {
    private static Mode mode;

    public static Mode getMode() {
        return mode;
    }

    public static void setMode(Mode m) {
        Application.mode = m;
    }
}
