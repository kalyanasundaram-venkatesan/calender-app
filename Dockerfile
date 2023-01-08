FROM maven:3-jdk-11 as builder

ENV BUILDDIR /app/calendar-app/build
COPY . $BUILDDIR
WORKDIR $BUILDDIR

RUN mvn clean install

FROM openjdk:11-jdk

ENV APPDIR /data/calendar-app/
WORKDIR $APPDIR
COPY --from=builder /app/calendar-app/build/target/calendar-app-1.0-SNAPSHOT.jar $APPDIR

CMD ["java", "-jar calendar-app-1.0-SNAPSHOT.jar"]
EXPOSE 8080
