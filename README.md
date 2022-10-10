# Online_School
### The Online School Problem
Here is a simplified program where there is a list of participants registered in courses taught by qualified instructors:

- Each instructor is characterized by their name, campus phone extension (e.g., 70310), and contact email.
- Each registration is characterized by its subject title, numerical marks, and instructor (who may not be assigned when the course is first created). Given a registration object:
  - A grade report may be returned as an array of length 2, e.g., {"B", "Good"}, where the first element stores the letter grade and the second element stores its qualitative description
  - A string information object may be returned. There are two cases to consider, depending on whether or not the course instructor has been assigned. In the case where the instructor is present, the returned string should contain the course title, instructor name, the marks, and its corresponding grade and description
  
- Each participant object is characterized by the name of student and the list of added registrations. Given a participant object, we may:
  - Add a new registration, either by an input registration object, or by the name of course (from which a registration object may be created accordingly). The maximum number of registrations allowed for a participant is 5: attempting to add registrations beyond this limit will have no impact (i.e., the list of registrations remains the same). Furthermore, there is no need to check if there are duplicated registrations added (e.g., two registrations with the same course name).
  - Retrieve its list of registrations as an array (i.e., Registration[]), whose length is less than or equal to the maximum allowable number (i.e., 5).
  - Clear its list of registrations (e.g., allowing further registrations to be added).
  - Retrieve the marks of a course with the given name. If the name of a non-registered course is given, then return -1 as its marks.
  - Update the marks of a course with the given name. If the name of a non-registered course is given, then nothing should be changed.
  - Obtain a report of the GPA (grade point average) over the list of added registrations.
  
- Each online school object is characterized by its list of participants. Given an online school object, we may:
  - Add a new participant by an input participant object. The maximum number of participants allowed for a school is 100: attempting to add participants beyond this limit will have no impact (i.e., the list of participants remains the same). Furthermore, there is no need to check if there are duplicated participant added (e.g., two participant with the same name).
  - Retrieve the list of participants of a course, given its name, as an array. If the input name denotes a non-existing course, then an empty array is returned.
  
- Other intended functionalities of above kinds of objects can be inferred from the given JUnit test.
