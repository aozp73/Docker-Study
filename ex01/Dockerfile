FROM openjdk:11-jdk-slim

# Docker 컨테이너 안에서 작업할 디렉토리를 지정 
# (해당 경로의 디렉토리가 없다면 새로 생성)
WORKDIR /app

# ADD 압축파일.zip ./ #add는 압축이 자동으로 풀림
COPY build/aws-v3-0.0.3.jar ./application.jar

# Docker 컨테이너가 시작될 때 실행되는 명령어 지정 
# 여기서는 java -jar -Dspring.profiles.active=dev application.jar 명령어 실행 
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "application.jar"]

CMD ["--server.port=3000"]

