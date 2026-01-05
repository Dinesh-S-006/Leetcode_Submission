# Write your MySQL query statement below
SELECT email FROM Person
GROUP By email HAVING COUNT(email)>1