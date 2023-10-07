# Spring + ElasticSearch

Para conseguir rodar aplicação localmente, é necessário baixar uma imagem docker do elastic-search. Tenha o docker instalado em sua máquina e execute os seguintes comandos abaixo 👇

```
docker pull docker.elastic.co/elasticsearch/elasticsearch:7.17.13
docker run -p 127.0.0.1:9200:9200 -p 127.0.0.1:9300:9300 -e "discovery.type=single-node" docker.elastic.co/elasticsearch/elasticsearch:7.17.13
```
