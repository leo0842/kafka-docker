echo "start brokers"
docker-compose -f ./docker-compose-three-brokers.yml up -d

echo "this takes time about 30 seconds to execute servers"

sleep 30

echo "create topic 'test'"
docker exec broker-1 kafka-topics --create --topic test --bootstrap-server broker-1:9092 --replication-factor 3 --partitions 3

echo "completed"
