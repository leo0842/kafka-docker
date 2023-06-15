```shell
git clone https://github.com/leo0842/kafka-docker.git

cd kafka-docker

chmod +x ./start-kafka.sh # if needed

./start-kafka.sh
```

```
if (some errors with creating containers) {
    please run `docker-compose -f ./docker-compose-three-brokers.yml down`
    return
    }
run each api module.
```

It is possible to access 'http://localhost:8080' to check brokers.
