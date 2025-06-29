-- Scenario 3
CREATE TABLE Bank_accounts (
    acc_id NUMBER PRIMARY KEY,
    cust_id NUMBER,
    acc_holder VARCHAR(50),
    balance NUMBER(12, 2)
);

-- Inserting some sample data
INSERT INTO Bank_accounts VALUES (101, 1, 'Saranya', 10000.00);
INSERT INTO Bank_accounts VALUES (102, 2, 'Alice', 7500.00);
INSERT INTO Bank_accounts VALUES (103, 3, 'Bob', 5000.00);
INSERT INTO Bank_accounts VALUES (104, 4, 'Diya', 12000.00);
INSERT INTO Bank_accounts VALUES (105, 5, 'Loki', 3000.00);


CREATE OR REPLACE PROCEDURE TransferFunds (
    src_account IN NUMBER,
    target_account IN NUMBER,
    amount IN NUMBER
) IS
    src_balance NUMBER;
BEGIN
    SELECT balance INTO src_balance FROM BANK_ACCOUNTS
    WHERE acc_id = src_account;

    -- Checking if the balance is sufficient
    IF src_balance < amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance in the account.');
    END IF;

    -- or else deduct from the account
    UPDATE BANK_ACCOUNTS
    SET balance = balance - amount
    WHERE acc_id = src_account;

    -- Add amount to the target after deduction from src
    UPDATE BANK_ACCOUNTS
    SET balance = balance + amount
    WHERE acc_id = target_account;

    DBMS_OUTPUT.PUT_LINE('Transferred amount of ' || amount || ' to account id ' || target_account);

    COMMIT;
END;  

select * from BANK_ACCOUNTS;

-- Execute the procedure
BEGIN
    TransferFunds(101, 102, 2000);
END;

-- Changes after procedure
select * from BANK_ACCOUNTS;

