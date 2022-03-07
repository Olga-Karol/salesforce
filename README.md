# Demo project of wrapped elements

The education project demonstrates realization of wrapped element pattern. Also, it has implementation of the following
patterns:

1. Page object
2. Steps
3. Chain of invocations
4. Loadable component

[Saleforce](https://www.salesforce.com/) was used as testing product.

# Test suite

## Test case 1 - Add new account

| step #        | desc                                                           | expected result                                      |
|---------------|----------------------------------------------------------------|------------------------------------------------------|
| 1             | open [Saleforce](https://www.salesforce.com/)                  | login page opened                                    |
| 2             | login                                                          | homepage opened                                      |
| 3             | click 'Accounts' in main menu                                  | accounts page opened                                 |
| 4             | click 'New'                                                    | 'New account' form opened                            |
| 5             | fill in all fields on form -> click 'Save'                     | details page for created account opened              |
| 6             | make sure filled account's data matches data on 'Details' page | filled account's data matches data on 'Details' page |
| Postcondition | click 'delete'                                                 | account was removed                                  |


## Test case 2 - Add new contact

| step #        | desc                                                           | expected result                                      |
|---------------|----------------------------------------------------------------|------------------------------------------------------|
| Precondition  | add new account                                                | account was created                                  |
| 1             | open [Saleforce](https://www.salesforce.com/)                  | login page opened                                    |
| 2             | login                                                          | homepage opened                                      |
| 3             | click 'Contacts' in main menu                                  | contacts page opened                                 |
| 4             | click 'New'                                                    | 'New contact' form opened                            |
| 5             | fill in all fields on form -> click 'Save'                     | details page for created account opened              |
| 6             | make sure filled contact's data matches data on 'Details' page | filled contact's data matches data on 'Details' page |
| Postcondition | click 'delete'                                                 | contact was removed                                  |

To start test suite exec cmd command:
```mvn test -Dusername=[your username] -Dpassword=[your password]```