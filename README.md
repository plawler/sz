Summary
=======

This is a sample application that illustrates how OpenRefine and a simple RESTful service work together to transform and validate student data.

addA companion design document (if you have been granted access) can be found here - https://docs.google.com/document/d/17A7Marb2jEk-S3hL0kDmhontH5HEbayI28wDqxGdN3I/edit?usp=sharing

Prerequisites
=============

Maven
-----
3.x or above

Java
----
1.6 or above

Instructions
============

1. Download, install and run OpenRefine http://openrefine.org/download.html (pay attention to OS instructions)
2. Clone this repo
3. In the directory where cloned, run `mvn package`
4. Start the API service run `java -jar target/sz_poc-0.0.1-SNAPSHOT.jar server`
5. Create a new project in OpenRefine and choose the `assessment_data.txt` file
    - select `CSV / TSV / separator-based files`
    - choose `commas` radio button
    - click `Create Project >>`
6. In left pane click on `Undo / Redo`
    - click the `Apply...` button
    - select all of the text from the `operations.json` file in the repo root directory and paste it in the window
    - click `Perform Operations`
7. The resulting data should match the target structure defined by the assignment

Output
======

OpenRefine should have performed all the operations necessary to transform the data.

In addition, it will have validated the records against our little student REST api.

Feel free to step through the Undo/Redo steps to see how the data was transformed.


