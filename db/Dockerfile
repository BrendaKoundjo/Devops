FROM postgres:latest

ENV POSTGRES_DB=db \
   POSTGRES_USER=usr \
   POSTGRES_PASSWORD=pwd
COPY init/ /docker-entrypoint-initdb.d

