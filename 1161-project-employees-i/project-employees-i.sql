# Write your MySQL query statement below
SELECT 
    P.project_id ,
    ROUND(AVG(E.experience_years),2) AS average_years
FROM Employee E JOIN Project P 
ON P.employee_id =E.employee_id 
GROUP BY    project_id;