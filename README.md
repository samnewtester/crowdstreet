1. Download project

2. Import as existing maven project 

3. Change Browser and URL as needed
    src/test/resources/serenity.conf

4.a Execute Test from IDE (Eclipse)
    pom.xml > Run As > Maven Build
    (Goal name is "verify" if prompted)
    
    (first time) 
    pom.xml > Run As > Maven Clean
    pom.xml > Run As > Intall

4.b Execute Test from command line
    mvn clean verify (from the folder location where pom.xml is present)