#Microservice de Carrinho de Compras


O microservice de carrinho de compras é responsável por gerenciar os carrinhos de compras dos usuários. Ele permite que os usuários adicionem e removam itens do carrinho, além de visualizá-los.

##Tecnologias Utilizadas

<li>Linguagem de programação Java</li>
<li>Framework Spring Boot</li>
<li>Banco de Dados Redis</li>
<li>Docker</li>

##Execução do Microservice

Para executar o microservice de carrinho de compras, é necessário ter o Docker instalado na máquina. Com o Docker instalado, basta executar o seguinte comando na raiz do projeto:

<li>docker-compose up</li>

##Endpoints

O microservice possui os seguintes endpoints:

###POST /cart/{id}
Adiciona um item ao carrinho de compras.

Parâmetros
<li>`id` (obrigatório): Identificador do carrinho de compras.</li>
<li>item (obrigatório): Objeto que representa o item a ser adicionado ao carrinho. Deve seguir o seguinte formato JSON</li>

###GET /cart/{id}
Retorna o carrinho de compras com o identificador especificado.

Parâmetros
<li> id  (obrigatório): Identificador do carrinho de compras.</li>

###DELETE /cart/{id}
Remove o carrinho de compras com o identificador especificado.

Parâmetros
<li> id  (obrigatório): Identificador do carrinho de compras.</li>
