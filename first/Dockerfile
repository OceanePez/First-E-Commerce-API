FROM eclipse-temurin:21 as build
WORKDIR /app
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew clean build -x test
FROM eclipse-temurin:21
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 9090
CMD ["java", "-jar", "/app/app.jar"]
