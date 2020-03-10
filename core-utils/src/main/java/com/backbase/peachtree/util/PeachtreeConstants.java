package com.backbase.peachtree.util;

public class PeachtreeConstants {

    public static final String BASE_PATH = "https://backbase.sandbox.mambu.com/api";

    public static final String HEADER_AUTH_TYPE = "Basic";
    public static final String HEADER_AUTH_NAME = "Authorization";
    public static final String HEADER_TOTAL_COUNT = "X-Total-Count";

    public static final String FILTER_PAGINATION_DETAILS_ON = "ON";
    public static final String FILTER_PAGINATION_DETAILS_OFF = "OFF";
    public static final String FILTER_DETAILS_LEVEL_FULL = "FULL";
    public static final String FILTER_DETAILS_LEVEL_BASIC = "BASIC";

    public static final String NULL_BRANCH_ID = null;
    public static final String CENTRE_ID = null;
    public static final String ACCOUNT_STATE_ACTIVE = "ACTIVE";
    public static final String ACCOUNT_HOLDER_TYPE_CLIENT = "CLIENT";
    public static final String NULL_CREDIT_OFFICER_USERNAME = null;
    public static final Integer NULL_OFFSET = null;
    public static final Integer NULL_LIMIT = null;

    public static final String CURRENT_ACCOUNTS    = "Current Accounts";
    public static final String SAVINGS_ACCOUNTS    = "Savings Accounts";
    public static final String TERM_DEPOSITS       = "Term Deposits";
    public static final String LOANS               = "Loans";
    public static final String CREDIT_CARDS        = "Credit Cards";
    public static final String INVESTMENT_ACCOUNTS = "Investment Accounts";

    private PeachtreeConstants() {
    }

}