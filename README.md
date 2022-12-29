<h1>API Controle de estoque</h1>

<h3>
💻 API para controlar o estoque com as funções:
</h3>
<p>
Buscar todos os produtos, com descrição, preço, URL de imagem e categoria,</br>
Buscar um produto apenas mensionando o "id" do produto no corpo da URL,</br>
Buscar todas as categorias,</br>
Buscar uma categoria apenas mensionando o "id" da categoria no corpo da URL,</br>
Cadastramento de usuário,</br>
Atualização cadastral do usuário,</br>
Buscar todos os usuários,</br>
Buscar um usuário por id,</br>
Buscar todos os pedidos,</br>
Buscar um pedido mensionando o "id" do pedido no corpo da URL, onde devolve </br> 
os produtos contidos no pedido e o usuário do pedido
</p>
<h3>
⚙️ Tecnologias Utilizadas
</h3>
<p>
O projeto foi criado com Spring Boot na linguagem de programação Java com BD H2 para teste, </br> 
utilizando Spring Data JPA e o gerenciador de dependência Maven.
</p>

<h3>
Arquitetura
</h3>
<h4>
O projeto está divido nas seguintes camadas:
</h4>
<ul>
<ol>main</ol>
<ol>Entidade</ol>
<ol>Repositório</ol>
<ol>Serviço</ol>
<ol>Controle</ol>
<ol>DTO</ol>
<ol>Configurações</ol>
<ol>Exceção</ol>
</ul>
<h3>
🚀 Como executarClonar o projeto
</h3>
<h4>
🎲 Rodando o servidor
</h4>
<p>
Clone este repositório</br>
$ git clone https://github.com/imcalazans/APIProduct-Store.git</br>
Configurar no aplication.properties a conexão do BD</br>
Executar no terminal o comando: mvn spring-boot:run</br>
Chamar os endpoint.
<p>

<h2>
Como testar
</h2>
<h3>
O sistema possui os endpoint abaixo:
</h3>
<p>
{host}GET/products -> Devolve a lista de todos os produtos cadastrados no banco de dados.</br></br>
{host}GET/products /{id} -> Devolve o produto cadastrado no banco de dados referente ao “id” escrito na requisição.</br></br>
{host}GET/categories -> Devolve a lista de todas as categorias cadastradas no banco de dados.</br></br>
{host}GET/categories /{id} -> Devolve a categoria cadastrada no banco de dados referente ao “id” escrito na requisição.</br></br>
{host}GET/users -> Devolve a lista de todos os usuários cadastrados no banco de dados.</br></br>
{host}GET/users /{id} -> Devolve o usuário cadastrado no banco de dados referente ao “id” escrito na requisição.</br></br>
{host}POST/ users  -> Cadastra um novo usuário no banco de dados. Exemplo de corpo da requisição:</br>
{ "name": "Maria Brown", "email": "maria@gmail.com","phone": "988888888","password": "123456"}</br></br>
{host}PUT/ users /{id} -> Atualiza os dados do usuário no banco de dados referente ao “id” escrito na requisição.</br>
{"name": "Alex Green", "email": "alex@gmail.com", "phone": "977777777","password": "123456"}</br></br>
{host}DELETE/ users /{id} ->Deleta o dados do usuário no banco de dados referente ao “id” escrito na requisição. Não possui corpo na requisição.</br></br>
{host}GET/orders -> Devolve a lista de todos os pedidos cadastrados no banco de dados.</br></br>
{host}GET/orders /{id} -> Devolve o pedido cadastrado no banco de dados referente ao “id” escrito</br></br>
</p>
