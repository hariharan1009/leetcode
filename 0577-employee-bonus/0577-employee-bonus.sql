# Write your MySQL query statement below
SELECT E.name ,B.bonus FROM Employee E LEFT JOIN Bonus B
ON E.empId =B.empId 
WHERE B.bonus <1000 OR B.bonus IS NULL;