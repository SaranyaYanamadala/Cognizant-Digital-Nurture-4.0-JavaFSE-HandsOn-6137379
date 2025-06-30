-- Scenario 3
CREATE OR REPLACE FUNCTION HasSufficientBalance (
    acc_id IN  NUMBER,
    amount IN NUMBER
) RETURN BOOLEAN IS
    acc_balance NUMBER;
    is_sufficient BOOLEAN;
BEGIN
    -- Checking the account for sufficient balance
    SELECT balance INTO acc_balance
    FROM Savings_Accounts 
    WHERE acc_id = account_id;

    IF acc_balance < amount THEN 
        is_sufficient := false;
    ELSE
        is_sufficient := true;
    
    END IF;
    RETURN is_sufficient;

END;
/

SELECT HasSufficientBalance(1004, 10000) AS is_sufficient FROM DUAL;
SELECT HasSufficientBalance(1001, 2000) AS is_sufficient FROM DUAL;