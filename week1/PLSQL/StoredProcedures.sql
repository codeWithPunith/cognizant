DELIMITER $$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'SAVINGS';

    COMMIT;
END$$

DELIMITER ;


DELIMITER //

CREATE PROCEDURE UpdateEmployeeBonus(
    IN p_department VARCHAR(50),
    IN p_bonus DECIMAL(5,2)
)
BEGIN
    UPDATE employees
    SET salary = salary + (salary * p_bonus / 100)
    WHERE department = p_department;
END //

DELIMITER ;


DELIMITER //

CREATE PROCEDURE TransferFunds(
    IN from_acc INT,
    IN to_acc INT,
    IN amount DECIMAL(10,2)
)
BEGIN
    UPDATE accounts
    SET balance = balance - amount
    WHERE account_id = from_acc;

    UPDATE accounts
    SET balance = balance + amount
    WHERE account_id = to_acc;
END //

DELIMITER ;