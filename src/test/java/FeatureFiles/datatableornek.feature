Feature: DataTable ornekk
  Scenario: Userss lists
    When write username "mert"
    And write username and password "mert" and "1234"
    And Write username as DataTable
    |mert|
    |eda |
    And Write username and password as Datatables
    |mert|1234|
    |eda |2345|


