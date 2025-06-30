CREATE OR REPLACE PROCEDURE UpdateSalary (
    target_emp IN NUMBER,
    increment IN NUMBER
) IS target_emp_salary NUMBER;
BEGIN
    -- Getting the current salary
    SELECT salary INTO target_emp_salary
    FROM Employees 
    WHERE emp_id = target_emp;

    -- Update the salary
    UPDATE Employees 
    SET salary = target_emp_salary + (target_emp_salary * increment / 100)
    WHERE emp_id = target_emp;

    DBMS_OUTPUT.PUT_LINE('Salary updated for employee ID : ' || target_emp);
    COMMIT;

    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            DBMS_OUTPUT.PUT_LINE('Employee ID ' || target_emp || ' is not found.');
        WHEN OTHERS THEN
            DBMS_OUTPUT.PUT_LINE('Unexpected Error.');
            ROLLBACK;

END;
/

-- Execute the procedure
BEGIN
    UpdateSalary(5, 5);
END;

select * from employees;