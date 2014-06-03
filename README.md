Summary
=======

This is a sample application that illustrates how OpenRefine and a simple RESTful service work together to transform and validate student data.

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

# Download, install and run OpenRefine http://openrefine.org/download.html (pay attention to OS instructions)
# Clone this repo
# In the directory where cloned, run `mvn package`
# Start the API service run `java -jar target/sz_poc-0.0.1-SNAPSHOT.jar server`
# Create a new project in OpenRefine and choose the assessment_data.txt file
    - select `CSV / TSV / separator-based files`
    - choose `commas` radio button
    - click `Create Project >>`
# In left pane click on `Undo / Redo`
    - click the `Apply...` button
    - select all of the text from the operations.json file in the repo root directory and paste it in the window
    - click `Perform Operations`
# The resulting data should match the target structure defined by the assignment

Output
======

OpenRefine should have performed all the operations necessary to transform the data.

In addition, it will have validated the records against our little student REST api.

Feel free to step through the Undo/Redo steps to see how the data was transformed.


