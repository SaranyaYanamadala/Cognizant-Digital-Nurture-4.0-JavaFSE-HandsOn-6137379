set SERVEROUTPUT on;

-- Scenario 1
BEGIN
    -- Looping through the customers in customers table
    FOR CUSTOMER IN (
        SELECT
            CUST_ID,
            AGE
        FROM
            CUSTOMERS
    ) LOOP
        IF CUSTOMER.AGE > 60 THEN
            -- updating the records in the loans table
            UPDATE LOANS
            SET
                INTEREST_RATE = INTEREST_RATE - 1
            WHERE
                CUST_ID = CUSTOMER.CUST_ID;

        END IF;
    END LOOP;

    COMMIT;
END;


-- Scenario 2
begin 
    update CUSTOMERS
    set is_vip= true where balance > 10000;

    commit;
end;


-- Scenario 3
begin 
    for cust_loan in (
        select l.loan_id, l.cust_id, l.due_date, c.name from loans l
            join customers c on l.cust_id = c.cust_id
            where l.due_date between sysdate and sysdate + 30
        ) Loop
            dbms_output.put_line(
                'Remainder : loan_id ' || cust_loan.loan_id || 
                'for customer ' || cust_loan.name ||
                ' is on due ' || to_char(cust_loan.due_date, 'DD-MM-YYYY')
            );
        end loop;
end;