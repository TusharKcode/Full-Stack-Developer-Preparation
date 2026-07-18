-- USING % Wildcard

-- To fetch records where CustomerName starts with 'A'.
SELECT *  FROM Customers WHERE CustomerName LIKE 'A%';

-- Records Ending with a Specific Letter
SELECT *  FROM Customers WHERE CustomerName LIKE '%l';

-- Records Containing a Specific Letter at Any Position
SELECT * FROM Customers WHERE CustomerName LIKE '%A%';

-- Records Containing a Specific Substring at Any Position
SELECT DISTINCT * FROM Customers WHERE Country LIKE '%ra%';


-- USING _ Wildcard

-- Records with a Specific Prefix and Exactly Three Characters
SELECT * FROM Customers WHERE CustomerName LIKE 'Dan___';

-- Records with a Specific Length
SELECT * FROM Customers WHERE Country LIKE '_______';

-- USING [ ] Wildcard

-- Matching One Character from a Set
SELECT * FROM Customers WHERE LastName REGEXP '^[A-C]';

-- Matching Characters Outside a Range
SELECT * FROM Customers WHERE LastName NOT LIKE '%[y-z]%';

-- Combining Both % and _ Wildcard

-- Matching Specific Digits in a Phone Number
SELECT * FROM Customers WHERE PHONE LIKE '8__5%';