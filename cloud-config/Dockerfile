FROM gradle:alpine

USER root

RUN apk add --update bash && \
        rm -rf /var/lib/apk/

RUN mkdir -p /home/gradle/project
WORKDIR /home/gradle/project

VOLUME /home/gradle/.gradle

COPY . /home/gradle/project

EXPOSE 8888

CMD ./gradlew build

