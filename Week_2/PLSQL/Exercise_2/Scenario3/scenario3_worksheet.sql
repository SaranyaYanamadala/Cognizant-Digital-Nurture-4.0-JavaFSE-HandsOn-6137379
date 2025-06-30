CREATE OR REPLACE PROCEDURE AddNewCustomer (
    customer_id IN NUMBER,
    customer_name IN VARCHAR2,
    customer_age IN NUMBER,
    customer_balance IN NUMBER,
    customer_isvip IN BOOLEAN
) IS 
BEGIN 
    -- Inserting a new customer
    INSERT INTO Customers (cust_id, name, age, balance_in_$, is_vip) 
    VALUES (customer_id, customer_name, customer_age, customer_balance, customer_isvip);

    DBMS_OUTPUT.PUT_LINE('Customer with ID : ' || customer_id || ' is added');
    COMMIT;

    EXCEPTION
        WHEN DUP_VAL_ON_INDEX THEN
            DBMS_OUTPUT.PUT_LINE('Customer already exists.');
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('Unexpected error : ' || SQLERRM);
            ROLLBACK;
END;

select * from customers;

-- Execute the procedure
BEGIN
    AddNewCustomer(10, 'Diya', 25, 12000, false);
    AddNewCustomer(1, 'Alice', 65, 15000, true);
END;
/