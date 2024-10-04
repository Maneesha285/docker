FROM openjdk:17-alpine

COPY . /app

WORKDIR /app

RUN javac ./src/main/java/org/neoteric/App.java

WORKDIR /app/src/main/java

CMD ["java"
,"org.neoteric.App"]