-- Create sample table
CREATE TABLE Students (
    ID INT,
    Name VARCHAR(50),
    Marks INT
);

-- Insert sample data
INSERT INTO Students VALUES
(1, 'Ben', 85),
(2, 'John', 70),
(3, 'Nick', 55),
(4, 'Bob', NULL);

-- Example 1: BETWEEN operator
SELECT * FROM Students
WHERE Marks BETWEEN 60 AND 90;

-- Example 2: IN operator
SELECT * FROM Students
WHERE Name IN ('Ben', 'Nick');

-- Example 3: LIKE operator
SELECT * FROM Students
WHERE Name LIKE 'N%';  -- Names starting with N

-- Example 4: IS NULL operator
SELECT * FROM Students
WHERE Marks IS NULL;

-- Example 5: EXISTS operator
SELECT * FROM Students s
WHERE EXISTS (
    SELECT * FROM Students
    WHERE Marks > 80
);