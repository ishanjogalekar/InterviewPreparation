# SQL Basic Questions

---

### Difference between stored procedures (SP) & Functions (UDF)

- UDF: User Defined functions
---

| No. | SP                                                                                           | UDF                                                               |
|-----|----------------------------------------------------------------------------------------------|-------------------------------------------------------------------|
| 1.  | May or may not return value.                                                                 | Must return value.                                                |
| 2.  | Can have input and output parameters.                                                        | Only have input parameters.                                       |
| 3.  | SP Can't get call from another UDF.                                                          | UDF Can call another SP.                                          |
| 4.  | Can't use in SQL statements like SELECT, Insert.                                             | Can use in SQL statements.                                        |
| 5.  | Not allowed to use in SELECT statements.                                                     | Can use in SELECT statements.                                     |
| 6.  | Not used in WHERE/HAVING part of statements.                                                 | Can use in WHERE/HAVING Cases.                                    |
| 7.  | Can use execution plan repetitively.                                                         | Need to compile every time.                                       |
| 8.  | try-catch exception handling.                                                                | No exception handling.                                            |
| 9.  | Use of transactions.                                                                         | Can use transactions.                                             |
| 10. | Not consider as expression.                                                                  | Consider as expression.                                           |
| 11. | Not able to used in table joins.                                                             | As resultset can be used in sql joins.                            |
| 12. | Use table variables and temporary tables.                                                    | Can use table variables only.                                     |
| 13. | Improved security, Client/Server traffic reductions, Abstraction and Pre-compiled execution. | Faster execution, Modular programming and reduce network traffic. |



