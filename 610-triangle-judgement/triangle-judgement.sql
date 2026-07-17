# Write your MySQL query statement below
SELECT x,y,z,
case 
    WHEN (x+y) > z AND (x+z) > y AND (y+z) > x 
    THEN 'Yes' ELSE 'No' end AS triangle
FROM Triangle 