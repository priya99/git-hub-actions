FROM openjdk:17
EXPOSE 8080
ADD target/git-hub-actions.jar git-hub-actions.jar
ENTRYPOINT ["java","-jar","/git-hub-actionsgit.jar"]