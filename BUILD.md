# How to build the application

To build the application, follow these steps.
Download the zip anywhere on your system, then move it into your user directory.
The following commands assume that source.zip is in your user directory.  
The steps below creates a chuacw directory, changes into the new directory,
  
 - Open up a terminal and run these commands:
   - cd ~/
   - mkdir chuacw 
   - unzip source.zip -d chuacw
   - cd chuacw/sources/parking_lot
   - chmod a+x gradlew
   - ./gradlew
   - ./gradlew build
   - java -jar build/libs/parking_lot.jar
  
  
Once you're done, you can delete the entire chuacw directory like so:
  - cd ~/
  - rm -rf chuacw
  
# Testing the application

 - To test the application, follow the steps above, but do not execute the last command (the javar -jar) step.
 - ./gradlew test
 
You'll see the test results in the chuacw/sources/parking_lot/build/test-results/test directory.  

You can also use a browser to view the results by opening chuacw/sources/parking_lot/build/reports/tests/test/packages/parking_lot.html  