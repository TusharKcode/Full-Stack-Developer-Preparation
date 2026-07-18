-- Numeric Data Types

CREATE TABLE Product_Sales(
    Product_Id INT PRIMARY KEY,
    Quantity SMALLINT,
    UnitPrice DECIMAL(10, 2),
    TotalAmount DECIMAL(10, 2)
);

CREATE TABLE Measurements(
    SensorID INT,
    Temperature FLOAT,
    Humidity REAL
);

-- Character and String Data Types

CREATE TABLE EmployeeInfo(
    EmpId INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName CHAR(50),
    Bio NVARCHAR(max),
    Country NCHAR(50)
);

-- Date and Time Data Type

CREATE TABLE Orders(
    OrderId INT PRIMARY KEY,
    OrderDate DATE,
    OrderTime TIME,
    ShippedDt DATETIME
);

-- Binary Data Types

CREATE TABLE Products_Img(
    ImageId INT PRIMARY KEY,
    ImageName VARCHAR(100),
    ImageData VARBINARY(MAX)
);

-- Boolean Data Type

CREATE TABLE User_Status (
    UserID INT PRIMARY KEY,
    IsActive INTEGER,
    IsVerified INTEGER
);

-- Special Data Types

CREATE TABLE XML_Records (
    RecordID INT PRIMARY KEY,
    ConfigData XML
);

CREATE TABLE Locations (
    LocationID INT PRIMARY KEY,
    Area GEOMETRY
);