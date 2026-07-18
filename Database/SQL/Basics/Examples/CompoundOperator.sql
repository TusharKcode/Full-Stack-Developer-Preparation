-- Create sample table
CREATE TABLE Employees (
    EmpID INT,
    EmpName VARCHAR(50),
    Salary INT
);

-- Insert data
INSERT INTO Employees VALUES
(1, 'Harry', 40000),
(2, 'Nick', 50000),
(3, 'Donald', 30000);

-- Increase salary by 5000
UPDATE Employees
SET Salary = Salary + 5000;

-- Reduce salary by 2000 
UPDATE Employees
SET Salary = Salary - 2000
WHERE EmpName = 'Donald';

-- Double salary 
UPDATE Employees
SET Salary = Salary * 2
WHERE EmpName = 'Nick';

-- Divide salary 
UPDATE Employees
SET Salary = Salary / 2
WHERE EmpName = 'Harry';

-- Modulus example 
UPDATE Employees
SET Salary = Salary % 10000;