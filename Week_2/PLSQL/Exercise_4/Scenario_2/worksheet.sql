-- Scenario 2
CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    loan_amount IN NUMBER,
    monthly_interest IN NUMBER,
    years IN NUMBER
) RETURN NUMBER IS 
    months NUMBER;
    emi NUMBER;
BEGIN
    -- Converting years to months
    months := years * 12;

    -- EMI calculation
    IF monthly_interest = 0 THEN
        -- No interest rate
        emi := loan_amount / months;
    ELSE
        emi := (loan_amount * monthly_interest * POWER(1 + monthly_interest, months)) / 
                (POWER(1 + monthly_interest, months) - 1);
    END IF;

    RETURN ROUND(emi, 2);

END;
/

-- Executing the function
SELECT CalculateMonthlyInstallment(10000, 1, 5) AS EMI FROM DUAL; 
