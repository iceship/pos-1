POS - Point Of Sell

Goal.

This software intends to be useful for those people who are interested in managing a small market, kiosk, etc.

Architecture.

The application is developed in Java and Scala. By connecting a bar-code reader, it is possible to see the price of a product previously loaded in a DB.

Version.

Currently the application is in development process, it means, not ready to be used. I'm working really hard to get the first operative version.

Compilation process.

It can be used maven 3.0.5 as well as scala ide to compile the project.

DB access.

Download from http://hsqldb.org the hsqld.jar, then execute the following command:

java -cp hsqldb.jar org.hsqldb.util.DatabaseManagerSwing

Once the ui has opened, then configure the path pos/database/posdb in standalone mode to access the database. 
