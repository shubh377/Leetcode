# Write your MySQL query statement below
select b.product_name as product_name, a.year as year, a.price as price from Sales a left join Product b on 
a.product_id=b.product_id;