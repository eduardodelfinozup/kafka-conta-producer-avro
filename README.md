## kafka Producer avro

# Subir docker opção 1
```shell
cd ./docker/opcao1
docker-compose up
```
# Subir docker opção 2
```shell
cd ./docker/opcao2
docker-compose up
```
# Remover docker opção 1
```shell
cd ./docker/opcao1
docker-compose down
```

# Remover docker opção 2
```shell
cd ./docker/opcao2
docker-compose down
```
# kafdrop
```
http://localhost:19000/
```
# Lences.io
```
http://localhost:3030

```
# Payload conta
```
curl --request POST \
  --url http://localhost:8080/contas \
  --header 'Content-Type: application/json' \
  --data '{
	"documentoTitular":35385638807,
	"nomeTitular":"Rafaela da Costa",
	"agencia":1000,
	"numero":123,
	"saldo":250
}'
```
