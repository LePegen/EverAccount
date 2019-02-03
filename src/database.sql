/*
 * old
 */

CREATE TABLE LOGIN(
    USERID INT PRIMARY KEY NOT NULL,
    USERNAME VARCHAR(100) UNIQUE NOT NULL,
    PASSWORDHASS VARCHAR(100) NOT NULL
);

CREATE TABLE ACCOUNT(
    ACCOUNTID INT PRIMARY KEY UNIQUE NOT NULL,
    USERID INT REFERENCES LOGIN(USERID) NOT NULL,
    PROVIDER VARCHAR(100),
    UNIQUENAME VARCHAR(100),
    EMAIL VARCHAR(100),
    USERNAME VARCHAR(100),
    ACCOUNTPASSWORD VARCHAR(100),
    ADDITIONALINFORMATION VARCHAR(100)
);

/*
 * new
 */

CREATE TABLE LOGIN(
    USERID INT PRIMARY KEY NOT NULL,
    USERNAME VARCHAR(100) UNIQUE NOT NULL,
    PASSWORDHASH VARCHAR(100) NOT NULL
);

CREATE TABLE ACCOUNT(
    ACCOUNTID INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    USERID INT REFERENCES LOGIN(USERID) NOT NULL,
    PROVIDER VARCHAR(100),
    UNIQUENAME VARCHAR(100),
    EMAIL VARCHAR(100),
    USERNAME VARCHAR(100),
    ACCOUNTPASSWORD VARCHAR(100),
    ADDITIONALINFORMATION VARCHAR(100)
);

