#!/bin/sh

SCRIPT_PATH=$(dirname $0)
cd $SCRIPT_PATH/../modules/dao
rm -f ./target/temp_db.mv.db
rm -rf src/main/java/me/laiyijie/server/data/generate
mvn -Dflyway.configFile=flywayConfig.properties flyway:migrate
mvn mybatis-generator:generate

