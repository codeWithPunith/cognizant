
UPDATE customer
SET loaninterest = loaninterest - 1
WHERE age > 60;



SET isVIP = TRUE
WHERE balance > 10000;



SELECT customer_id, loan_id, due_date
FROM loans
WHERE due_date BETWEEN SYSDATE AND SYSDATE + 30;