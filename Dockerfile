FROM r3musketeers/r3lib:latest

WORKDIR /home/r3musketeers/r3-server

COPY config config
COPY src src
COPY *.properties ./
COPY pom.xml ./

RUN mvn install

VOLUME [ "/root/.m2" ]

CMD [ "/bin/sh" ]
