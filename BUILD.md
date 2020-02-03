# How to build the application

To build the application, follow these steps.
Download the tar anywhere on your system, then move it into your user directory.
The following commands assume that ChuaCheeWee-source.tar is in your user directory.  
The steps below creates a chuacw directory, changes into the new directory,
  
 - Open up a terminal and run these commands:
   - cd ~/
   - mkdir chuacw 
   - tar -C chuacw -xvf ChuaCheeWee-source.tar
   - cd chuacw/sources/parking_lot
   - bin/setup
   - bin/run_functional_tests
  
Once you're done, you can delete the entire chuacw directory like so:
  - cd ~/
  - rm -rf chuacw
  
# Testing the application

 - To test the application, in the parking_lot directory:   
   - ./gradlew test
 
You'll see the test results in the chuacw/sources/parking_lot/build/test-results/test directory.  

You can also use a browser to view the results by opening chuacw/sources/parking_lot/build/reports/tests/test/packages/parking_lot.html  