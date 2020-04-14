#!/bin/sh

nohup java -jar ebs-sg-ex.jar &
./wso2mi-1.1.0/bin/micro-integrator.sh

