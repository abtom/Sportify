package gspot.com.sportify.utils;

import gspot.com.sportify.BuildConfig;

/**
 * Created by patrickhayes on 4/20/16.
 * Constants class store most important strings and paths of the app
 */

public class Constants {

    /*Constants for FireBase */


    public static final String PASSWORD_PROVIDER = "password";
    public static final String FIREBASE_PROPERTY_EMAIL = "email";
    public static final String FIREBASE_LOCATION_PROFILES = "profiles";
    public static final String FIREBASE_LOCATION_USERS = "users";
    public static final String FIREBASE_LOCATION_USER_LISTS = "userLists";
    public static final String FIREBASE_LOCATION_USER_FRIENDS = "userFriends";

    public static final String FIREBASE_URL = BuildConfig.UNIQUE_FIREBASE_ROOT_URL;
    public static final String FIREBASE_URL_PROFILES = FIREBASE_URL + "/" + FIREBASE_LOCATION_PROFILES;

    /*Constants for shared preferences */
    public static final String KEY_UID = "key_uid";
    public static final String STARTER_ID = "started";

    /*Constants for profiles */
    public static final int NUM_TIMES_OF_DAY = 4;
    public static final int NUM_DAYS_OF_WEEK = 7;
    public static final int TAG_CODE = 10;
    public static final int VIEW_MINE = 0;
    public static final int EDIT = 1;
    public static final int VIEW_OTHER = 2;



}
