docker run -dit \
--rm \
--name ebs-sg-tnt \
--network ebs-sg-net \
-p 18083:8080 \
-p 18293:8290 \
ebs-sg-tnt:20.11
