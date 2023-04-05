#!/usr/bin/env bash
#deploy="false"
deploy="true"

image=Jakatra
version=1.0-SNAPSHOT
latest=true

#OPTIONS="--no-cache --force-rm"
#OPTIONS="--no-cache"
#OPTIONS="--force-rm"
OPTIONS=""

docker build ${OPTIONS} -t ?/${image}:1.0-SNAPSHOT .
if [ "$?" -eq 0 ] && [ ${deploy} == "true" ]; then
    docker push ?/${image}:1.0-SNAPSHOT
    if [ "$latest" == "true" ]; then
        docker tag ?/${image}:1.0-SNAPSHOT ?/${image}:latest
        docker push ?/${image}:latest
    fi
fi