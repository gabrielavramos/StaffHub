

# StaffHub API Documentation

## Funcionário Endpoints

### Listar Funcionários
```http
GET /api/funcionarios
```
**Response:** Lista de funcionários com seus dados básicos
- `200 OK`: Array de objetos Funcionario
```json
[
  {
    "id": 1,
    "nomeCompleto": "string",
    "email": "string",
    "cargo": "string",
    "dataAdmissao": "YYYY-MM-DD"
  }
]
```

### Buscar Funcionário
```http
GET /api/funcionarios/{id}
```
**Parameters:**
- `id`: ID do funcionário (path parameter)

**Response:**
- `200 OK`: Objeto Funcionario
- `404 Not Found`: Funcionário não encontrado

### Criar Funcionário
```http
POST /api/funcionarios
```
**Request Body:**
```json
{
  "nomeCompleto": "string",
  "email": "string",
  "senha": "string",
  "cargo": "string",
  "dataAdmissao": "YYYY-MM-DD"
}
```
**Response:**
- `201 Created`: Funcionário criado
- `400 Bad Request`: Dados inválidos

### Atualizar Funcionário
```http
PUT /api/funcionarios/{id}
```
**Parameters:**
- `id`: ID do funcionário (path parameter)

**Request Body:** Mesmo formato do POST

**Response:**
- `200 OK`: Funcionário atualizado
- `404 Not Found`: Funcionário não encontrado

### Deletar Funcionário
```http
DELETE /api/funcionarios/{id}
```
**Parameters:**
- `id`: ID do funcionário (path parameter)

**Response:**
- `204 No Content`: Funcionário removido
- `404 Not Found`: Funcionário não encontrado

## Benefício Endpoints

### Listar Benefícios
```http
GET /api/beneficios
```
**Response:** Lista de benefícios
```json
[
  {
    "id": 1,
    "nome": "string",
    "descricao": "string",
    "valorMensal": 0.00
  }
]
```

### Buscar Benefício
```http
GET /api/beneficios/{id}
```
**Response:**
- `200 OK`: Objeto Beneficio
- `404 Not Found`: Benefício não encontrado

### Criar Benefício
```http
POST /api/beneficios
```
**Request Body:**
```json
{
  "nome": "string",
  "descricao": "string",
  "valorMensal": 0.00
}
```

### Atualizar Benefício
```http
PUT /api/beneficios/{id}
```
**Parameters:**
- `id`: ID do benefício

### Deletar Benefício
```http
DELETE /api/beneficios/{id}
```

## Férias Endpoints

### Listar Solicitações
```http
GET /api/ferias
```
**Response:** Lista de solicitações de férias
```json
[
  {
    "id": 1,
    "solicitante": { "id": 1 },
    "dataInicio": "YYYY-MM-DD",
    "dataFim": "YYYY-MM-DD",
    "status": "SOLICITADO|APROVADO|REPROVADO",
    "dataSolicitacao": "YYYY-MM-DD"
  }
]
```

### Solicitar Férias
```http
POST /api/ferias
```
**Request Body:**
```json
{
  "solicitante": { "id": 1 },
  "dataInicio": "YYYY-MM-DD",
  "dataFim": "YYYY-MM-DD"
}
```

### Atualizar Status
```http
PUT /api/ferias/{id}/status
```
**Request Body:**
```json
"APROVADO"
```

## Treinamento Endpoints

### Listar Treinamentos
```http
GET /api/treinamentos
```
**Response:** Lista de treinamentos
```json
[
  {
    "id": 1,
    "nome": "string",
    "descricao": "string",
    "dataHoraInicio": "YYYY-MM-DDTHH:mm:ss",
    "duracaoHoras": 0,
    "participantes": []
  }
]
```

### Criar Treinamento
```http
POST /api/treinamentos
```

### Atualizar Treinamento
```http
PUT /api/treinamentos/{id}
```

### Deletar Treinamento
```http
DELETE /api/treinamentos/{id}
```

## Holerite Endpoints

### Listar Holerites
```http
GET /api/holerites
```
**Response:** Lista de holerites
```json
[
  {
    "id": 1,
    "funcionario": { "id": 1 },
    "competencia": "YYYY-MM",
    "salarioBruto": 0.00,
    "totalDescontos": 0.00,
    "salarioLiquido": 0.00
  }
]
```

### Gerar Holerite
```http
POST /api/holerites
```

## Feedback Endpoints

### Listar Feedbacks
```http
GET /api/feedbacks
```
**Response:** Lista de feedbacks
```json
[
  {
    "id": 1,
    "autor": { "id": 1 },
    "destinatario": { "id": 2 },
    "texto": "string",
    "dataHora": "YYYY-MM-DDTHH:mm:ss"
  }
]
```

### Criar Feedback
```http
POST /api/feedbacks
```

## Atestado Endpoints

### Listar Atestados
```http
GET /api/atestados
```
**Response:** Lista de atestados
```json
[
  {
    "id": 1,
    "funcionario": { "id": 1 },
    "dataEnvio": "YYYY-MM-DD",
    "diasAfastado": 0,
    "status": "ENVIADO|DEFERIDO|INDEFERIDO"
  }
]
```

### Enviar Atestado
```http
POST /api/atestados
```

### Atualizar Status
```http
PUT /api/atestados/{id}/status
```
**Request Body:**
```json
"DEFERIDO"
```

## Códigos de Status

- `200 OK`: Requisição bem-sucedida
- `201 Created`: Recurso criado com sucesso
- `204 No Content`: Requisição bem-sucedida sem conteúdo de resposta
- `400 Bad Request`: Requisição inválida
- `401 Unauthorized`: Autenticação necessária
- `403 Forbidden`: Acesso negado
- `404 Not Found`: Recurso não encontrado
- `500 Internal Server Error`: Erro interno do servidor
```
