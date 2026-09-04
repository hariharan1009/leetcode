# Write your MySQL query statement below
SELECT MAX(num) AS num
FROM  ( SELECT num FROM MyNumbers 
        GROUP BY NUM 
        HAVING COUNT(num)=1) AS NUM;