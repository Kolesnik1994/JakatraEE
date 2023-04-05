#!/usr/bin/env bash
mvn clean package && docker build -t ?/Jakatra .
docker rm -f Jakatra || true && docker run -d -p 8080:8080 -p 9990:9990 --name Jakatra ?/Jakatra
