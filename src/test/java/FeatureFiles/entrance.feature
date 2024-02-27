Feature: exam func
  Background:
    Given nav to cmp
    When enter u and p
    Then user success
    Scenario:Exam Create and Delete
      And CLick on the element in Leftnav
      |entranceexamone|
      |setuptwo        |
      |entranceexamtwo|
      And Click on the element Dialog
        |addbutton|
      And user sending the keys in dialog content
        |nameinput|mertexam3|
      And Click on the element Dialog
      |academicperiod|
      |academicperiodtwo|
      |gradelevelone    |
      |gradeleveltwo   |
      And Click on the element Dialog
        |savebutton|
      Then success mesaage should be display
      And CLick on the element in Leftnav
        |entranceexamone|
        |setuptwo        |
        |entranceexamtwo|





