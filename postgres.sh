#!/bin/bash


docker run --name multi-module-kt --rm -e POSTGRES_PASSWORD=123456 -e POSTGRES_DB=multi-module -p 5432:5432 -v /opt/db/multi-module:/var/lib/postgresql/data -d postgres
