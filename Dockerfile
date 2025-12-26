# Используем официальный Maven образ для сборки проекта
FROM maven:3.9.3-eclipse-temurin-17 AS build

# Устанавливаем рабочую директорию в контейнере
WORKDIR /app

# Копируем pom.xml и скачиваем зависимости (кэширование)
COPY pom.xml .
RUN mvn dependency:go-offline

# Копируем весь исходный код
COPY src ./src

# Собираем проект и пропускаем тесты на этом этапе
RUN mvn clean package -DskipTests

# --- Второй этап: минимальный образ для запуска приложения ---
FROM eclipse-temurin:17-jdk-alpine

# Создаем рабочую директорию для запуска
WORKDIR /app

# Копируем собранный jar из предыдущего этапа
COPY --from=build /app/target/generation-app-1.0-SNAPSHOT.jar app.jar

# Указываем команду запуска
ENTRYPOINT ["java", "-jar", "app.jar"]

# Экспонируем порт (если приложение веб-сервер, сейчас просто для стандарта)
EXPOSE 8080