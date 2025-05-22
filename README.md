# GameCatalogApp

Aplicação desenvolvida em **Java** utilizando **Swing** para interface gráfica e **MySQL** como banco de dados. O sistema exibe uma tabela com informações sobre jogos cadastrados.

---

Banco de Dados (MySQL)

Como configurar no MySQL Workbench:

1. Abra o **MySQL Workbench**.
2. Clique na sua conexão (Local instance ou outra).
3. Abra uma nova aba de script (**File ➝ New SQL Tab**).
4. Cole e execute o script `database.sql` que acompanha este projeto.

Isso criará:
- O banco de dados chamado `catalogo_games`.
- A tabela `jogos` com os campos:
  - `id` (inteiro, chave primária, auto incremento)
  - `titulo` (texto, obrigatório)
  - `genero` (texto, obrigatório)
  - `desenvolvedora` (texto, obrigatório)
  - `data_lancamento` (data)
  - `data_cadastro` (timestamp automático)

Consultar dados:

Execute:
```sql
SELECT * FROM jogos;
