-- Create sample table
CREATE TABLE Users (
    UserID INT,
    UserName VARCHAR(50),
    Permissions INT   -- Stores permission flags as a number
);

-- Insert sample data
-- Permission flags: Read=1, Write=2, Execute=4
INSERT INTO Users (UserID, UserName, Permissions) VALUES
(1, 'John', 1),   -- Read only
(2, 'Bob', 3),   -- Read + Write
(3, 'Nick', 7);   -- Read + Write + Execute

-- Example 1: Check if user has Write permission (Bitwise AND)
SELECT *
FROM Users
WHERE Permissions & 2 = 2;  -- 2 = Write permission

-- Example 2: Add Execute permission (Bitwise OR)
UPDATE Users
SET Permissions = Permissions | 4
WHERE UserName = 'Bob';  -- Now Bob has Execute permission

-- Example 3: Remove Read permission (Bitwise AND + NOT)
UPDATE Users
SET Permissions = Permissions & ~1
WHERE UserName = 'Nick';  -- Remove Read permission from Nick

-- Example 4: Toggle Write permission (Bitwise XOR)
UPDATE Users
SET Permissions = Permissions ^ 2
WHERE UserName = 'John';  -- Toggle Write permission

-- Example 5: Show final Permissions for all users
SELECT * FROM Users;