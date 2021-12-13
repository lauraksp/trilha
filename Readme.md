# Desafio 01.

**Respostas :** ✍

A) Com o versionamento é possível termos controle sobre tudo que foi criado, alterado ou excluído de determinadas branches. Às vezes commitamos algo que não era pra ser enviado e podemos fazer a exclusão daquele commit, ou quando alteramos algo e outra pessoa precisa de acesso ao que foi alterado, basta acessar a branch e dar pull. Caso tenha algum problema no código também é possível identificar quem fez aquela alteração, é utilizado também pra saber o que de novo foi implementado e o que foi excluído.

B) 
   - -> Relatório de alterações, mesmo que a longo prazo.
   - -> Ramificação e mescla.
   - -> Rastreamento de alteração.
   - -> Organização.
   - -> Colaboração do time.

C) Git, subversion e mercurial.

```bash
  $ git clone https://github.com/lauraksp/trilhaBackEnd

  $ cd trilhaBackEnd
```

## Conceitos de POO.

- Abstração > classe geral p criar objetos reais, utilizadas como superclasses p subclasses concretas, declara atributos e comportamentos comuns das várias classes em uma hierarquia, tem um ou mais métodos abstratos.

- Herança > utilização de uma classe base, fazendo com que uma nova classe tenha todos os atributos e funções da classe pai, mais as suas próprias. 

- Encapsulamento > possibilidade de proteger alguns dados ou funcionalidades da classe, não permitindo que seus consumidores possam acessá-la. 

- Polimorfismo  > pode ser criado funções que terão os mesmos nomes, mas que podem ter diferentes processamentos, implementações, ou na mesma classe o mesmo nome e diferentes entradas. Capacidade de referenciar objetos construídos por classes específicas como objeto de uma classe genérica, desde que essa classe genérica respeite a hierarquia em questão. 

a) Na programação orientada a objetos os programadores devem pensar de forma isolada, pois existe uma separação entre os pilares, que são abstração, herança e encapsulamento. 
  Existem as classes que dão vida ao objeto e dentro delas que são criadas as funcionalidades e podem ser aplicadas métodos e atributos. 
  Ao desenvolver um software todas essas informações são aplicadas de forma coerente para que o software atenda aos requisitos do cliente.

b) O cenário de abstração é a classe de onde você vai absorver as informações. 
  - Exemplo : Em um cadastro de dados => Classe Pessoa > nome, cpf e endereço.

c) No encapsulamento é feito a proteção de algum dado ou funcionalidade dentro da classe. 
  - Exemplo : Carro => Ao pisar no pedal de um carro (como objeto), o cliente não precisa saber que será consumido mais gasolina para dar mais velocidad ao carro. 
  O cliente apenas precisa saber que ao pisar no acelerado o carro vai acelerar.

d) A herança permite criar uma nova classe a partir de uma que já existe.
  - Exemplo : Classe Animal (pai).
  - Ave (filho).

Ficaria então : public class Animal implements Ave {};

e) No polimorfismo pode ser criado funções que terão os mesmos nomes, mas que podem ter diferentes processamentos, implementações, ou na mesma classe o mesmo nome e diferentes entradas. Capacidade de referenciar objetos construídos por classes específicas como objeto de uma classe genérica, desde que essa classe genérica respeite a hierarquia em questão. 
  - Exemplo : 
    - Animal objAnimal = new Gato();
    - Animal objAnimal = new Cachorro();

Aqui a variável objAnimal recebe tanto o objeto gato, quanto o cachorro.

f)
 - É mais rápido p programar;
 - São mais fáceis depurar;
 - Para criar grandes programas, é mais simples;
 - São mais fáceis de ler e entender;
 - São mais fáceis de dar manutenção e manter. 

# Desafio 03.
O HTTP é um protocolo de transferência que quando o usuário insere a URL do site na WEB ele consegue ver os dados
que nele existem (o site em si).
Todo navegador de internet é um cliente HTTP que recebe(request) e envia(response) as requisições ao servidor, ou seja, quando o usuário acessa um site, ele está fazendo uma requisição HTTP na web.

Rest é a arquitetura do conjunto de princípios da arquitetura de sistemas.
O HTTP é o caminho mais conhecido p/ transferir dados, ele permite que seja criado
os métodos post, put, get, executar e deletar - no servidor - . Sendo assim, a maioria
das Rest APIs utilizam o HTTP como protocolo de comunicação oficial.

Uma Web API é uma interface de programação de aplicações tanto para um servidor quanto um navegador. É utilizada para se conseguir recuperar somente o valor necessitado num banco de dados de um site.
Temos os métodos HTTP que podemos utilizar p/ fazer as requisições, e então ao solicitar tal método, ele busca essas infos no banco e nos dá o retorno que precisamos.

GET- O método GET solicita a representação de um recurso específico. Requisições utilizando o método GET devem retornar apenas dados.

HEAD - O método HEAD solicita uma resposta de forma idêntica ao método GET, porém sem conter o corpo da resposta.

POST - O método POST é utilizado para submeter uma entidade a um recurso específico, frequentemente causando uma mudança no estado do recurso ou efeitos colaterais no servidor.

PUT - O método PUT substitui todas as atuais representações do recurso de destino pela carga de dados da requisição.

DELETE - O método DELETE remove um recurso específico.

CONNECT - O método CONNECT estabelece um túnel para o servidor identificado pelo recurso de destino.

OPTIONS - O método OPTIONS é usado para descrever as opções de comunicação com o recurso de destino.

TRACE - O método TRACE executa um teste de chamada loop-back junto com o caminho para o recurso de destino.

PATCH - O método PATCH é utilizado para aplicar modificações parciais em um recurso.





 




