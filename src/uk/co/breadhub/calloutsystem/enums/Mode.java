package uk.co.breadhub.calloutsystem.enums;

import java.util.HashMap;
import java.util.Map;

public enum Mode {
    User(1, "Client Callout Window", "fxml/user.fxml",400, 800, false),
    Staff(2, "Staff Callout Window","fxml/staff.fxml",1200, 800, true),
    Largeboard(3, "Main Board","fxml/board.fxml",900, 800, false);

    private final int mode;
    private final String windowtitle;
    private final int width;
    private final int height;
    private final String fxmlfile;
    private final boolean dbDeleteAccess;

    // Reverse-lookup map for getting a day from an abbreviation
    private static final Map<Integer, Mode> lookup = new HashMap<Integer, Mode>();

    static {
        for (Mode m : Mode.values()) {
            lookup.put(m.getMode(), m);
        }
    }

    Mode(int mode, String windowtitle, String fxmlfile,int width, int height, boolean dbDeleteAccess) {
        this.mode = mode;
        this.windowtitle = windowtitle;
        this.width = width;
        this.height = height;
        this.fxmlfile = fxmlfile;
        this.dbDeleteAccess = dbDeleteAccess;
    }

    public int getMode() {
        return mode;
    }

    public String getWindowtitle() {
        return windowtitle;
    }

    public boolean isDbDeleteAccess() {
        return dbDeleteAccess;
    }

    public String getFxmlfile() {
        return fxmlfile;
    }

    public static Mode get(int mode) {
        return lookup.get(mode);
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

