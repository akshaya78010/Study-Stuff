-- BUILT-IN functions in SQL
-- String Functions
-- dual table
-- Dummy table with single row and single column
-- and typically to perform operations that doesn't any physical table
SELECT 10 + 20 FROM dual;
SELECT 10 + 20 AS sum FROM dual;
-- Writing more columns using dual
SELECT
    10 + 20 AS sum, 
    10 * 20 AS product,
    10 - 20 AS difference
FROM dual;
SELECT * FROM dual;



-- UPPER(string) --> Converts all the alphabets in the
-- string into uppercase
SELECT UPPER('technical hub') AS upper_case_string FROM dual;
-- SELECT UPPER(first_name) FROM employee;
-- LOWER(string) --> Converts all the alphabets in the
-- string into lowercase
SELECT LOWER('TEchnical HUb') AS lower_case_string FROM dual;
-- technical hub --> Technical Hub
SELECT INITCAP('technical hub') FROM dual;
-- LENGTH(string) --> Gives length (number of chars)
-- in the given string
SELECT LENGTH('technical hub') FROM dual;
-- SELECT LENGTH(oranization_name) FROM organizations;
-- In SQL strings are not indexed
-- Their position starts from 1
-- organization_name[0] --> Invalid
-- SUBSTR(string, start_pos, n_char)
-- Getting the substring from postion 2
SELECT SUBSTR('technical hub', 2) FROM dual;
-- Getting the 3 characters as substring starting
-- from position 2
SELECT SUBSTR('technical hub', 2, 3) FROM dual;
SELECT SUBSTR('technical hub', -5) FROM dual;
SELECT SUBSTR('technical hub', -5, 3) FROM dual;

SELECT 'technical' || 'hub' FROM dual;
-- Find out the concatenation of first and last characters of a string
SELECT SUBSTR('technicalhub', 1, 1)  || SUBSTR('technical hub', -1) AS concat_string
FROM dual;

-- INSTR(string, sub_str, start_pos, no_occurrnece) searching a substring in a string
SELECT INSTR('Oracle SQL', 'SQL') FROM dual;
SELECT INSTR('Oracle SQL', 'sql') FROM dual;
SELECT INSTR('Oracle SQL SQL', 'SQL', 9) FROM dual;
SELECT INSTR('Oracle SQL SQL', 'SQL', 1, 2) FROM dual;

-- REPLACE(string, sub_string, new_string)
SELECT '14-21-35' AS current_time FROM dual;
SELECT REPLACE('14-21-35', '-', ':') AS current_time FROM dual;
SELECT REPLACE('Oracle SQL', 'SQL', 'Database') AS name FROM dual;

-- TRIM(character FROM string): Trims leading and trailing occurrences of the characer
-- in the string
'  23A91A6147' --> TRIM()
'23A91A6147' --> 
SELECT TRIM('*' from '***SQL***') from dual;
SELECT LENGTH(TRIM(' ' from '   SQL   ')) from dual;

-- LPAD(string, n, pad_string): Pads the given string into given number of charaters
-- using pad_string on left side
SELECT LPAD('database', 8, '0') FROM dual;
SELECT LPAD('database', 20, 'abc') FROM dual;
SELECT LPAD('database', 10, 'abc') FROM dual;
SELECT LPAD('database', 6, 'abc') FROM dual;
-- 00345
-- 05467
-- 65479

-- Numeric Functions
-- ABS(), CEIL(), FLOOR(), ROUND(), TRUNC(), SQRT(), POWER(), MOD()
-- ABS() --> Gives the absolute value
SELECT ABS(127), ABS(-127), ABS(45.45), ABS(-45.45) FROM dual;
-- CEIL(number): Returns the smallest integer that is greater than or equal to the given
-- number
SELECT CEIL(45.1), CEIL(45.9), CEIL(45.00), CEIL(-45.1) FROM dual;

-- FLOOR(number): Returns the largest integer that is less than or equal to the given
-- number
SELECT FLOOR(45.1), FLOOR(45.9), FLOOR(45.00), FLOOR(-45.1) FROM dual;

-- ROUND(number, decimal_places): ROUNDS the given number into specified number of 
-- decimal places
SELECT ROUND(123.4567, 2), TRUNC(123.4567, 2) FROM dual;

-- 
SELECT POWER(10, 2), POWER(2.5, 3.5),
       SQRT(25), SQRT(130),
		MOD(10, 2), MOD(100, 51)
FROM dual;
