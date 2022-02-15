FROM openjdk

COPY . /tmp/

WORKDIR /tmp

RUN javac -d out -sourcepath src src/desafio/capgemini/exercicios/Main.java

WORKDIR /tmp/out

ENTRYPOINT ["java", "desafio/capgemini/exercicios/Main"]