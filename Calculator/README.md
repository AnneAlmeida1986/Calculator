# Calculator

### HISTÓRICO DE ELABORAÇÃO
| **Data**     | **Versão**   | **Autor**                      | **Descrição da Alteração** |
|:------------:|:------------:|:------------------------------:|:--------------------------:|
| _19/12/2021_ | _01_         | _Anne Caroline Santos de Almeida_  | _Criação do documento_   |




### 1 Contexto
Este challenge tem como objectivo a avaliação de Java developers candidatos à WIT.Este challenge pretende avaliar
as capacidades dos candidatos em desenvolver uma tarefa num espaço de tempo definido.


### 2 Escopo
Desenvolvimento de uma REST API que disponibilize funcionalidades básicas de uma calculadora.


##### 3 Request

```bash
GET http://localhost:8086/calculator/*
```

##### 4 Response

200 - OK

{
  "result": 0
}



### 5. Swagger

```yaml
openapi: 3.0.1
info:
  title: OpenAPI definition
  version: v1
servers:
  - url: http://localhost:8086
    description: Generated server url
paths:
  /calculator/sum:
    get:
      tags:
        - calculator-controller
      operationId: sum
      parameters:
        - name: n1
          in: query
          required: true
          schema:
            type: number
            format: double
        - name: n2
          in: query
          required: true
          schema:
            type: number
            format: double
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Result'
  /calculator/subtraction:
    get:
      tags:
        - calculator-controller
      operationId: subtraction
      parameters:
        - name: n1
          in: query
          required: true
          schema:
            type: number
            format: double
        - name: n2
          in: query
          required: true
          schema:
            type: number
            format: double
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Result'
  /calculator/multiplication:
    get:
      tags:
        - calculator-controller
      operationId: multiplication
      parameters:
        - name: n1
          in: query
          required: true
          schema:
            type: number
            format: double
        - name: n2
          in: query
          required: true
          schema:
            type: number
            format: double
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Result'
  /calculator/division:
    get:
      tags:
        - calculator-controller
      operationId: division
      parameters:
        - name: n1
          in: query
          required: true
          schema:
            type: number
            format: double
        - name: n2
          in: query
          required: true
          schema:
            type: number
            format: double
      responses:
        '200':
          description: OK
          content:
            application/json:
              schema:
                $ref: '#/components/schemas/Result'
components:
  schemas:
    Result:
      type: object
      properties:
        result:
          type: number
          format: double

```
