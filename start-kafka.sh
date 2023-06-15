echo "start brokers"
docker-compose -f ./docker-compose-three-brokers.yml up -d

echo "this takes time about 15 seconds to execute servers"

sleep 40

docker exec broker-1 kafka-topics --create --topic test --bootstrap-server broker-1:9092 --replication-factor 3 --partitions 3

echo "completed"
