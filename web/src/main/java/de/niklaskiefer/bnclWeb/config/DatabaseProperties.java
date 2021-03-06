package de.niklaskiefer.bnclWeb.config;

public class DatabaseProperties {
    public static final String TEST_DB_URL = "localhost";
    public static final String TEST_DB_DATABASE_NAME = "bncl";

    /**
     * Returns the url.
     */
    public static String getUrl() {
        System.out.println(System.getProperty("url"));
        if (System.getProperty("url") != null) {
            return System.getProperty("url");
        }

        return TEST_DB_URL;
    }

    /**
     * Returns the database.
     */
    public static String getDatabase() {
        if (System.getProperty("database") != null) {
            return System.getProperty("database");
        }

        return TEST_DB_DATABASE_NAME;
    }
}