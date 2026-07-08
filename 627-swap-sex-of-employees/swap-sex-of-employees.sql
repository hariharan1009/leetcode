# Write your MySQL query statement below
UPDATE Salary  
SET sex=
CASE SEX
    WHEN 'm' THEN 'f'
    ELSE 'm'
END;