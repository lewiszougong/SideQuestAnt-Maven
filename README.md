# SideQuestAnt-Maven

- Summary:
Design of the program: design a program such that it records remaining annual leave of an employees based on the concept of java stack. The following shows the command for the program with the format of {“action” “id” “name” “days”}:
1.	Adding new info to the db:  		exp: [push 1 Lewis 21]
2.	Show the latest info in the db: 		exp: [peek]
3.	Update the latest employee’s info 	exp: [pose Muldolf 12]
4.	Delete the latest entry			exp: [pop]

- Checkpoint #1 : using javac and java to execute
	Copy the jar file into the same folder as the .java program then run :
	Java -classpath “.;sqlite-jdbc-(VERSION).jar” Sample

- Checkpoint #2: using ant. 
Instead of writing every single line in cmd, save the configuration in the file of build.xml

- Checkpoint #3: using Maven
It is very convenient when using Maven, declare the respective dependencies in pom.xml, then run mvn clean install. 

- Ant vs Maven


