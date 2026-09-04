# Write your MySQL query statement below
SELECT S.name FROM SalesPerson S
WHERE S.name NOT IN 
    (SELECT S.name FROM SalesPerson S
        LEFT JOIN Orders O ON S.sales_id=O.sales_id
        LEFT JOIN Company C  ON O.com_id=C.com_id
    WHERE C.name ='Red');
